package archivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Archivo<T> {

    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            if (!archivo.exists()) {
                FileOutputStream salida = new FileOutputStream(archivo);
                salida.close();
                System.out.println("Se ha creado el archivo " + nombreArchivo);
            } else {
                System.out.println("El archivo " + nombreArchivo + " ya existe");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void escribir(T objeto, String nombreArchivo) {
        FileOutputStream archivo = null;
        try {
            archivo = new FileOutputStream(nombreArchivo, true);
            ObjectOutputStream archivoSalida = new ObjectOutputStream(archivo);
            archivoSalida.writeObject(objeto);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                archivo.close();
                System.out.println("Se ha escrito informacion al archivo " + nombreArchivo);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<T> leer(String nombreArchivo) {
        ArrayList<T> objetos = new ArrayList<>();
        FileInputStream archivo = null;
        try {
            archivo = new FileInputStream(nombreArchivo);
            ObjectInputStream archivoEntrada;
            while (archivo.available() > 0) {
                archivoEntrada = new ObjectInputStream(archivo);
                objetos.add((T) archivoEntrada.readObject());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                archivo.close();
                System.out.println("Se ha leido informacion del archivo " + nombreArchivo);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return objetos;
    }

    public T leerObjeto(String nombreArchivo) {
        T objeto = null;
        FileInputStream archivo = null;
        try {
            archivo = new FileInputStream(nombreArchivo);
            ObjectInputStream archivoEntrada = new ObjectInputStream(archivo);
            objeto = (T) archivoEntrada.readObject();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                archivo.close();
                System.out.println("Se ha leido informacion del archivo " + nombreArchivo);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return objeto;
    }

    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se ha borrado el archivo " + nombreArchivo);
        }
    }

    public void eliminar(String nombreArchivo, int i) {
        ArrayList<T> objetos = leer(nombreArchivo);

        objetos.remove(i);

        borrar(nombreArchivo);
        crear(nombreArchivo);

        for (int j = 0; j < objetos.size(); j++) {
            escribir(objetos.get(j), nombreArchivo);
        }
    }
}

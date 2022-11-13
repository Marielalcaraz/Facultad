package P1_Facultad;

import java.util.Collections;
import java.util.LinkedList;

public class Materia implements Informacion {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    //14. Los constructores de todas las clases deben inicializar o cargar cada uno de los atributos que posee.
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    //7. Agregar estudiantes a una materia:
    public void agregarEstudiante(Estudiante estudiante){
        this.coleccionEstudiantes.add(estudiante);
    }

    //8. Eliminar estudiante de una materia:
    public void eliminarEstudiante(int legajo){
        boolean encontro = false;
        for (Estudiante estudiante: coleccionEstudiantes){
            if (estudiante.getLegajo() == legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
                break;

            }
        }
            if (encontro){
                System.out.println("El estudiante ha sido eliminado.");
            } else  {
                System.out.println("Estudiante no encontrado.");
            }
        }



    //12. El método listarContenidos() de la interface Información lista los elementos de la clase contenida,
    // es decir que de la clase Facultad se listará las Carreras, de la clase Carreras las materias, etc.
    // Siempre en orden alfabético.
    @Override
    public void listarContenidos() {
        String contenido = "";

        for (int i=0;i<this.coleccionEstudiantes.size();i++){

            contenido += this.coleccionEstudiantes.get(i).getNombre() + " - ";
        }
        System.out.println(contenido);
    }

    /*13. El método verCantidad() de la interface Información muestra la cantidad de elementos que contiene,
    es decir que en el caso de la clase Carreras, devolverá la cantidad de materias que posee,
    en el caso de la clase Materias, la cantidad de estudiantes que tienen, etc.*/
    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    //15. Todas las clases deben tener los métodos toString() para ver todos los datos de la clase
    // y los métodos geters y seter por cada una de sus atributos.
    @Override
    public String toString(){
        return "INFORMACION DE LA MATERIA" + "\nMateria: "+ nombre +
                "\nTitular " + titular + "\n";
    }
    public void listarEstudiantes(){
        System.out.println("LISTA DE ESTUDIANTES");
        for (Estudiante estudiante: coleccionEstudiantes){
            System.out.println(estudiante.toString());
        }
    }



    }


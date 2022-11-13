package P1_Facultad;

import java.util.LinkedList;

public class Facultad implements Informacion{
    private String nombre;
    private LinkedList<Carrera> coleccionCarreras;
    private LinkedList<Estudiante> coleccionEstudiantes;

    //14. Los constructores de todas las clases deben inicializar o cargar cada uno de los atributos que posee.
    public Facultad(String nombre){
        this.nombre = nombre;
        this.coleccionCarreras = new LinkedList<Carrera>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccionCarreras(LinkedList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void setColeccionEstudiantes(LinkedList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public LinkedList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    //1. Agregar Carreras a una Facultad:
    public void agregarCarrera(Carrera carreraNueva){
        this.coleccionCarreras.add(carreraNueva);
    }

    //2. Eliminar Carreras de la facultad.
    public boolean eliminarCarrera(String nombreCarrera){
        boolean encontro = false;
        for (Carrera carrera: coleccionCarreras){
            if (carrera.getNombre().equals(nombreCarrera)){
                coleccionCarreras.remove(carrera);
                encontro = true;
                break;
            }
        }
        return encontro;
    }

    //3. Eliminar Estudiantes de una facultad implica que se elimine el estudiante de
    // cada una de las materiasa las cuales se inscribió.
    public void eliminarEstudiante(int legajo){
        boolean encontro = false;
        for (Estudiante estudiante: coleccionEstudiantes){
            if (estudiante.getLegajo() == legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
                break;
            }if (encontro){
                System.out.println("El estudiante ha sido eliminado.");
            } else {
                System.out.println("Estudiante no encontrado.");
            }
        }
    }

    /*12. El método listarContenidos() de la interface Información lista los elementos de la clase contenida,
    es decir que de la clase Facultad se listará las Carreras, de la clase Carreras las materias, etc.
    Siempre en orden alfabético.*/

    @Override
    public void listarContenidos() {
        System.out.println("LISTA DE CARRERAS");
        for (Carrera carrera: coleccionCarreras){
            System.out.println(carrera.toString());
        }

    }

        /*String contenido = "";
        for (int i=0;i<this.coleccionCarreras.size();i++){
            contenido += this.coleccionCarreras.get(i).getNombre() + " - ";
        }
        return contenido;
    }*/


    /*13. El método verCantidad() de la interface Información muestra la cantidad de elementos que contiene,
    es decir que en el caso de la clase Carreras, devolverá la cantidad de materias que posee,
    en el caso de la clase Materias, la cantidad de estudiantes que tienen, etc.*/
    @Override
    public int verCantidad() {
        return (coleccionCarreras.size());
    }

    //15. Todas las clases deben tener los métodos toString() para ver todos los datos de la clase
    // y los métodos geters y seter por cada una de sus atributos.

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "coleccionCarreras: " + coleccionCarreras + "\n"+
                "coleccionEstudiantes: " + coleccionEstudiantes;
    }
}

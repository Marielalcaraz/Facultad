package P1_Facultad;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Carrera implements Informacion {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

//14. Los constructores de todas las clases deben inicializar o cargar cada uno de los atributos que posee.
    public Carrera(String nombre){
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<Materia>();
    }

    //4. Agregar materias a una Carrera.
    public void agregarMaterias(Materia materia){
        coleccionMaterias.add(materia);
    }

    //5. Eliminar materias a una Carrera:

    public boolean eliminarMateria(String nombreMateria){
        boolean encontro = false;
        for (Materia materias: coleccionMaterias){
            if (materias.getNombre().equals(nombreMateria)){
                coleccionMaterias.remove(nombreMateria);
                encontro = true;
                break;
            }
        }
        return encontro;
    }

    //6. Encontrar materias de una carrera en particular indicando el nombre de la materia.
    // Si la materia existe nos deberá preguntar si deseamos eliminar.
    public void encontrarMateria(String nombreMateria){
        Iterator<Materia> iterador = this.coleccionMaterias.iterator();  //objeto iterator que almacena lo que el método devuelva
        Scanner sc = new Scanner(System.in);
        while (iterador.hasNext()){//mientras exista un siguiente elemento
            String materia = iterador.next().getNombre();  //lo que vaya examinando, se almacena en materia.
            if (materia == nombreMateria){
                try {
                    System.out.println("Materia encontrada, ¿Desea eliminar la materia?\n"+    /*16. Todos los lugares que signifiquen el ingreso de datos deberán
                                                                                                  establecer controles por posibles ingresos erróneos de datos.*/
                    "1.Si\n "+
                        " 2.No");
                    int opcion = sc.nextInt();
                    //opcion.toLowerCase();
                    if(opcion == 1){
                        this.eliminarMateria(nombreMateria);
                        System.out.println("La materia "+nombreMateria+" ha sido eliminada");
                    }else if(opcion == 2){
                        return;
                    }else{
                        System.out.println("Ingrese solamente las opciones 1 o 2");
                    }
                }
                catch (Exception e){
                    System.out.println("No existe la opción.");
                }

            }

        }
        System.out.println("La materia buscada no existe.");
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "coleccionMaterias: " + coleccionMaterias;
    }

    public String getNombre(){
        return nombre;
    }

    //12. El método listarContenidos() de la interface Información lista los elementos de la clase contenida,
    // es decir que de la clase Facultad se listará las Carreras, de la clase Carreras las materias, etc.
    // Siempre en orden alfabético.
    @Override
    public void listarContenidos() {
        String contenido = "";
        for (int i=0;i<this.coleccionMaterias.size();i++){
            contenido += this.coleccionMaterias.get(i).getNombre() + " - ";
        }
        System.out.println(contenido);
    }

    //13. El método verCantidad() de la interface Información muestra la cantidad de elementos que contiene,
    // es decir que en el caso de la clase Carreras, devolverá la cantidad de materias que posee,
    // en el caso de la clase Materias, la cantidad de estudiantes que tienen, etc.
    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }



    //15. Todas las clases deben tener los métodos toString() para ver todos los datos de la clase
    // y los métodos geters y seter por cada una de sus atributos.
    //@Override
    /*public String toString(){
        return nombre;
    }*/

}


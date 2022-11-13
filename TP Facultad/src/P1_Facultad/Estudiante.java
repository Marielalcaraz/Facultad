package P1_Facultad;

public class Estudiante extends Persona{

    //14. Los constructores de todas las clases deben inicializar o cargar cada uno de los atributos que posee.
    public Estudiante(String nombre, String apellido, int legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }

//15. Todas las clases deben tener los métodos toString() para ver todos los datos de la clase
// y los métodos geters y seter por cada una de sus atributos.
    @Override
    public String toString(){
        return super.toString();
    }

    public void modificarDatos(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(legajo));
    }
}

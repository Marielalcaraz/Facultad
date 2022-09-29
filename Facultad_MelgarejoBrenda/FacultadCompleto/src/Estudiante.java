public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }


//metodos sets y gets no porque no tiene atributos/

    @Override
    public void modificarDatos(String nombre, String apellido, String legajo) {

    }

    @Override
    public String toString() {
        return "Estudiante: "+ super.toString();//Si no llamo a super no imprime

    }
}
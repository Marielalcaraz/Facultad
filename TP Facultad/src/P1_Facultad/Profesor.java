package P1_Facultad;

public class Profesor extends Persona{

    private double basico;
    private int antiguedad;
    private double sueldo;

    //14. Los constructores de todas las clases deben inicializar o cargar cada uno de los atributos que posee.

    public Profesor(String nombre, String apellido, double basico, int antiguedad) {
        super.setApellido(apellido);
        super.setNombre(nombre);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    //15. Todas las clases deben tener los métodos toString() para ver todos los datos de la clase
    // y los métodos geters y seter por cada una de sus atributos.
    @Override
    public String toString(){
        return "Profesor: "+super.toString();
    }

    //9. Modificar el Profesor de la materia.
    public void modificarDatos(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);

        try {
            super.setLegajo(Integer.parseInt(legajo));
        }catch (Exception e){
            System.out.println("Ha ocurrido un error! Los datos ingresados son invalidos.");
        }
    }

    //11. El método calcularSueldo() de la clase Profesores calcula el sueldo
    // sumando un 10% al básico por cada año de antiguedad.
    public double calcularSueldo(double basico, int antiguedad){//ver
        sueldo = basico + (antiguedad*0.10);
        System.out.println("Sueldo del profesor "+getNombre()+" es de $ "+ sueldo);
        return sueldo;
    }

}

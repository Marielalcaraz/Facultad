public class Materia implements IInformacion {
    private String nombre;
    private String titular; //??

    //collectionEstudiantes: Estudiantes [];

    public Materia(String nombre, String titular) {
        this.nombre = nombre;
        this.titular = titular;
    }


    //public void agregarEstudiante (Estudiantes:estudiante){

    //}

    public void eliminarEstudiante (String nombre){

    }

   // public void modificarTitular(Profesores:profesor){//¿?

    //}

    @Override
    public String toString() {
        return "Datos de la Materia " + " Nombre: " + nombre  + " Titular: " + titular;
    }

    @Override
    public int verCantidad() {//falta cuerpo
        return 0;
    }

    @Override
    public String listarContenido() {//falta cuerpo
        return null;
    }
}
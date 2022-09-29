public class Facultad implements IInformacion {

    private String nombre;
   // coleccion Carreras: Carreras

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

//Metodos get y set del nombre

//Metodo toString
// public void agregarCarrera(Carreras:carrera){
// }


    public void eliminarCarrera(String nombre) {
    }


    //public void eliminarEstudiante(Estudiante:estudiante) {
    //}

    @Override
    public int verCantidad() {//falta cuerpo
        return 0;
    }

    @Override
    public String listarContenido() {//falta cuerpo
        return null;
    }
}
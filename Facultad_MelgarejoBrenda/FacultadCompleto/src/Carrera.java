public class Carrera implements IInformacion{
    private String nombre;
//coleccionMateria: Materias

    public Carrera(String nombre) {//se incluye la colecciòn?
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }



       // public void agregarMateria(materia:Materias){
        //}


        public void eliminarMateria(String nombreMateria) {
        }


        public void encontrarMateria(String nombre) {
        }

    @Override
    public String toString() {
        return "Nombre de la Carrera: " + nombre + "";
    }

    @Override
    public int verCantidad() {
        return 0;
    }

    @Override
    public String listarContenido() {
        return null;
    }
}

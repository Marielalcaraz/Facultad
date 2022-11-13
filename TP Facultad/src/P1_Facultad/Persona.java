package P1_Facultad;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //15. Todas las clases deben tener los métodos toString() para ver todos los datos de la clase
    // y los métodos geters y seter por cada una de sus atributos.
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nLegajo: "+legajo+ "\n";
    }

    public abstract void modificarDatos(String nombre, String apellido, String legajo);
}

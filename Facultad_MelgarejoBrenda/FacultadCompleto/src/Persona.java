public abstract class  Persona {
    private String nombre;
    private String Apellido;
    private int legajo;

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        Apellido = apellido;
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getnombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;

    }
    public int getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "" + "Apellido: "+ Apellido + "" +"legajo: " + legajo;
    }

    public abstract void modificarDatos(String nombre, String apellido, String legajo);//falta

}
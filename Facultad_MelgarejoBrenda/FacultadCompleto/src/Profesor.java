public class Profesor extends Persona{

    private double basico;
    private int antiguedad;
    private double sueldo;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad, double sueldo) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getBasico() {
        return basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void modificarDatos(String nombre, String apellido, String legajo) {//falta

    }

    @Override
    public String toString() {
        return "Profesor: " + " Basico: " + basico + "Antiguedad: " + antiguedad + " sueldo: " + sueldo;
    }

    public double calcularSueldo(double basico, int antiguedad){//ver
        sueldo = basico + (antiguedad*0.1);
        return sueldo ;
    }
}


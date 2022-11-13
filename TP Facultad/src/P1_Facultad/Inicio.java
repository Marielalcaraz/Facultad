package P1_Facultad;

public class Inicio {
    public static void main(String[] args) {

        Facultad UTN = new Facultad("UTN-FRRE");
        Facultad UNNE = new Facultad("UNNE-Ciencias Económicas");

        Carrera isi = new Carrera("ISI");
        Carrera tup = new Carrera("TUP");
        Carrera mec = new Carrera("TUM");

//1. Agregar Carreras a una Facultad:
        UTN.agregarCarrera(isi);
        UTN.agregarCarrera(tup);
        UTN.agregarCarrera(mec);
        UTN.listarContenidos();

        UTN.verCantidad();


// 2.Eliminar Carreras de la facultad.
        UTN.eliminarCarrera("ISI");

       Profesor Facundo = new Profesor("Facundo", "Uferer", 150.000, 6);
        Profesor Yolanda = new Profesor("Yolanda", "Acosta", 150.000, 16);
//4. Agregar materias a una Carrera.
        Materia Lab2 = new Materia("Laboratorio de Computacion 2", Facundo);
        tup.agregarMaterias(Lab2);
        Materia Electronica = new Materia("Electronica I", Facundo);
        Materia Mate1 = new Materia("Matematicas", Yolanda);
        mec.agregarMaterias(Electronica);
        mec.agregarMaterias(Mate1);
        tup.agregarMaterias(Mate1);
        tup.verCantidad();

//5. Eliminar materias a una Carrera:
mec.eliminarMateria("Electronica I");
//UTN.listarContenidos();

        Estudiante alumno1 = new Estudiante("Maria", "Alvarez", 123);
        Estudiante alumno2 = new Estudiante("Luna", "Coronel", 345);
        Estudiante alumno3= new Estudiante("Celeste", "Quelecueste", 678);
        Estudiante alumno4 = new Estudiante("Agustin", "Bartolo", 8910);

//7.Agregar Estudiantes a una Materia.
        Lab2.agregarEstudiante(alumno1);
        Lab2.agregarEstudiante(alumno2);
        Lab2.agregarEstudiante(alumno3);
        Lab2.agregarEstudiante(alumno4);
        Mate1.agregarEstudiante(alumno2);

       Lab2.listarEstudiantes();
       //Lab2.listarContenidos();

       System.out.println(Lab2.toString());

//3. Eliminar Estudiantes de una facultad implica que se elimine el estudiante de
// cada una de las materiasa las cuales se inscribió.
      //UTN.eliminarEstudiante(8910);


/*6.Encontrar materias de una carrera en particular indicando
el nombre de la materia. Si la materia existe nos deberá preguntar si deseamos eliminar. */

mec.encontrarMateria("Matematicas");

//8.Eliminar Estudiante de una Materia
  Mate1.eliminarEstudiante(345);

//9.Modificar el Profesor de la materia. ?
        Yolanda.modificarDatos("Carina", "Jovanovich", "2655");

/*11.El método calcularSueldo() de la clase Profesores calcula el sueldo sumando
un 10% al básico por cada año de antiguedad*/
        Yolanda.calcularSueldo(150000, 16);

    }
}

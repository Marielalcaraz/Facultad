class Main {

	public static void main (String args[]) {
		
		Facultad UtnFrre = new Facultad("UTN-FRR");
		Carrera isi = new Carrera("ISI");
		Carrera tup = new Carrera("TUP");
		Carrera iq = new Carrera("IQ");


		UtnFrre.agregarCarrera(isi);
		UtnFrre.agregarCarrera(tup);
		UtnFrre.agregarCarrera(iq);
		UtnFrre.mostrarCarreras();
		
		UtnFrre.eliminarCarrera("IQ");
		UtnFrre.mostrarCarreras();

	
		Profesor facundo = new Profesor("Facundo", "Uferer", "1234");


		Materia LaboratorioDeComputacion2 = new Materia("Laboratorio de Computacion 2", facundo);

		Estudiante carlitos = new Estudiante("Carlos", "García", "2345");
		Estudiante susanita = new Estudiante("Susana", "Diez de los Ríos", "3456");
		Estudiante anita = new Estudiante("Anabella", "Stanley", "4567");
		Estudiante pablito = new Estudiante("Pablo", "Stella", "5678");


		LaboratorioDeComputacion2.agregarEstudiante(carlitos);
		LaboratorioDeComputacion2.agregarEstudiante(susanita);
		LaboratorioDeComputacion2.agregarEstudiante(anita);
		LaboratorioDeComputacion2.agregarEstudiante(pablito);

		LaboratorioDeComputacion2.listarEstudiantes();


		System.out.println(LaboratorioDeComputacion2.toString());


		LaboratorioDeComputacion2.eliminarEstudiante(3456);
		LaboratorioDeComputacion2.listarEstudiantes();

		facundo.modificarDatos("Carlos", "Uferer", "asdfasdfad");
	}

}

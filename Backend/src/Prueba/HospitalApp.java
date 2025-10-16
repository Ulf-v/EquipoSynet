package Prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalApp {
//	private ArrayList<Paciente> paciente;
	private ArrayList<Sintoma> sintoma;

	public HospitalApp(ArrayList<Sintoma> sintoma) {
//		this.paciente = new ArrayList<Paciente>();
		this.sintoma = new ArrayList<Sintoma>();
	}

	public HospitalApp() {
//		this.paciente = new ArrayList<Paciente>();
		this.sintoma = new ArrayList<Sintoma>();
	}

//	public ArrayList<Paciente> getPaciente() {
//		return paciente;
//	}
//
//	public void setPaciente(ArrayList<Paciente> paciente) {
//		this.paciente = paciente;
//	}

	public ArrayList<Sintoma> getSintoma() {
		return sintoma;
	}

	public void setSintoma(ArrayList<Sintoma> sintoma) {
		this.sintoma = sintoma;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String sintoma;
		HospitalApp app = new HospitalApp();
//		app.cargarPaciente();
		app.cargarSintoma();
		System.out.println("Dime tu nombre completo:");
		nombre = sc.nextLine();
		System.out.println("Dime tu sintoma:");
		sintoma = sc.nextLine();
		try (PrintWriter writer = new PrintWriter(
				new FileWriter("Diagnostico" + nombre.trim().replace(" ", "") + ".csv"))) {
			for (Sintoma s : app.sintoma) {
				if (sintoma.equals(s.getNombre())) {
//						writer.println(nombre);
					writer.println(s.getCodigo());
					writer.println(s.getEspecialidad());
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public void cargarPaciente() {
//		try {
//			 Scanner entrada=new Scanner(new File("./pacientes.csv"));
//			 String linea[];
//			 String cadena="";
//			 
//			 cadena=entrada.nextLine();
//			 while(entrada.hasNext()) {
//				 cadena=entrada.nextLine();
//				 //System.out.println(cadena);
//				 linea=cadena.split(",");
//				 //System.out.println(linea[0]+""+linea[1]+""+linea[2]);
//				 //añadir if para identificar los pedidos con su codigo
////				 if(!linea[0].equals("")) {
////					 System.out.println("existe el id"+linea.length);
////				 }
//				 paciente.add(new Paciente(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]),linea[3]));
//
//			 }
//			 
//		 }catch(FileNotFoundException e){
//			 System.out.println("No existe");
//			 e.printStackTrace();
//		 }
//	}

	public void cargarSintoma() {
		try {
			Scanner entrada = new Scanner(new File("./sintomas.csv"));
			String linea[];
			String cadena = "";

			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				// System.out.println(cadena);
				linea = cadena.split(",");
				// System.out.println(linea[0]+""+linea[1]+""+linea[2]);
				// añadir if para identificar los pedidos con su codigo
//				 if(!linea[0].equals("")) {
//					 System.out.println("existe el id"+linea.length);
//				 }
				sintoma.add(new Sintoma(linea[0], linea[1], linea[2], linea[3]));

			}

		} catch (FileNotFoundException e) {
			System.out.println("No existe");
			e.printStackTrace();
		}

	}

}
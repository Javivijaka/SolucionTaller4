/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tcs.tallerListas;

import com.tcs.tallerListas.beans.Estudiante;
import org.checkerframework.checker.units.qual.C;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class IngresoEstudiantes {

	public static void main(String[] args) throws IOException {

		List<Estudiante> Colegio = new ArrayList();
		List<Estudiante> Jardin = new ArrayList();
		List<Estudiante> Primero = new ArrayList();
		List<Estudiante> Segundo = new ArrayList();
		List<Estudiante> Tercero = new ArrayList();
		List<Estudiante> Cuarto = new ArrayList();
		List<Estudiante> Quinto = new ArrayList();
		List<Estudiante> Repiten = new ArrayList();
		int value= 0;
		int value1 =0;

		System.out.println("################ Ingreso de estudiantes ################");
		
		try {
			Scanner data = new Scanner(new File("src/main/resources/data.txt"));

			while (data.hasNextLine()) {

				Estudiante estudiante = new Estudiante();

				String[] estData = data.nextLine().split(",");
				estudiante.setIdestudiante(estData[0]);
				estudiante.setNombre(estData[1]);
				estudiante.setEdad(estData[2]);
				estudiante.setGrado(estData[3]);
				Colegio.add(estudiante);

				//Imprimimos los estudiantes entre los 6 y 10 anos de edad
				if(estudiante.getEdad().equals("6") || estudiante.getEdad().equals("7") || estudiante.getEdad().equals("8")
						|| estudiante.getEdad().equals("9") || estudiante.getEdad().equals("10")) {
					System.out.println(estudiante.getNombre() + " "+ "esta entre los 6 y 10 anos");
				}

				//Separamos los estudiantes en listas por grado e imprimimos
				if (estudiante.getGrado().equals("Jardin")){
					estudiante.setIdestudiante(estData[0]);
					estudiante.setNombre(estData[1]);
					estudiante.setEdad(estData[2]);
					estudiante.setGrado(estData[3]);
					Jardin.add(estudiante);
				}if (estudiante.getGrado().equals("Primero")){
					estudiante.setIdestudiante(estData[0]);
					estudiante.setNombre(estData[1]);
					estudiante.setEdad(estData[2]);
					estudiante.setGrado(estData[3]);
					Primero.add(estudiante);
				}if (estudiante.getGrado().equals("Segundo")){
					estudiante.setIdestudiante(estData[0]);
					estudiante.setNombre(estData[1]);
					estudiante.setEdad(estData[2]);
					estudiante.setGrado(estData[3]);
					Segundo.add(estudiante);
				}if (estudiante.getGrado().equals("Tercero")){
					estudiante.setIdestudiante(estData[0]);
					estudiante.setNombre(estData[1]);
					estudiante.setEdad(estData[2]);
					estudiante.setGrado(estData[3]);
					Tercero.add(estudiante);
				}if (estudiante.getGrado().equals("Cuarto")){
					estudiante.setIdestudiante(estData[0]);
					estudiante.setNombre(estData[1]);
					estudiante.setEdad(estData[2]);
					estudiante.setGrado(estData[3]);
					Cuarto.add(estudiante);
				}if (estudiante.getGrado().equals("Quinto")){
					estudiante.setIdestudiante(estData[0]);
					estudiante.setNombre(estData[1]);
					estudiante.setEdad(estData[2]);
					estudiante.setGrado(estData[3]);
					Quinto.add(estudiante);
				}

				//Imprimimos los estudiantes cuya identificación empiece con TI
				if(estudiante.getIdestudiante().contains("TI")){
					System.out.println("Estudiante con grado TI"+" edad: " + estudiante.getEdad()+ " y grado: "+ estudiante.getGrado());
				}

				value ++;
			}
		} catch (FileNotFoundException e) {
			//Personalizamos el mensaje de error en caso de que falle la lectura del archivo
			System.out.println("El archivo a leer no se encuentra en la ruta" + e.getMessage());
		}

		//Imprimimos el numero total de estudiantes
		System.out.println(value);

		//Numero de estudiantes entre los 6 y 10 anos de edad
		System.out.println(value1);

		//Imprimimos la lista de estudiantes por grado
		System.out.println("Alumnos de Jardin" + " " + Jardin + "\n");
		System.out.println("Alumnos de Primero" + " " + Primero + "\n");
		System.out.println("Alumnos de Segundo" + " " + Segundo + "\n");
		System.out.println("Alumnos de Tercero" + " " + Tercero + "\n");
		System.out.println("Alumnos de Cuarto" + " " + Cuarto + "\n");
		System.out.println("Alumnos de Quinto" + " " + Quinto + "\n");


		//Estudiantes que repetiran el a#o
		FileWriter file = new FileWriter("src/main/resources/data.txt");
		for (int i=0;i<Colegio.size();i++){
			Estudiante repiten = new Estudiante();
			if(Colegio.get(i).getIdestudiante().contains("TI")){
				file.write(Colegio.get(i).getIdestudiante()+","+Colegio.get(i).getNombre()+","+
						Colegio.get(i).getEdad()+","+Colegio.get(i).getGrado()+","+"Repite" +"\n");
				repiten.setIdestudiante(Colegio.get(i).getIdestudiante());
				repiten.setNombre(Colegio.get(i).getNombre());
				repiten.setEdad(Colegio.get(i).getEdad());
				repiten.setGrado(Colegio.get(i).getGrado());
				Repiten.add(repiten);
			}else{
				file.write(Colegio.get(i).getIdestudiante()+","+Colegio.get(i).getNombre()+","+
						Colegio.get(i).getEdad()+","+Colegio.get(i).getGrado()+","+"No Repite"+"\n");
			}
		}
		file.close();

		//Alumnos que repiten grado
		System.out.println("Personas que repiten grado:");
		for (int i =0;i<Repiten.size();i++){
			System.out.println(Repiten.get(i).getNombre());
		}

	}
}

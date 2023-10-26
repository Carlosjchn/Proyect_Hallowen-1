package estructura;

 

import java.util.Scanner;

 

public class Defensa {

	public static void main(String args[]) {

		// Llamamos al Scanner

		Scanner sc=new Scanner(System.in);

		

		

		

		//declaramos variables

		String nombre;

		int hora,tiempo=0;

		

		//PEDIMOS EL NOMBRE PARA PERSONALIZARLO UN POCO

		System.out.println("Hola.¿Como te llamas?");

		nombre=sc.nextLine();

		

		

		//HACEMOS LA INTRO DEL JUEGO PARA MINIJUEGO DE  DEFENSA

		System.out.println("Encantado de hablar contigo "+ nombre+".");

		System.out.println("Es un poco precipitado pero necesitamos tu ayuda. Estabamos en una fiesta de Halloween celebrada  "

				+ "\npor cesur cuando hemos descubierto un profesor muerto, intenamos averiguar quien ha podido ser. \nPor suerte "

				+ "contamos con un grupo del centro que puden ayudarnos pero necesitan entrevistar a las personas presentes");

		

		System.out.println("-Entrevistador: Buenas noches, antes que nada intentemos mantener la calma "

				+ "\nme gustaria hablar contigo un poco sobre esta noche, se sincero por favor.");

	

		

		

		do {

			System.out.println("¿A qué hora llegaste? (La fiesta terminó cuando apareció el cadaver)");

			hora=sc.nextInt();

			if(hora>=19) {

				System.out.println("No puedes llegar despues de terminar la fiesta");

			}

			

		}while(hora>=20 && hora!=19);

		

		

		System.out.println("El asesinato se produjo a las 19:00 de la tarde, tu llevas "+ tiempo+" horas aquí, \nseguimos con las preguntas "

				+ "seguimos con las preguntas.");

		

	

 

		

			

		

		

		

		

		

		

		

		

		//cerramos escaner

		sc.close();

	}

 

}
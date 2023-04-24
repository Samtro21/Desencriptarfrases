package Menu;
import java.util.Scanner;

import Calculos.Desencriptar;
import Calculos.Encriptar;
public class Menu {

	public static void main(String[] args) {
		System.out.println("Digite una frase");
		Scanner leertext=new Scanner(System.in);
		Scanner leernum=new Scanner(System.in);
		String frase= leertext.nextLine();
		String fraseen="";
		String frasedes="";
	
		System.out.println("Seleccione que metodo va a utilizar");
		System.out.println("Para el de samuel camargo digite 1");
		System.out.println("Para el de sergio digite 2");
		System.out.println("Para el de angela peña digite 3");
		System.out.println("Para el de manuel digite 4");
		System.out.println("Para el de selene digite 5");
		System.out.println("Para el de yimir digite 6");
		System.out.println("Para el de david digite 7");
		System.out.println("Para el de laura digite 8");
		int opcion =leernum.nextInt();
		
		
		final int SAMCAM=1;
		final int SERGIO=2;
		final int ANGELAP=3;
		final int MANUEL=4;
		final int SELENE=5;
		final int YIMIR=6;
		final int DAVID=7;
		final int LAURAC=8;
		switch(opcion){
			case SAMCAM:
					fraseen= Encriptar.SamuelCamargo(frase);
					System.out.println("La frase encriptada es "+fraseen);
					frasedes=Desencriptar.SamuelCamargo(fraseen);
					 System.out.println("La frase desencriptada es "+frasedes);
				break;
			
			case SERGIO:
				 fraseen= Encriptar.Sergio(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				break;
				
			case ANGELAP:
				 fraseen= Encriptar.AngelaPeña(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=Desencriptar.AngelaPeña(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;	
			
			case MANUEL:
				 fraseen= Encriptar.Manuel(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 
				break;
				
			case SELENE:
				 fraseen= Encriptar.Selene(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=Desencriptar.Selene(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case YIMIR:
				System.out.println("para iniciar la encriptacion unico y personalizado por favor ingrese su año de nacimiento");
				int año= leernum.nextInt();
				System.out.println("para continuar: ingrese su mes de nacimiento");
				int mes=leernum.nextInt();
				 fraseen= Encriptar.Yimir(frase, mes,año);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=Desencriptar.Yimir(fraseen,mes,año);
				 System.out.println("La frase desencriptada es "+frasedes);
				 
				break;
				
			case DAVID:
				 fraseen= Encriptar.DavidCruz(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 
				break;
				
			case LAURAC:
				 fraseen= Encriptar.Lauracampiño(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=Desencriptar.Lauracampiño(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
				
		}

	}

}

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
		int opcion =leernum.nextInt();
		
		
		final int SAMCAM=1;
		final int SERGIO=2;
		final int ANGELAP=3;
		switch(opcion){
			case SAMCAM:
					fraseen= Encriptar.SamuelCamargo(frase);
					System.out.println("La frase encriptada es "+fraseen);

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
			
		}

	}

}

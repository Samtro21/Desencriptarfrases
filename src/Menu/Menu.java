package Menu;
import java.util.Scanner;

import Calculos.Desencriptar;
import Calculos.Encriptar;
public class Menu {

	public static void main(String[] args) {
		System.out.println("Digite una frase");
		Scanner leertext=new Scanner(System.in);
		Scanner leernum=new Scanner(System.in);
		Scanner leerboo= new Scanner(System.in);
		String frase= leertext.nextLine();
		String fraseen="";
		String frasedes="";
	
		System.out.println("Seleccione que metodo va a utilizar");
		System.out.println("Para el de samuel camargo digite 1");
		System.out.println("Para el de sergio digite 2");
		System.out.println("Para el de angela peña digite 3");
		System.out.println("Para el de selene digite 4");
		System.out.println("Para el de yimir digite 5");
		System.out.println("Para el de david digite 6");
		System.out.println("Para el de laura campiño digite 7");
		System.out.println("Para el de nicol digite 8");
		System.out.println("Para el de samir digite 9");
		System.out.println("Para el de laura correa digite 10");
		System.out.println("Para el de elias digite 11");
		System.out.println("Para el de tomas digite 12");
		System.out.println("Para el de juan digite 13");
		System.out.println("Para el de Samuel Castro digite 14");
		int opcion =leernum.nextInt();
		
		
		final int SAMCAM=1;
		Encriptar samuelc=new Encriptar();
		Desencriptar samuelcd=new Desencriptar();
		final int SERGIO=2;
		Encriptar sergio=new Encriptar();
		Desencriptar sergiod=new Desencriptar();
		final int ANGELAP=3;
		Encriptar angelap=new Encriptar();
		Desencriptar angelapd=new Desencriptar();
		final int SELENE=4;
		Encriptar selene=new Encriptar();
		Desencriptar selened=new Desencriptar();
		final int YIMIR=5;
		Encriptar yimir=new Encriptar();
		Desencriptar yimird=new Desencriptar();
		final int DAVID=6;
		Encriptar david=new Encriptar();
		Desencriptar davidd=new Desencriptar();
		final int LAURAC=7;
		Encriptar lauracampiño=new Encriptar();
		Desencriptar lauracd=new Desencriptar();
		final int NICOL=8;
		Encriptar nicolcepeda=new Encriptar();
		Desencriptar nicold=new Desencriptar();
		final int SAMIR=9;
		Encriptar samir=new Encriptar();
		Desencriptar samird=new Desencriptar();
		final int LAURACO=10;
		Encriptar lauraco=new Encriptar();
		Desencriptar lauracod=new Desencriptar();
		final int ELIAS=11;
		Encriptar eliascamargo=new Encriptar();
		Desencriptar eliascamd=new Desencriptar();
		final int TOMAS=12;
		Encriptar tomasespinel=new Encriptar();
		Desencriptar tomasesd=new Desencriptar();
		final int JUANFU=13;
		Encriptar juanfuquene=new Encriptar();
		Desencriptar juanfud=new Desencriptar();
		final int SAMUELC=14;
		Encriptar samuelcas=new Encriptar();
		Desencriptar samuelcasd=new Desencriptar();
		
		switch(opcion){
			case SAMCAM:
					fraseen= samuelc.samuelcamargo(frase);
					System.out.println("La frase encriptada es "+fraseen);
					frasedes=samuelcd.samuelcamargo(fraseen);
					 System.out.println("La frase desencriptada es "+frasedes);
				break;
			
			case SERGIO:
				 fraseen= sergio.sergio(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=sergiod.sergio(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case ANGELAP:
				 fraseen= angelap.angelapeña(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=angelapd.angelapeña(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;	
				
			case SELENE:
				 fraseen= selene.selene(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=selened.selene(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case YIMIR:
				System.out.println("para iniciar la encriptacion unico y personalizado por favor ingrese su año de nacimiento");
				int año= leernum.nextInt();
				System.out.println("para continuar: ingrese su mes de nacimiento");
				int mes=leernum.nextInt();
				 fraseen= yimir.yimir(frase, mes,año);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=yimird.yimir(fraseen,mes,año);
				 System.out.println("La frase desencriptada es "+frasedes);
				 
				break;
				
			case DAVID:
				 fraseen= david.davidcruz(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=davidd.david(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case LAURAC:
				 fraseen= lauracampiño.lauracampiño(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=lauracd.lauracampiño(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
			case NICOL:
				 fraseen= nicolcepeda.nicolcepeda(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=nicold.nicol(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);

				break;
				
			case SAMIR:
				 fraseen= samir.samiryate(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=samird.samir(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
			case LAURACO:
				 fraseen= lauraco.lauracorrea(frase);
				 System.out.println("La frase encriptada es "+fraseen);
				 frasedes=lauracod.lauraco(fraseen);
				 System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case ELIAS:
				fraseen= eliascamargo.eliascamargo(frase);
				System.out.println("La frase encriptada es "+fraseen);
				frasedes=eliascamd.eliascam(fraseen);
				System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case TOMAS:
				System.out.println("Digite un numero");
				int numero=leernum.nextInt();
				System.out.println("Digite su desicion");
				boolean desicion=leerboo.nextBoolean();
				fraseen=tomasespinel.tomasespinel(frase,numero,desicion);
				System.out.println("La frase encriptada es "+fraseen);
				frasedes=tomasesd.tomases(fraseen,numero, desicion);
				System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case JUANFU:
				fraseen=juanfuquene.juanfuquene(frase);
				System.out.println("La frase encriptada es "+fraseen);
				frasedes=juanfud.juanfu(fraseen);
				System.out.println("La frase desencriptada es "+frasedes);
				break;
				
			case SAMUELC:
				fraseen=samuelcas.samuelcastro(frase);
				System.out.println("La frase encriptada es "+fraseen);
				frasedes=samuelcasd.samuelcastro(fraseen);
				System.out.println("La frase desencriptada es "+frasedes);
				break;

		}

	}

}



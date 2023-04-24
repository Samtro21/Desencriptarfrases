package Calculos;

import java.util.Scanner;

public class Encriptar {
	public static String SamuelCamargo(String frase) {
        String encriptarPalabra = ""; //se inicializa una varianle para contener el resultado

        
        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // se inicializa un vector para contener las letras del abecedario
        String[] deletreo = new String [frase.length()]; // se inicializa un vector para almacenar la palabra a encriptar
        for(int i=0; i<frase.length();i++){   // para i = 0 mientras i sea menor que el largo de la palabra i aumenta en 1
            
            deletreo[i] = frase.substring(i, 1+i); // se toma la palagra ingresada y se separa letra por letra

            
        }
        for(int j=0;j<deletreo.length;j++){  // para j = 0 mientras j sea menor que el largo del deletreo de la palabra aumentar j en 1
            String deletras = deletreo[j]; // se inicializa una variable que almacene el vector de deletreo
            
            
            for(int i=0; i<abecedario.length;i++){ // para i = o mientras i sea menor que 26 aumentar i en 1
                
                String letras = abecedario[i];  // se inicializa una variable que almacene las letras del abecedario
                int condicion = i - frase.length()*2;  /*se inicializa una variable que almacena las condiciones de encriptacion 
                                                    que es restar el numero de espacios del largo de la palabra y se multiplica ese valor en 2 */ 
            
                if(condicion<0){  // se crea una condicion para evitar que la encriptacion se desborde del abecedario

                    condicion=condicion+abecedario.length;
                }
                	if (deletras.contains(letras) == true ){ // se crea la condicion para encriptar la palabra
                        
                    encriptarPalabra = encriptarPalabra +  abecedario[condicion];
                    break;
                }
            }
        }
        return encriptarPalabra;   
    }
	public static String Sergio (String frase) {
		String[] vector={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		String resultado="";
		for(int i=0;i<frase.length();i++){//ciclo desde la primera letra hasta la ultima
			for(int x=0;x<vector.length;x++){//ciclo de a hasta z
				if(vector[x].equals(frase.substring(i,i+1))){//comprueba si la letra es igual a la posicion en el vector
					int y=x;
					for(int z=16;z>=1;z=z/2){//comprueba la cuatro potencias para cada letra
						System.out.println("-->"+(y/z));
						if(y/z>=1){//este ciclo prueba con las potencias de 2 y si es mayor que alguna de esta agrega un asterisco
							resultado+="*";
							y=y%z;//con esto al agregar un * le saca el modulo del valor de esa potencia 
						}else{
							resultado+=" ";//si no es divisible entonces me suma un espacio que es la opcion apagado
						}
						System.out.println(y);
					}
					resultado+="/";//separa cada letra 
					break;//acaba con el ciclo
				}
			}
		}


		return resultado;
	}
	
	public static String AngelaPeña (String frase){
        /*
         * Esta funcion recibe una palabra para encriptarla, primero toma la palabra ingresada y la vuelve al reves, luego toma la 
         * palabra al reves y segun la distancia que hay desde el inicio del abecedario hasta cada letra de la palabra, toma esa misma 
         * distancia desde el final del abecedario y genera una nueva posicion, finalmete toma en un vector de caracteres especiales
         * esta nueva posicion y lo que hay en ella lo mete dentro de una variable que va a ser la que retorna mi funcion
         */
        
        /*en el primer paso para encriptar tomo la palabra al reves 
        hago un ciclo que tome cada valor desde la longitud total de la palabra hasta 0*/

        String resultante1 = ""; //defino una variable tipo String donde voy a incluir la nueva palabra formada letra por letra
        int longitud_palabra = frase.length();//hallo la longitud de la palabra con .length para hacer un ciclo
        for(int contador = longitud_palabra; contador>0 ; contador--){ 
            //hago un ciclo que tome cada valor desde la longitud total de la palabra hasta 0
            String letra = frase.substring(contador-1, contador); //tomo cada letra de la palabra
            resultante1= resultante1 + letra; // agrego la letra en que va el ciclo a la variable de la palabra al revés
        }

        /*ahora defino un vector de caracteres especiales o signos que voy a utilizar para encriptar segun la posicion del abecedario.
        Este vector toma como base los numeros, son diferentes hasta 9 y luego son combinaciones*/
        String [] caracteres_diferentes = {"+", "*","-", "?","!", "~","#", "$","&", "%","*+", "**","*-", "*?","*!", "*~","*#", "*$","*&", "*%","-+", "-*","--", "-?","-!", "-~",};
        //defino en un vector el abecedario 
        String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
        String palabra_encriptada = "";  //defino una variable vacia, tipo string en la que voy a meter la palabra encriptada dentro del ciclo
        int longitud_palabra2 = resultante1.length();  //defino en una variable la longitud de la palabra resultante1
        
        //Recorro la palabra resultante1 tomando cada letra, para esto utilizo la longitud asignada a la anterior variable
        for (int posicion_letra = 1; posicion_letra<=longitud_palabra2; posicion_letra++){
            //en la variable letra_palabra voy tomando cada letra de la palabra ingresada
            String letra_palabra = resultante1.substring(posicion_letra-1,posicion_letra);
            
            //Dentro de este ciclo hacer otro ciclo anidado que recorra el vector 
            for( int posicion_vector = 0; posicion_vector<abecedario.length; posicion_vector ++){
                //comparo la letra en la que esta el ciclo de la palabra, con la letra que esta en el ciclo del arreglo de abecedario
                String letra_vector = abecedario[posicion_vector];

                
                //la funcion.equals compara strings. Si la letra de la palabra es igual a la letra del vector entra al condicional 
                if(letra_palabra.equals(letra_vector)){
                    /* tomo la posicion en que va el vector y la resto a la longitud del abecedario, este resultado lo asigno a una
                    nueva variable como la nueva posicion con la que se va a tomar la letra para la palabra resultante2*/
                    int nueva_posicion = (abecedario.length-1) - posicion_vector;
                    //tomo esa nueva posicion en el vector de caracteres especiales y la agrego a la palabra encriptada resultante
                    palabra_encriptada = palabra_encriptada + caracteres_diferentes[nueva_posicion]+" ";
                }
            }
        }
        //finalmente la funcion me retorna la palabra encriptada
        return(palabra_encriptada);
    }
	public static String Manuel (String frase){//problema
	        String palabraencriptar = frase;
	        String abc = "abcdefghijklmnopqrstuvwxyz";// uso el abcdario como una palabra, luego para comparar solo uso un substring que vaya letra por letra
	        String cuadrado = "";//la variable vacia es donde se va a almacenar la longitud de lado del cuadrado
	        String espacios = "             ";//los espacios los uso para separar cada cuadrado
	        String cuadradouno = ".............";//esta variable es para cuando la letra corresponda a la segunda mitad, para poder imprimir un cuadrado antes de imprimir el otro
	        int lonpalabra = palabraencriptar.length();
	        int lonabc = abc.length();
	        for (int i = 0; i<=lonpalabra-1; i++){//primer for que va a ir letra por letra en la palabra
	            String letraporletra = (palabraencriptar.substring(i, i+1)); 
	            for (int e = 0; e<lonabc; e++){// segundo for que va a ir letra por letra en el abcdario
	                String letras= (abc.substring(e, e+1));
	                if (letraporletra.equals(letras)){//cuando las letras que pasan por los for coincidan se cumple la condicion
	                        if (e <= 12){//esta primera condicion es donde me va a imprimir solo un cuadrado, esta va hasta la letra "m"
	                            while ( cuadrado.length() <= e){
	                                cuadrado = cuadrado + "."; /*
	                                * los puntos son para hacer los cuadrados, la cantidad de puntos en setido horizontal corresponde a la posicionde la letra en el
	                                * abcdario y en sentido vertical se lee segun si la letra pertenece a las 13 primeras o a las 13 segundas
	                                */
	                                }
	                            for (int c = 0; c<=e; c++){
	                                System.out.println(cuadrado); 
	                            }
	                        }
	                        if (e > 12){
	                            while ( cuadrado.length() <= e - 13){
	                                cuadrado = cuadrado + "."; /*
	                                * los puntos son para hacer los cuadrados, la cantidad de puntos en setido horizontal corresponde a la posicionde la letra en el
	                                * abcdario y en sentido vertical se lee segun si la letra pertenece a las 13 primeras o a las 13 segundas
	                                */
	                                }
	                            for (int c = 0; c<=e - 13; c++){//este for me va  a imprimir la altura de la piramide, correspondiente al lado o pues a la posicion de la letra
	                                System.out.println(cuadradouno + espacios + cuadrado);
	                            }
	                        }
	                
	                    
	                    System.out.println("____________________");//esto es para poder distinguir los cuadros que voy imprimiendo
	                    System.out.println(e+1); //esto sirve como una pista de la posicion que ocupa la letra impresa en el abcdario
	                }
	            }
	        }
	
	    String figurita = "";
	    figurita += "...\n...\n...";
        return "";
	}
	public static String Selene (String frase){//Problema
        /*esta función recibe una palabra para encriptarla, según la posición en el abecedario de la letra, se realizará
         * la sucesión de fibonnaci, y se arrojara el número resultante*/
		String palabraencr="";
        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};//array abecedario
        int large = frase.length();//largo de la palabra ingresada para hacer un ciclo
        for(int i=0; i<large; i++){//ciclo que recorre las letras de la palabra
            String letra = frase.substring(i, i+1);//substring que toma cada letra
            for(int j = 0; j<=26; j++ ){//ciclo que recorre el abecedario
                /*contadores que permiten realizar la sucesión de fibonnaci */
                int contadorUno=0;
                int contadorDos=1;
                int contadorTres=1;
                if(letra.equals(abecedario[j])){//cuando encuentre la letra en el abecedario
                    int posicion = j+1;//la posición de la letra +1 para q "a" no sea igual a 0
                    for(int x=0; x<posicion; x++){//for para sucesión de fibonacci
                        //el contadorUno representará el número anterior por el que se va a sumar luego, el contadorDos la suma ya hecha y el contadorTres la suma como tal
                        contadorDos=contadorTres;
                        contadorTres=contadorDos+contadorUno;
                        contadorUno=contadorDos;
                        while(contadorDos>abecedario.length) {
                        	contadorDos=contadorDos-abecedario.length;
                        }
                       
                    }palabraencr=palabraencr+abecedario[contadorDos];
                }
            }
        }

        return palabraencr;
        }
	
	public static String Yimir (String frase, int año, int mes) {
		/*
		* esta funcion recibe una palabra para encriptar a su vez recibe un año 
		* y un mes (prferiblemente año y ,es de nacimiento)que mediente operaciones matematicas basica
		* genera un numero personal, el cual sera el numero de veces que avanza  de la posicion original a la nueva posicion
		* s
		String palabra="";// recibe la palbra a encriptar
		int año=0;// recibe un valor numerico
		int mes=0;//recibe valor numerico
		/*
		 * array que contiene una palabra que inicia  por cada letra del abecedario
		 */
		String[] abc = {"array","bucle","cadena","definir","enlace","funcion","gato","hijo","incremento","java","kilo","lamento","matriz","nada","ñandu","operador","patron","quizz","raton","sistema","terminal","ubicacion","vida","wilslson","xilofon","yuca","zzz"};
		String palabra= frase;
		/*
		 * el siguiente proceso se hace para tener un numero personalizado depentienndo el año y mes de nacimiento
		 */
		int codigo=(año*mes)/(mes+(año/2));//genera un numero realizando operaciones matematicas basado en los datos recibidos 
		int codigoA=codigo/10; // divide el resultado anterior y saca la parte parte entera
		int codigoB=codigo %10; //divide el resultado anterior y saca la parte decimalparte decimal
		int codigoF= codigoA+ codigoB; // suma la parte entera y la parte decimal para que sea un solo numero  
		String encriptado=""; // almacena las palabras que componen la encriptacion 
		/*
		* for que sirve para aumentar la variable dependiendo el numero de las letras de la palabra ingresada
		* para poder recorrer cada letra de la palabra
		*/
		for(int incremento=0;incremento<= palabra.length()-1;incremento++) { 
			for(int posicion=0; posicion<= abc.length-1; posicion++) { // for para recorrer el arreglo
				/*
				 * el string me toma la primera letra de cada palabara del arreglo
				 * para despues compararla con cada letra de la palabra
				 */
				String letra= abc[posicion].substring(0, 1); 
				/*
				 *  condicional para comparar cada una de  las letras de la palabra 
				 *  con la primera de la palbra de cada palabra del arreglo 
				 */
				if( palabra.substring(incremento, incremento+1).equals(letra)) { 
					int posicion2=posicion+codigoF;
					/*
					 * esta condicion sirve para que cuando la letra encriptada supere el tamaño del arreglo esta
					* continue ahora desde el inico del arreglo
					*/
					if(posicion2>abc.length) { 
						/*
						 * con esta operacion lo que hago es sumar la posicion de la letra en el arreglo
						 * con el codigo que cree anteriormente que es el que me dice las veces que avanzo de legtra 
						 * en el arreglo, luego lo resto con la longitud del arreglo y el resultado es el 
						 * numero que veces que avnzara ahora desde el primer caracter del arreglo
						 */
						int volver = ( posicion2)-abc.length ;
						/*
						 * agrega palabras a las ya guardadas, ademas de un "/" para distinguir mejor cada palabra
						 */
						encriptado=encriptado+"/"+abc[volver]; 
					}else {
						/*
						 * agrega palabras a las ya guardadas, ademas de un "/" para distinguir mejor cada palabras
						 */
						encriptado=encriptado+"/"+abc[posicion2];
					}
				}
			}
		}
		return encriptado;
	}
	public static String DavidCruz(String palabra) { //Problema 
		 /* Esta funcion recibe el numero de palabras que se desean codificar, luego recibe las palabras
		  *  para encriptarlas. Con el fin de escoger solo la primer letra de cada palabra ingresada y en 
		  * base a estas primeras letras, formar una nueva palabra.
		  */	 
		Scanner leertext=new Scanner(System.in);
		Scanner leernum=new Scanner(System.in);
     int numPalabras;//Defino una variable para luego conocer el numero de palabras que se van a ingresar
	  
	  System.out.println("Indique la cantidad de palabras que desea codificar: ");
		 numPalabras=leernum.nextInt();  
	
	    System.out.println("Elija el tema de las palabras que va a ingresar, luego digite las palabras que desea codificar: ");
	     palabra=leertext.nextLine();
	  	
	  	String[] palabras = new String[numPalabras];//Se crea un vector que vaya hasta el numero de palabras deseadas
	  	  
	  	    char primeraLetra;// Definimos un caracter para elegir solo el primer digito de la palabra ingresada
	  	
	  	    for (int i = 0; i < numPalabras; i++) {// Creamos un for que procese y permita ingresar las palabras
	  	      System.out.print("Ingresa la palabra " + (i+1) + ": ");
	  	      palabras[i] = leertext.nextLine();//Procesa las palabras
	  	      primeraLetra= palabras[i].charAt(0); // Se elige solo el primer digito de cada palabra
	          System.out.println("La primer letra de la palabra " + palabra + " es: " + primeraLetra);
	  	    }
	 return palabra ; //La funcion me retorna la palabra encriptada	       
	}
	public static String Lauracampiño(String frase) {
		
		/*El programa encripta la palabra asi:
				* Paso 1: Convierte cada letra a su equivalente en numero (a=1, b=2...)
				*Paso 2: Si el numero es par le suma la cantidad de letras de la palabra.
				*Si el numero es impar le resta la cantidad de letras de la palabra.
				*Paso 3: convierte el nuevo numero de vuelta a letra (1=a, 2=b...)
				*Paso 4: Busca la nueva letra en un vector de 13 columnas y 2 filas con el abecedario escrito al reves
				*Paso 5: multiplica las coordenadas en las que se encontro la letra (z=1*1, a=13*2...)
				*Paso 6: Si la fila es 1 añade A antes del numero, si la fila es 2 añade B.
				*Paso 7: Escribe la letra seguida del numero para cada letra (cada letra se separa con un punto)
				*Ejemplo:
				*Vaca= A1.A4.A2.A4
				*/

				String palabra = frase;
				palabra.toLowerCase();
						
				String abc = "abcdefghijklmnopqrstuvwxyz";
				//definir variables
				//variable que guarde la posicion en el abecedario de la letra
				int valorNumero = 0;
				//variable que guarde el valor despues del paso 2
				int nuevoValor = 0;
				//variable que guarde la nueva letra en el paso 3
				char nuevaLetra = ' ';
				//vector que guarde dos filas de 13 columnas de letras para el paso 4
				char[][] paso4 = {
						{'z','y','x','w','v','u','t','s','r','q','p','o','n'},
						{'m','l','k','j','i','h','g','f','e','d','c','b','a'},
				};
				//variable que guarde la fila de la letra
				int coor1 = 0;
				//variable que guarde la columna de la letra
				int coor2 = 0;
				//variable que guarde la palabra encriptada
				String nuevaPalabra = "";
						
				//un ciclo for que recorra la palabra letra por letra
				//para i que es 0, mientras i sea menor a la longitud de la palabra, aumentar i en 1
				for (int i=0; i<palabra.length(); i++) {
					
					//un ciclo que recorra el abecedario letra por letra
					//para posicion que es 0, mientras sea menor a la longitud de abc, aumentar en 1
					for (int posicion = 0; posicion<abc.length(); posicion++) {
								
						//un if que guarde en valorNumero la posicion de la letra en el abecedario
							if (palabra.charAt(i) == abc.charAt(posicion)) {
							valorNumero = posicion+1;
									
							//un if que determine si el valorNumero es par o no
							if (valorNumero % 2 == 0) {
								//si es par, que sume a valorNumero (posicion de letra) el largo de palabra
								nuevoValor = valorNumero+palabra.length();
										
								//si nuevoValor se sale del largo de abc, que se reste el largo de abc 
								//este if hace que despues de z siga a
								if (nuevoValor > abc.length()) {
									nuevoValor = nuevoValor - abc.length();
									nuevaLetra = abc.charAt(nuevoValor-1);
								}else {
									nuevaLetra = abc.charAt(nuevoValor-1);
								}
										
							}else {
								//si no es par, que reste a valorNumero(posicion letra) el largo de palabra
								nuevoValor = valorNumero-palabra.length();
										
								//si nuevoValor se sale del largo de abc, que se sume el largo de abc
								//este if hace que antes de a este z
								if (nuevoValor < 1) {
									nuevoValor = nuevoValor + abc.length();
									nuevaLetra = abc.charAt(nuevoValor-1);
								}else {
									nuevaLetra = abc.charAt(nuevoValor-1);

								}
										
							}
									
							//un for que recorra las filas del vector paso4
							for (int fila = 0; fila<2; fila++) {
								//un for que recorra las columnas del vector paso4
								for (int columna = 0; columna<13; columna++ ) {
											
									//un if que guarde la fila y columna en que se encuentra cada letra
									//coor1 (fila), coor2 (columna)
									if (nuevaLetra == paso4[fila][columna]) {
										coor1 = fila+1;								
										coor2 = columna+1;
												
										//la variable nuevoValor es el producto de las coordenadas
										nuevoValor = coor1*coor2;
												
										//la nuevaPalabra es cada letra encriptada separada por punto
										
										if (coor1==1) {
										nuevaPalabra = nuevaPalabra+'A'+nuevoValor+".";
										}else {
											nuevaPalabra = nuevaPalabra+'B'+nuevoValor+".";
										}
									}
								}
							}
						}
					}
				}
						
				return nuevaPalabra;
			}
	/*
	* Nicol Sofia Cepeda Vanegas - 202213321
	* Con este ejercicio se pasa de una palabra en español a una en morse haciendo uso de los vectores y sus posiciónes.
	* Se pide la palabra, se pasa a mayusculas y después dependiendo de las posiciones cambia a morse
	*/
	public static String carol(String frase) {
	         /*
	        * vector de abecedario y de morse correspondientemente,
	        * las letras tienen la misma posición en morse que en el abecedario
	        */
	        String[] letraEsp = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
	        "S", "T", "U", "V", "W", "X", "Y", "Z" };
	        String[] letraMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
	        "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	        System.out.println("Por favor ingrese la palabra a encriptar"); //muestra el mensaje que pide la palabra
	        String palabraEsp = frase; //Scanner para ingresar palabra
	        
	        String palabraMayus = palabraEsp.toUpperCase(); // pasar toda la palabra a mayusculas porque en el vector está así

	        String palabraEnc = ""; //Inicializa palabraEnc con nada para poderse usar después en la impresión de la palabra encriptada
	        // ciclo for desde 1 hasta la longitud de la palabra
	        for (int i = 1; i <= palabraEsp.length(); i++) {
	            /*  esa el substring para extraer la subcadena de texto de la palabra (Letra), va desde el inicio de la letra hasta 
	            el final de la letra (i-1, i)*/
	            String letra = palabraMayus.substring(i-1, i);
	            // ciclo for para establecer la posición morse
	            for (int j = 0; j < letraEsp.length; j++) {
	                // comparar la letra en la posición correspondiente con el vector de las letras del abecedario en español
	                if (letra.equals(letraEsp[j])) {
	                    /*
				  * se muestra la letra en morse con la posición j que se había comparado en el vector de las letras en español, 
	                    * como tienen la misma posición en español y en morse solo hay que poner la j para que se entienda cual posición es en morse
	                    * la letra encriptada se va almacenando en palabraEnc
				  */ 
	                    palabraEnc = palabraEnc + letraMorse[j] + "|"; 
	                }
	            }
	        }
	        return palabraEnc;
	    }
	public static String SamirYate( String texto){
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String textoCodificado = "-_-";
        /*Lo que me permite es que el texto ingresado me devuelva la encriptación en mayuscula para eso se usa el metodo (toUpperCase),
        ya que el abecedario esta en mayuscula: 
        */
        texto = texto.toUpperCase();
       
        //Creamos una variable de tipo char que nos va a servir para ser usado en el ciclo for:
        char caracter;
       
        //Este ciclo tiene la funcion de recorrerme todo el texto, que para esto no ayuda tambien el texto.length() y nos incrementa en 1:
        for (int i=0; i < texto.length(); i++){

         //Lo que hago aqui es devolver el valor del número de posición de un carácter en un string:
         caracter = texto.charAt(i);
        
         //Me dice la posición donde esta un caracter:
         int posicion = abc.indexOf(caracter);
         
         //Este if me va a poner el mismo caracter si se cumple la condicion, en un ejemplo que digamos haya un espacio:
         if (posicion == -1){
            textoCodificado += caracter;
         }
         /*Este else cumple la función de cojerme la posición y correse 3 posiciones mas hacia la derecha 
         y si nos pasamos del abecedario es decir de (Z) se reinica al comienzo (A): */
         else{
            textoCodificado += abc.charAt(posicion + 3 % abc.length());
         }
         
        }
        //Me retorna el String (textoCodificado) a la clase main para mostrarlos en pantalla por dicha clase:
        return textoCodificado;
       }
}






package Calculos;

public class Desencriptar {
	public static String SamuelCamargo(String fraseen) {
        String desencriptarPalabra = ""; //se inicializa una varianle para contener el resultado

        
        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // se inicializa un vector para contener las letras del abecedario
        String[] deletreo = new String [fraseen.length()]; // se inicializa un vector para almacenar la palabra a encriptar
        for(int i=0; i<fraseen.length();i++){   // para i = 0 mientras i sea menor que el largo de la palabra i aumenta en 1
            
            deletreo[i] = fraseen.substring(0+i, 1+i); // se toma la palagra ingresada y se separa letra por letra
           
            
        }
        for(int j=0;j<deletreo.length;j++){  // para j = 0 mientras j sea menor que el largo del deletreo de la palabra aumentar j en 1
            String deletras = deletreo[j]; // se inicializa una variable que almacene el vector de deletreo
            
            
            for(int i=0; i<26;i++){ // para i = o mientras i sea menor que 26 aumentar i en 1
                
                String letras = abecedario[i];  // se inicializa una variable que almacene las letras del abecedario
            int condicion = i + fraseen.length()*2;  /*se inicializa una variable que almacena las condiciones de encriptacion 
                                                    que es restar el numero de espacios del largo de la palabra y se multiplica ese valor en 2 */ 
            
                	if(condicion>25){  // se crea una condicion para evitar que la encriptacion se desborde del abecedario

                        condicion=condicion-abecedario.length;
                    }
                
                if (deletras.contains(letras) == true ){ // se crea la condicion para encriptar la palabra
                        
                    desencriptarPalabra = desencriptarPalabra +  abecedario[condicion];
                
                }
            }
        }
        return desencriptarPalabra;   
    
   }
	public static String AngelaPeña (String fraseen){
		//Variable que me va a guardar la posicion de la letra en el abecedario
		int letranumero=0;
		//Variable que me va a contar si ya se tomaron 2 letras
		int cont=0;
		//variable que me va a guardar la palabra desencriptada
		String palabrades="";
		//ciclo que se cumple mientras g no sea igual a la longitud de la frase
        for (int g=0;g<fraseen.length();g++) {
        	// si ya se leyo una frase de 2 palabras 
        	if(cont==1) {
        		//g es igual a g +1 para que no se vuleva a repetir la letra ya contada
        		g=g+1;
        		//contador es igual a cero ya que vuelve a contar solo una palabra
        		cont=0;
        	}
        	//hasta donde se va a leer la letra es igual a g +1
        	int hasta=g+1;
        	//si son 2 letras se agrega +1 para contar 2 letras
        	int hasta2=hasta+1;
        	//se define la variable que va a delante de la que se va a leer
        	int g2=g+1;
        	//si la variable es mayor a la longitus de la frase 
        	if(g2>=fraseen.length()) {
        		//se iguala a la longitud de la frase menos 1
    			g2=fraseen.length()-1;
    		}
        	//si la variable es mayor a la longitud de la frase
        	if(hasta2>fraseen.length()) {
        		//se iguala a la longitud de la palabra
    			hasta2=fraseen.length();
    		}
        	//si a variable es mayor a la longitud de la palabra
        	if(hasta>fraseen.length()) {
        		//se iguala la variable a la longitud de la frase 
    			hasta=fraseen.length();
    		}
        	//si la palabra a leer es igual a un espacio
        	if(fraseen.substring(g,hasta).compareTo(" ")==0) {
        		// la nueva palabra es vacio
        		palabrades=""+palabrades;
        	}else {
        		//si las letra siguiente a la que se va a leer es diferente a un espacio
        		if(fraseen.substring(g2,hasta2)!=" ") {
        			//se aumenta las letras que se van a leer de 1 a 2
            		hasta=g+2;
            		//cotador indica que se leyo 2 letras
            		cont=1;
            	}
        		//los diferentes caracteres
        		String [] caracteres_diferentes = {"+", "*","-", "?","!", "~","#", "$","&", "%","*+", "**","*-", "*?","*!", "*~","*#", "*$","*&", "*%","-+", "-*","--", "-?","-!", "-~",};
            	//mientras se leen los caracteres
        		for (int t=0; t<caracteres_diferentes.length;t++) {
        			//si se encuentra al caracter igual 
            		if(fraseen.substring(g,hasta).compareTo(caracteres_diferentes[t])==0) {
            			//se guarda la posicion de este
                		letranumero=t;
                		break;
                	}
            	}
        		//abecedario normal
            	 String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
            		//la posicion de el caracter se pasa a la posicion del abecedario
            	 letranumero=abecedario.length-letranumero;
            	//y a esta posicion se le resta una y se le inserta en la variable de la palabra desencriptada
            	 palabrades=abecedario[letranumero-1]+palabrades;
        	}
        	
        }
        //finalmente la funcion me retorna la palabra encriptada
        return(palabrades);
    }
	public static String YaiderBecerra (String frase) {
		
		
		return "";
	}
	public static String Selene (String fraseen){
        /*esta función recibe una palabra para encriptarla, según la posición en el abecedario de la letra, se realizará
         * la sucesión de fibonnaci, y se arrojara el número resultante*/
		String palabradese="";
		int posicion2=0;
        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};//array abecedario
        int large = fraseen.length();//largo de la palabra ingresada para hacer un ciclo
        for(int i=0; i<large; i++){//ciclo que recorre las letras de la palabra
            String letra = fraseen.substring(i, i+1);//substring que toma cada letra
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
                    }
                    posicion2=contadorDos-posicion;
                    palabradese=abecedario[posicion2]+palabradese;
                    
                }
            }
        }

        return palabradese;
        }
	public static String Yimir (String fraseen, int año, int mes) {
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
		int posicion2=0;
		String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] abc = {"array","bucle","cadena","definir","enlace","funcion","gato","hijo","incremento","java","kilo","lamento","matriz","nada","ñandu","operador","patron","quizz","raton","sistema","terminal","ubicacion","vida","wilslson","xilofon","yuca","zzz"};
		String palabra= fraseen;
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
				if( palabra.substring(incremento, incremento+1).equals("/")) {
					if( palabra.substring(incremento+1, incremento+2).equals(letra)) { 
						if(posicion>codigoF) {
							 posicion2=posicion-codigoF;
						}else {
							posicion2=codigoF-posicion;
						}
						
						/*
						 * esta condicion sirve para que cuando la letra encriptada supere el tamaño del arreglo esta
						* continue ahora desde el inico del arreglo
						*/
						if(posicion2>abecedario.length) { 
							/*
							 * con esta operacion lo que hago es sumar la posicion de la letra en el arreglo
							 * con el codigo que cree anteriormente que es el que me dice las veces que avanzo de legtra 
							 * en el arreglo, luego lo resto con la longitud del arreglo y el resultado es el 
							 * numero que veces que avnzara ahora desde el primer caracter del arreglo
							 */
							int volver = ( posicion2)-abecedario.length ;
							/*
							 * agrega palabras a las ya guardadas, ademas de un "/" para distinguir mejor cada palabra
							 */
							encriptado=encriptado+abecedario[volver]; 
						}else {
							/*
							 * agrega palabras a las ya guardadas, ademas de un "/" para distinguir mejor cada palabras
							 */
							encriptado=encriptado+abecedario[posicion2];
						}
					}
				}
				
			}
		}
		return encriptado;
	}
	public static String Lauracampiño (String fraseen) {
		int divi=1;
		String letra="";
		int numeroleabc=0;
		int palabras=0;
		int numeroreal=0;
		String palabrades="";
		String frasedes="";
		String numeroletra="";
		for (int i = 0; i<fraseen.length(); i++) {
			if(fraseen.substring(i,i+1).compareTo("B")==0||fraseen.substring(i,i+1).compareTo("A")==0) {
				if (fraseen.substring(i,i+1).compareTo("A")==0) {
					palabras=palabras+1;
					if(fraseen.substring(i+2,i+3).compareTo(".")==0) {
						numeroletra=fraseen.substring(i+1,i+2);
					}else {
						numeroletra=fraseen.substring(i+1,i+3);
					}
				}else {
					if (fraseen.substring(i,i+1).compareTo("B")==0) {
						divi=2;
						palabras=palabras+1;
						if(fraseen.substring(i+2,i+3).compareTo(".")==0) {
							numeroletra=fraseen.substring(i+1,i+2);
						}else {
							numeroletra=fraseen.substring(i+1,i+3);
						}
					}
				}
				String[] numero = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
				for(int u=0; u<numero.length;u++) {
					if(numero[u].compareTo(numeroletra)==0) {
						numeroleabc=u+1;
						break;
					}
				}

				numeroleabc=numeroleabc/divi;
				if(divi==2) {
					numeroleabc=numeroleabc+13;
				}
				String[] abcal = {"z","y","x","w","v","u","t","s","r","q","p","o","n","m","l","k","j","i","h","g","f","e","d","c","b","a"};
				for(int r=0;r<abcal.length;r++) {
					if(r==numeroleabc) {
						letra=abcal[r];
						break;
					}
				}
				String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
				for (int y=0; y<abecedario.length;y++) {
					if(letra.compareTo(abecedario[y])==0) {
						if((y+1)%2==0) {
							numeroreal=y-palabras;
						}else {
							numeroreal=y+palabras;
						}
					}
				}
				for(int h=0;h<abecedario.length;h++) {
					if(numeroreal==h) {
						palabrades=abecedario[h+1];
					}
				}
				frasedes=frasedes+palabrades;
			}
			
		}
		
		
		
		return frasedes;
	}
}

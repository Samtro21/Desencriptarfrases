package Calculos;

public class Desencriptar {
	public String samuelcamargo(String fraseen) {
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
	public String sergio(String fraseen) {
		String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int numeroletra=0;
		int hasta=0;
		String nuevaletra="";
		String nuevapalabra="";
		String desencrip="";
		int cont=0;
		for(int y=0; y<fraseen.length();y++) {
			if(cont==0) {
				cont=5;
				for(int u=y;u<fraseen.length();u++) {
					if(fraseen.substring(u,u+1).compareTo("/")==0) {
						hasta=u;
						break;
					}
				}
				int divi16=1;
				int divi8=1;
				int divi4=1;
				int divi2=1;
				int divi1=1;
				desencrip=fraseen.substring(y,hasta);
				if(desencrip.substring(0,1).compareTo("*")==0) {
					divi16=16;
				}
				if(desencrip.substring(1,2).compareTo("*")==0) {
					divi8=8;
				}
				if(desencrip.substring(2,3).compareTo("*")==0) {
					divi4=6;
				}
				if(desencrip.substring(3,4).compareTo("*")==0) {
					divi2=3;
				}
				if(desencrip.substring(4,5).compareTo("*")==0) {
					divi1=2;
				}
				for (int p=0; p<abecedario.length;p++) {
					if(p/divi16>=1) {
						if(p/divi8>=1) {
							if(p/divi4>=1) {
								if(p/divi2>=1) {
									if(p/divi1>=1) {
										numeroletra=p-1;
										System.out.println(numeroletra);
										break;
									}
								}
							}
						}
					}
				}
				nuevaletra=abecedario[numeroletra];
				nuevapalabra=nuevapalabra+nuevaletra;
			}else {
				cont=cont-1;
				}
			
		}
		
		return nuevapalabra;
	}
	public String angelapeña (String fraseen){
		int cont=1;
		int numletra=0;
		String nuletra="";
		String nuevpala="";
		String leerletras="";
		String [] abecedario = {"z", "y","x", "w","v", "u","t", "s","r", "q","p", "o","n", "m","l", "k","j", "i","h", "g","f", "e","d", "c","b", "a",};
		String [] caracteres_diferentes = {"+", "*","-", "?","!", "~","#", "$","&", "%","*+", "**","*-", "*?","*!", "*~","*#", "*$","*&", "*%","-+", "-*","--", "-?","-!", "-~",};
		for(int h=0; h<fraseen.length();h++) {
			if(cont==1) {
				if(fraseen.substring(h,h+1).compareTo(" ")==0) {
					nuletra="";
				}else {
					for (int u =0; u< caracteres_diferentes.length;u++) {
						if (fraseen.substring(h+1,h+2).compareTo(" ")==0) {
							leerletras=fraseen.substring(h,h+1);
							if(leerletras.compareTo(caracteres_diferentes[u])==0) {
								numletra=u;
							}
						}else {
							leerletras=fraseen.substring(h,h+2);
							cont=2;
								if(leerletras.compareTo(caracteres_diferentes[u])==0) {
									numletra=u;
								}
						}
						for(int g=0; g<abecedario.length;g++) {
							if(g==numletra) {
								nuletra=abecedario[g];
							}
						}
					}
				}
				nuevpala=nuletra+nuevpala;
			}else {
				cont=1;
			}
			
		}//finalmente la funcion me retorna la palabra encriptada
        return nuevpala;
    }
	public String manuel (String frase) {//correccion
		
		
		return "";
	}
	public String selene (String fraseen){
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
	public String yimir (String fraseen, int año, int mes) {
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
	public String david(String fraseen) {
		
		return"";
	}
	public String lauracampiño (String fraseen) {
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
	public String nicol (String fraseen) {
		return"";
	}
	public String samir (String fraseen) {
		return"";
	}
	public String lauraco (String fraseen) {
		int hasta=0;
		int numpalabra=0;
		String letranue="";
		String palabrades="";
		String palabra="";
		String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
		String [] lista_palabras = 

			{"magdalena","fishburne","crucial","kendrik","suena","perfume","goodgirls","bahia","swift","semejante","akkas","ambulance","tiempos","mango","ghost","zepet","buque","world","misma","anestecia","uchuvas","alvin","williamwilson","boxeo","nsync","gozar"};
		for(int g=0; g<fraseen.length();g++) {
			if(fraseen.substring(g,g+1).compareTo("-")==0) {
				letranue="";
			}else {
				for (int y=g; y<fraseen.length();y++) {
					if(fraseen.substring(y,y+1).compareTo("-")==0) {
						hasta=y;
						palabra=fraseen.substring(g,hasta);
						g=y;
						for(int e=0; e<lista_palabras.length;e++) {
							if(palabra.compareTo(lista_palabras[e])==0) {
								numpalabra=e;
								letranue=abecedario[numpalabra];
								break;
							}
						}
						break;
					}	
				}
			}
			palabrades=palabrades+letranue;
		}
		return palabrades;
	}
	public String eliascam (String fraseen) {
		int hasta=0;
		int numletra=0;
		String letra="";
		String nuevapalabra="";
		String nuevaletra="";
		String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
		for(int h=0; h<fraseen.length();h=h+2) {
			hasta=h+1;
			letra=fraseen.substring(h,hasta);
			for(int r=0; r<abecedario.length;r++) {
				if(letra.compareTo(abecedario[r])==0) {
					numletra=r+1;
					if(numletra>=abecedario.length) {
						numletra=numletra-abecedario.length;
					}
					nuevaletra=abecedario[numletra];
					
				}
			}
			nuevapalabra=nuevapalabra+nuevaletra;
		}
		return nuevapalabra;
	}
	public String tomases (String fraseen, int numero, boolean desicion) {
		int posicionnueva=0;
		String letra="";
		String letranueva="";
		String palabranueva="";
		String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
		for (int r=0; r<fraseen.length();r++) {
			letra=fraseen.substring(r,r+1);
			for(int g=0; g< abc.length;g++) {
				if(letra.compareTo(abc[g])==0) {
					posicionnueva=g;
					if(desicion) {
						posicionnueva=posicionnueva-numero;
					}else {
						posicionnueva=posicionnueva+numero;
					}
					if(posicionnueva>=abc.length) {
						posicionnueva=posicionnueva-abc.length;
					}
					if(posicionnueva<0) {
						posicionnueva=posicionnueva+abc.length;
					}
					break;
				}
			}
			letranueva=letranueva+abc[posicionnueva];
		}
		palabranueva=palabranueva+letranueva;
		
		return palabranueva;
	}
}

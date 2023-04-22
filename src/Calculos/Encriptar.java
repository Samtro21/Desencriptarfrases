package Calculos;

public class Encriptar {
	public static String SamuelCamargo(String frase) {
        String encriptarPalabra = ""; //se inicializa una varianle para contener el resultado

        
        String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // se inicializa un vector para contener las letras del abecedario
        String[] deletreo = new String [frase.length()]; // se inicializa un vector para almacenar la palabra a encriptar
        for(int i=0; i<frase.length();i++){   // para i = 0 mientras i sea menor que el largo de la palabra i aumenta en 1
            
            deletreo[i] = frase.substring(0+i, 1+i); // se toma la palagra ingresada y se separa letra por letra

            
        }
        for(int j=0;j<deletreo.length;j++){  // para j = 0 mientras j sea menor que el largo del deletreo de la palabra aumentar j en 1
            String deletras = deletreo[j]; // se inicializa una variable que almacene el vector de deletreo
            
            
            for(int i=0; i<26;i++){ // para i = o mientras i sea menor que 26 aumentar i en 1
                
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
	                  for(int x=0;x<28;x++){//ciclo de a hasta z
	                     if(vector[x].equals(frase.substring(i,i+1))){//comprueba si la letra es igual a la posicion en el vector
	                        int y=x;
	                        for(int z=16;z>=1;z=z/2){//comprueba la cuatro potencias para cada letra
	                            if(y/z>=1){//este ciclo prueba con las potencias de 2 y si es mayor que alguna de esta agrega un asterisco
	                                resultado+="*";
	                               }else{
	                                resultado+=" ";//si no es divisible entonces me suma un espacio que es la opcion apagado
	                               }
	                            if(y/z>=1){//en este ciclo tambien prueba las potencias de 2 
	                                    y=y%z;//con esto al agregar un * le saca el modulo del valor de esa potencia 
	                                }
	                            
	                          }
	                        resultado+="/";//separa cada letra 
	                        break;//acaba con el ciclo
	                         }
	                   }
	                }

	
		return resultado;
	}
   

}

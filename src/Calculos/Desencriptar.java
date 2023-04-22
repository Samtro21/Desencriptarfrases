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
}

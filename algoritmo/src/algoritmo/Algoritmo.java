/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author luis
 */
import java.util.*;// Siempre se coloca la libreria de java
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int numero1=0;// Creamos 2 variables de tipo numero
  int numero2=0;
        System.out.println("Introduce el numero1: "); //pintamos el primer numero
        Scanner tecla=new Scanner(System.in);// escaniamos la tecla
        numero1=tecla.nextInt();//indicamos la posecion del numero1
        System.out.println("Introduce el numero2: ");//pintamos el segundo numero
        numero2=tecla.nextInt();// indicamos la posecion del numero2
        while(numero2>0){// realizamos un while sencillo de entender 
            numero1++;
            numero2--;
        }
        System.out.println("lA SUMA TOTAL ES: "+numero1); // y por ultimo mostramos el resultado
    }
    
}

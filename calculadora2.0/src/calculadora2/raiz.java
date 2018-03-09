/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;
import java.util.Scanner;
/**
 *
 * @author huanuco7
 */

public class raiz {
     Scanner num=new Scanner(System.in);
     int numero,raiz;
     String resultado;

  public void EscogeDatos() {
       System.out.println("Ingresa un numero: ");
       numero=num.nextInt();
  
    }

   public void Calcula() {
       raiz=(int)Math.sqrt(numero);
    }
    public String Muestradatos(){
       return("La raiz cuadrada de ------->  "+numero+"\n\n"+
               "es"+raiz+"\n\n");
   }
}


package u04e02;

import java.util.Scanner;
public class U04E02 {
public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.print("Ingrese el primer numero: ");
    int num1= entrada.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int num2= entrada.nextInt();
    int cociente = num1/num2; //guarda el resultado del cociente de la division
    int resto = num1%num2; //guarda el resultado del resto de la division
    System.out.println("El resultado del cociente es " +cociente);
    System.out.println("El resto de la division es: " +resto);
    }
}

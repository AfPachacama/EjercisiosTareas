package Ejercisio1;

import java.util.Scanner;

public class Diagramaflujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa por teclado 2 n�meros: A y B se desea mostrar la divisi�n entre dichos n�meros en caso de ser posible, 
		//caso contrario indicar al usuario que la divisi�n es imposible.
		
		
		 Scanner Leer = new Scanner(System.in);
		    System.out.printf("Introduce dos numeros para dividir\nNumero: ");
		    int num1 = Leer.nextInt();
		    System.out.printf("Numero: ");
		    int num2 = Leer.nextInt();
		    float div = num1/num2;
		    System.out.println("La division de "+num1+"/"+num2+" = " +div);
		    
		}

}

package Ejercisio1;

import java.util.Scanner;

public class DiagramaFlujo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner Leer = new Scanner(System.in);
		System.out.printf("Introduce un numero: ");
		n1=Leer.nextInt();
		System.out.print("Introduce otro n�mero: ");
		 n2=Leer.nextInt();
		 
		 if(n1%n2==0)
			 System.out.println("Son m�ltiplos");
			 else
			 System.out.println("No son m�ltiplos");

	}

}

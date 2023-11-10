package JavaInicial;

import java.util.Scanner;

public class LacoRepeticaoDoWhileSomaNumPositivos {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int num,soma = 0 ;
		
		do {
			System.out.println("\n || DIGITE UM NUMERO:  ||");
			num = leia.nextInt();
			if (num > 0) {
			soma += num;
			}
		}while( num != 0);
		System.out.println("\n || A SOMA DOS NUMEROS: "+soma+" || ");
	
		
	}

}

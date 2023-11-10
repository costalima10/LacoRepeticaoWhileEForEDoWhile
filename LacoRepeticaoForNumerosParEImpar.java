package JavaInicial;

import java.util.Scanner;

public class LacoRepeticaoForNumerosParEImpar {

	public static void main(String[] args) {
		
		int num,x=0,somaPar=0,somaImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(x=1 ;x<=10; x++) {
			System.out.println("\n || ENTRE COM UM NUMERO : ");
			num = leia.nextInt();
			if(num %2==0 ) {
				somaPar++;
			}else {
				somaImpar++;
			}
			
		}
		System.out.println("\n || Total de numero pares: "+somaPar+" || ");
		System.out.println("\n || Total de numero impares: "+somaImpar+" || ");
	}
		
}

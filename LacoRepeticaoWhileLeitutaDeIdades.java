package JavaInicial;

import java.util.Scanner;

public class LacoRepeticaoWhileLeitutaDeIdades {

	public static void main(String[] args) {
		
		int idade = 0, maiores = 0, menores=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n || DIGITE UMA IDADE:  ||");
		idade = leia.nextInt();
			
			while(idade >= 0 ) {
			if(idade < 21) {
				menores++;
			}else if (idade > 50){
				maiores++;
			}
			System.out.println("\n || DIGITE UMA IDADE:  ||");
			idade = leia.nextInt();
		}
		System.out.println("\n\t || Total de pessoas menores de 21 anos: || "+menores+" || ");
		System.out.println("\n\t || Total de pessoas maiores de 50 anos: || "+maiores+" || ");
			
	}

}

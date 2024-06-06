package lacos.repeticao;

import java.util.Scanner;

public class LerIdades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, menor21 = 0, maior50 = 0;

		System.out.printf("Digite uma idade: ");
		idade = sc.nextInt();

		while (idade >= 0) {

			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}

			System.out.printf("Digite uma idade: ");
			idade = sc.nextInt();

		}

		System.out.println();
		System.out.printf("Total de pessoas menores de 21 anos: %d%n", menor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n", maior50);

		sc.close();

	}

}

package lacos.repeticao;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0, quantidade = 0;
		float media;

		do {

			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero % 3 == 0) {
				if (numero != 0) {
					soma += numero;
					quantidade++;
				}
			}

		} while (numero != 0);

		media = (float) soma / quantidade;

		System.out.println();

		if (soma > 0)
			System.out.printf("Média dos números múltiplos de 3: %.1f%n", media);
		else
			System.out.println("Valor inválido!");

		sc.close();

	}

}

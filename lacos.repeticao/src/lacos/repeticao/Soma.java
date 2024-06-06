package lacos.repeticao;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0;

		do {

			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		System.out.println();
		System.out.printf("A soma dos números positivos é: %d%n", soma);

		sc.close();

	}

}

package lacos.repeticao;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1, numero2;

		System.out.print("Digite o 1º número do intervalo: ");
		numero1 = sc.nextInt();

		System.out.print("Digite o último número do intervalo: ");
		numero2 = sc.nextInt();

		System.out.println();

		if (numero1 > numero2) {
			System.out.println("Intervalo inválido!");
		} else {
			for (int i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5%n", i);
				}
			}
		}

		sc.close();

	}

}

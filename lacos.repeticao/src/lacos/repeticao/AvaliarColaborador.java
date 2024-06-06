package lacos.repeticao;

import java.util.Scanner;

public class AvaliarColaborador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, idGenero, pessoaDev;
		int devBackend = 0, mulheresFrontend = 0, homensMobileMais40 = 0, naoBinarioFullstackMenos30 = 0,
				totalPessoas = 0, somaIdade = 0;
		float mediaIdade;
		char resposta = 's';

		while (resposta == 's') {

			System.out.print("\nIdade: ");
			idade = sc.nextInt();

			System.out.println("\nIdentidade de gênero: ");
			System.out.println("[1] Mulher Cis");
			System.out.println("[2] Homem Cis");
			System.out.println("[3] Não Binário");
			System.out.println("[4] Mulher Trans");
			System.out.println("[5] Homem Trans");
			System.out.println("[6] Outros");
			idGenero = sc.nextInt();

			System.out.println("\nPessoa desenvolvedora: ");
			System.out.println("[1] Backend");
			System.out.println("[2] Frontend");
			System.out.println("[3] Mobile");
			System.out.println("[4] FullStack");
			pessoaDev = sc.nextInt();

			if (pessoaDev == 1) {
				devBackend++;
			}

			if ((idGenero == 1 || idGenero == 4) && pessoaDev == 2) {
				mulheresFrontend++;
			}

			if ((idGenero == 2 || idGenero == 5) && pessoaDev == 3 && idade > 40) {
				homensMobileMais40++;
			}

			if ((idGenero == 3 && pessoaDev == 4) && idade < 30) {
				naoBinarioFullstackMenos30++;
			}

			totalPessoas++;
			somaIdade += idade;

			System.out.println();
			System.out.print("Deseja continuar? (s/n) ");
			resposta = sc.next().charAt(0);

		}

		mediaIdade = (float) somaIdade / totalPessoas;

		System.out.printf("%nDesenvolvedor(es) backend: %d%n", devBackend);
		System.out.printf("Mulheres cis e trans dev frontend: %d%n", mulheresFrontend);
		System.out.printf("Homens cis e trans dev mobile com mais de 40 anos: %d%n", homensMobileMais40);
		System.out.printf("Pessoas não binárias dev fullstack com menos de 30 anor: %d%n", naoBinarioFullstackMenos30);
		System.out.printf("Total de pessoas que responderam a pesquisa: %d%n", totalPessoas);
		System.out.printf("Média de idade dos que responderam a pesquisa: %.2f%n", mediaIdade);

		sc.close();

	}

}

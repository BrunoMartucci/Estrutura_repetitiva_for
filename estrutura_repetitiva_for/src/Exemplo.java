import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Um programa que lê um valor inteiro N e depois N numeros inteiros
		//Ao final, mostra a soma dos N numeros lidos
		int N = sc.nextInt();
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		//A estrutura é ótima para realizar uma retição baseada em uma contagem
		System.out.println("Agora é uma contagem");
		for (int i=0; i<5; i++) {
			System.out.println("O valor de i: " + i);
		}
		
		//Agora uma contagem regressiva
		System.out.println("Agora é uma contagem regressiva");
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + 1);
		}
		sc.close();

	}

}

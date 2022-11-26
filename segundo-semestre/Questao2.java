import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[10];
		System.out.println("Insira os valores ao vetor: ");
		for (int i = 0; i < 10; i++) {
			numeros[i] = entrada.nextInt();
		}

		saoAmigos(numeros);

	}

	public static void saoAmigos(int[] numeros) {
		int[] amigos = new int[5];

		for (int par = 0; par < 5; par++) {
			int contador1 = 0;
			int contador2 = 0;
			int n1 = numeros[2 * par];
			int n2 = numeros[2 * par + 1];
			
			for (int i = 1; i < Math.max(n1, n2); i++) {
				if (n1 % i == 0 && n1 != i) {
					contador1 += i;
				}
				if (n2 % i == 0 && n2 != i) {
					contador2 += i;
				}
			}
			
			if (contador1 == n2 && contador2 == n1) {
				amigos[par] = 1;
			} else {
				amigos[par] = 0;
			}
			//System.out.println("Contador 1 = " + contador1 + " Contador 2 = " + contador2);
		}
		System.out.print("Amigos: ");
		for (int i = 0; i < amigos.length; i++) {
			System.out.print("[" + amigos[i] + "]");
		}
		System.out.println();
	}
}

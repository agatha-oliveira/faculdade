import java.util.Scanner;

public class Questao1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int N;

    while (true) {
        System.out.println("Qual metodo executar? (1, 2, 3)");
        N = entrada.nextInt();

        switch (N) {
        case 1:
            f1();
            break;

        case 2:
            System.out.print("Insira um numero: ");

            int numero = entrada.nextInt();
            int resultado = f2(numero);
            
            if(resultado == 1) {
                System.out.println("Aparece duas vezes no vetor");
            }else {
                System.out.println("Nao aparece duas vezes no vetor");
            }
            break;

        case 3:
            System.out.print("Informe o tamanho da matriz: ");
            int n = entrada.nextInt();

            int[][] matrizQuadrada = new int [n][n];
            //Random gerador = new Random();

        for(int i=0; i < matrizQuadrada.length; i++) { // Adicionar valores a matriz
            for(int j=0; j < matrizQuadrada.length; j++) {
                //matrizQuadrada[i][j] = gerador.nextInt(10);
                matrizQuadrada[i][j] = entrada.nextInt();
            }
        }
        boolean tipoMatriz = f3(matrizQuadrada, n);
        System.out.println("A matriz e triangular superior? " + tipoMatriz);
        break;

    default:
        System.out.println("NUMERO INVALIDO - Digite um numero entre 1 e 3.");
    }
}
}

public static void f1() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Frase:");
    String frase = entrada.nextLine();

    System.out.print("Palavra:");
    String palavra = entrada.nextLine();

    int qtdPalavrasNaFrase = 0;

    if (palavra.length() > frase.length()) System.out.println("A palavra e maior que a frase.");

    for (int i = 0; i < 1 + frase.length() - palavra.length(); i++) {
        String palavraTemp = frase.substring(i, i + palavra.length()).toUpperCase();

        if (palavra.toUpperCase().equals(palavraTemp)) {
            qtdPalavrasNaFrase++;
        }
    }

    System.out.println(
        "A palavra " + " se repete " + qtdPalavrasNaFrase + " vezes em " + "\n");

}

public static int f2(int numeroComparar) {
    Scanner entrada = new Scanner(System.in);
    int[] vet = new int [50]; 
    int contador = 0;
    int result = 0;

    System.out.println("Entre com os valores: ");
    for(int i=0; i < 50; i++) {
        vet[i] = entrada.nextInt();

    }
    System.out.println("Valores dentro do vetor: ");
    for(int i=0; i < 50; i++) {
        if(vet[i] == numeroComparar) {
            contador++;
        }else if(contador == 2) { // Como não ficou claro na questão, estou deixando apenas se aparecer duas vezes na ocorrência caso, queria contar 2 ou mais vezes só adicionar >= no lugar do ==
            result = 1;
        }else {
            result = 0;
        }
        System.out.print("[" + vet[i] + "]");
    }
    System.out.println();
    return result;
}

public static boolean f3(int[][] matrizQuadrada, int n) {
    Scanner entrada = new Scanner(System.in);
    int contador = 0;

        for(int i=0; i < matrizQuadrada.length; i++) { // Printar a matriz
            for(int j=0; j < matrizQuadrada.length; j++) {
                if(i > j && matrizQuadrada[i][j] == 0) {
                    contador++;
                }
                System.out.print(matrizQuadrada[i][j] + " | ");
            }
            System.out.println();
        }
        if(contador == ((n-1)*n)/2) { // Progressão Aritmética
            return true;
        }else {
            return false;
        }
    }
    
}
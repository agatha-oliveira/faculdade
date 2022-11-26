import java.util.Scanner;

public class Ex6_Matriz {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[][] mat = new int [3][3];
        int i,j,soma=0;

        for(i=0; i < mat.length; i++) {
            for (j=0; j < mat.length; j++) {
                System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz: ");
                mat[i][j] = input.nextInt(); 
                if(mat[i][j] > 1) { 
                System.out.println("Por farvor, digite novamente.");
                System.out.println("O numero precisa ser 0 ou 1!");
                System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz: ");
                mat[i][j] = input.nextInt();
                }
            }
        }
        for(i=0; i < mat.length; i++) {
            for (j=0; j < mat.length; j++) {
                if(i == j && mat[i][j] == 1){
                soma++;
                }
                if(i != j && mat[i][j] == 1){
                soma=4;
                }
                System.out.print(mat[i][j]+" | ");
            }
            System.out.println("");
        }

        if (soma == 3) {
            System.out.println("Matriz identidade!"); 
            } else {
            System.out.println("Nao e uma matriz identidade!");
        }

    }
}
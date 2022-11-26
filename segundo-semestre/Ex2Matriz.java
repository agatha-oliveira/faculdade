/*Crie um programa para armazenar valores inteiros em duas matrizes quadradas, 
denominadas A e B, de ordem 2.  Em seguida, gerar uma terceira matriz chamada C 
que é obtida a partir da adição da matriz A e B. 
*/
import java.util.Scanner;
public class Ex2Matriz{
	public static void main(String[] args){
		
	int[][] A,B,C;
	A = new int[2][2];
	B = new int[2][2];
	C = new int[2][2];
	int i,j;
	
	Scanner entra = new Scanner(System.in);
	
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz A: ");
			A[i][j]=entra.nextInt();
		}
	}
	
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz B: ");
			B[i][j]=entra.nextInt();
			C[i][j]=A[i][j]+B[i][j];
		}
	}
	System.out.println("\nConteudo da matriz A:  ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){	
			System.out.print(A[i][j]+" | ");
		}
	System.out.println("");
	}	
	
	System.out.println("\nConteudo da matriz B:  ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){	
			System.out.print(B[i][j]+" | ");
		}
	System.out.println("");
	}
	System.out.println("\nConteudo da matriz C:  ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){	
			System.out.print(C[i][j]+" | ");
		}
	System.out.println("");
	}
	}
}
/*Crie um programa para inserir valores inteiros em uma matriz 4 x 4. 
Calcular e imprimir a soma de todos os elementos da matriz. 
*/
import java.util.Scanner;
public class Ex1Matriz{
	public static void main(String[] args){
		
	int[][] numeros;
	numeros = new int[4][4];
	int i,j, soma=0;
	
	Scanner entra = new Scanner(System.in);
	
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz: ");
			numeros[i][j]=entra.nextInt();
			soma=soma+numeros[i][j];
		}
	}
	System.out.println("\nConteudo da matriz:  ");
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){	
			System.out.print(numeros[i][j]+" | ");
		}
	System.out.println("");
	}	
	System.out.println("\n Valor da soma dos elementos da matriz: "+soma);	
	}
}
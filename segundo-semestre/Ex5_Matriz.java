import java.util.Scanner;

public class Ex5_Matriz {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int[][] mat = new int [5][5];
		int i,j;
		
		for(i=0; i < mat.length; i++) {
			for (j=0; j < mat.length; j++) {
				System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz: ");
				mat[i][j] = input.nextInt();
			}
		}
		
		for(i=0; i < mat.length; i++) {
			for (j=0; j < mat.length; j++) {
				if((i+j)%2==0) {
				System.out.print(mat[i][j] + " | "); 
				} else {
					mat[i][j]=0;
					System.out.print(mat[i][j] + " | ");
				}
				
				System.out.println("");
			}
			
		}
			
	}
	
}			
			
/*
Faça um programa que gere uma matriz 8X8 preenchendo com 1s e 0s
*/
public class Ex3Matriz{
	public static void main(String[] args){
		
	int[][] mat;
	mat = new int[8][8];
	int i,j;
	
	for(i=0;i<8;i=i+1){
		for(j=0;j<8;j=j+1){
			if(j<=i){
				mat[i][j]=1;
			}
			else{
				mat[i][j]=0;
			}
		}
	}
	System.out.println("\nConteudo da matriz:  ");
	for(i=0;i<8;i++){
		for(j=0;j<8;j++){	
			System.out.print(mat[i][j]+" | ");
		}
	System.out.println("");
	}
	}
}
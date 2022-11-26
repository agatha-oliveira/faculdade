import java.util.Scanner;

public class Npalavras
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);

    String n;
    String ch;
    int qtnd = 0;
    StringBuffer Buffer = new StringBuffer();
    
    System.out.printf("Informe o numero de palavras que deseja inserir: ");
    qtnd = input.nextInt();
    input.nextLine();
    
    System.out.printf("Informe o caracter inicial: ");
    ch = input.nextLine();

    for (int i = 1; i <= qtnd; i++) { System.out.printf("Informe uma palavra: ");
    n = input.nextLine(); 
    
    if (n.startsWith(ch)) {
    Buffer.append(n+" "); } 
    else { System.out.println("A palavra nao inicia com "+ ch+"!");
    }
    
    }
    System.out.println();
    System.out.println("Palavras digitadas pelo usuario que comecam com o caracter "+ ch+":");
    System.out.println(Buffer);
}
  }
    
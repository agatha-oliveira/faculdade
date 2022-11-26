import java.util.Scanner;

public class ContaEspacos
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);

    String frase;
    char contador;
    int spaces;
    spaces = 0;

      System.out.printf("Informe uma frase: ");
      frase = input.nextLine();
      
       for (int i = 0; i < frase.length(); i++) {

            contador = frase.charAt(i);
            if (contador == ' ')
                spaces++;
        }

        System.out.println("Ha " + spaces + " espacos na frase.");
    }
}
      
import java.util.Scanner;

public class  ContaMaiusculas
{
  public static void main (String[]args) {
    Scanner input = new Scanner (System.in);

    String frase;
    char contador;
    int maiu = 0;

    System.out.printf("Informe uma frase: ");
    frase = input.nextLine ();

    for (int i = 0; i < frase.length (); i++)
      {
		contador = frase.charAt(i);
		if (Character.isUpperCase (contador))
		maiu++;
      }  
      
    System.out.println("Ha " + maiu + " letras maiusculas");

  }
  }

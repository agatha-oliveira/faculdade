import java.util.Scanner;

public class Histograma
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);

    String frase;
    String simb = "*";
    char contador;
    int a = 0, e =0, ii = 0, o = 0, u = 0;

    System.out.printf("Informe uma frase: ");
    frase = input.nextLine ();

    for (int i = 0; i < frase.length (); i++)
      {
	contador = frase.charAt(i);
	if (contador == 'a' || contador == 'A') {
	  a++;
      } if (contador == 'e' || contador == 'E') {
	  e++; 
	  } if (contador == 'i' || contador == 'I') {
	  ii++; 
	  } if (contador == 'o' || contador == 'O') {
	  o++; 
	  } if (contador == 'u' || contador == 'U') {
	  u++; 
	    
	  }
	  
      }
    System.out.println("Histograma:");
    System.out.println("a: " +simb.repeat(a)+"("+a+")");
    System.out.println("e: " +simb.repeat(e)+"("+e+")");
    System.out.println("i: " +simb.repeat(ii)+"("+ii+")");
    System.out.println("o: " +simb.repeat(o)+"("+o+")");
    System.out.println("u: " +simb.repeat(u)+"("+u+")");

  }
  }
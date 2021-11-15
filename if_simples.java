   import java.util.Scanner;

class if_simples {

  public static void main() {
Scanner entrada =  new Scanner (System.in);

 int year, remainder;

System.out.print("Digite um ano: ");

year = entrada.nextInt();

remainder = year %  4;

if (remainder ==  0 )

System.out.println( year +  " é um ano bisexto. " );

System.out.println("Obrigada");

  }
}
  
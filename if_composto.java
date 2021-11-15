import java.util.Scanner; 

class if_composto{

  public static void main () {
Scanner entrada = new Scanner(System.in);

float grade1, grade2, grade3, average; 

System.out.print("Digite a 1a nota:"); 
grade1 = entrada.nextFloat();
System.out.print("Digite a 2a nota:"); 
grade2 = entrada.nextFloat();
System.out.print("Digite a 3a nota:"); 
grade3 = entrada.nextFloat();

average =  ( grade1 + grade2 + grade3) / 3; 

if (average >= 7)
{
  System.out.println ("Aprovado com média:" + average); 
  System.out.println ("Parabéns"); 
}
else
{
  System.out.println("Reprovado com média:" + average);
  System.out.println("Não desista você é capaz!" );
}

  System.out.println("Obrigada" );



  }
}
class if_encadeado {
  public static void main() {

  Scanner entrada = new Scanner(System.in);
 
    double salary; 

  System.out.print("Digita o salário:"); 
  salary = entrada.nextDouble(); 

  if (salary <= 1000)
    salary = salary * 1.15; 
    else
    if (salary <= 2000)
    salary = salary * 1.125; 
    else 
    salary =  salary * 1.10; 

    System.out.println("O novo salário é:" + salary); 
  }
}
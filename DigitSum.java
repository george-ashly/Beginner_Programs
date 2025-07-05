import java.util.Scanner; 

public class DigitSum
{
   public static void main(String[] sum)
   {
    System.out.println("Let's begin with the sum of numbers! ");
    
    Scanner sc = new Scanner(System.in); 

    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt(); 

    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt(); 
    
    System.out.println("You entered: " + num1);
    System.out.println("You entered: " + num2);
    sc.close(); 

    int num3 = (num1 + num2); 

    System.out.println("The sum is: " + num3); 
   }

} 


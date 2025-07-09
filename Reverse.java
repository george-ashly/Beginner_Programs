import java.util.Scanner; // import the scanner CLASS

public class Reverse{
    public static void main(String[] n){
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter your number here: "); 
      int num = sc.nextInt(); 

      int i, rev = 0, rem; 

      for(i = 0; num!=0; i++){
        rem = num%10;
        rev = rev*10 + rem; 
        num = num/10;
      }

      System.out.println("The reversed number is: " + rev); 


    }
}
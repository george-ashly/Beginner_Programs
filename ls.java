import java.util.Scanner; 

public class ls{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    int max = Integer.MIN_VALUE; 
    int min = Integer.MAX_VALUE;
    char choice; 


    do { 

        System.out.print("Enter your number: ");
        int num = sc.nextInt(); 

        sc.nextLine(); 

        if (num > max){
            max = num;
        }
        
         if( num < min){
            min = num; 
         } 

         System.out.print("Do you wish to continue: "); 
         choice = sc.next().charAt(0); 


    } while (choice == 'Y' || choice == 'y');

    System.out.println("The largest number is: " +  max);
    System.out.println("The smallest number is:" +  min); 



    }

}
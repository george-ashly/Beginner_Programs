import java.util.Scanner; 

public class calc{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the desired operation [+ | - | * | / ] : "); 
        char choice = sc.next().charAt(0); 

        char ch; 

        System.out.print("Enter the first number: "); 
        int a = sc.nextInt(); 

        System.out.print("Enter the second number: "); 
        int b = sc.nextInt();  

        do { 
            switch(choice){
                 case '+': 
                 System.out.println("Result: " + (a+b));
                 break;

                 case '-':
                 System.out.println("Result: " + (a-b));
                 break;

                 case '/':
                 System.out.println("Result: " + (a/b));
                 break;

                 case '*': 
                 System.out.println("Result: " + (a*b));
                 break; 
            } 
            System.out.print("Do you wish to continue [Y|N]:  "); 
            ch = sc.next().charAt(0); 
        
            }while( ch == 'Y' || ch == 'y');     
            


    }
}
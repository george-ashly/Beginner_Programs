import java.util.Scanner; 

public class Matrics{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in); 

        System.out.println("First Matrix ");

        System.out.print("Enter the number of rows: ");
        int nra = sc.nextInt(); 
        
        System.out.print("Enter the number of coloumns: ");
        int nca = sc.nextInt(); 

        int ra, ca;
        int[][] A = new int[nra][nca];

        for(ra = 0; ra <nra; ra++){
            for( ca = 0; ca < nca; ca++){
                System.out.print("Enter the element: "); 
                A[ra][ca] = sc.nextInt();
            } // FOR 2    
        } // FOR 1

         System.out.println("Second Matrix ");
    
        System.out.print("Enter the number of rows: ");
        int nrb  = sc.nextInt(); 
        
        System.out.print("Enter the number of coloumns: ");
        int ncb = sc.nextInt(); 

        int[][] B = new int[nrb][ncb];
        int rb, cb;

        for(rb = 0; rb<nrb; rb++){
            for( cb =0; cb < ncb; cb ++){
                System.out.print("Enter the element: "); 
                B[rb][cb] = sc.nextInt();
            } // FOR 2    
        } // FOR 1

        if( nra == nrb && nca == ncb){
            System.out.println("The sum of the given two matrices is: "); 
            int[][] C = new int[nra][nca]; 

            for( ra = 0; ra<nra; ra++){
                for( ca = 0; ca<nca; ca++){
                    C[ra][ca] = A[ra][ca] + B[ra][ca];
                }// FOR 2
            } // FOR 1

            for( ra = 0; ra<nra; ra++){
                for( ca = 0; ca<nca; ca++){
                    System.out.println(C[ra][ca] + " "); 
                }// FOR 2
            } // FOR 1


            int [][] D = new int[nca][nra]; 
            System.out.println("The transpose of the resultant matrix is: "); 


            for(ra = 0; ra<nra; ra++){
                for(ca = 0; ca<nca; ca++){
                D[ca][ra] = C[ra][ca];
                System.out.print(D[ca][ra] + " ");
            }
        }
    } // if

        else{
            System.out.println("Since the rows and coloumns dont match, the sum cannot be found! "); 
        }
    } // VOID MAIN

} // CLASS
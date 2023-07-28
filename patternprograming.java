import java.util.Scanner;/**
 * patternprograming
 */
public class patternprograming {

    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.println("enter the number");
        int n=foo.nextInt();
        
        System.out.println(n);

    for (int i = 0; i < n; i++) {
       for (int j= 0; j < n; j++) {
        
           if(i==0||j==0)System.out.print("*");
           else if (i==n-1&&j<=n/2) {
            System.out.println("*");
           }
        else if (i==(n)/2&&j>=n/2) {
         System.out.print("*");
         }
      else if(i>=n/2&&(j==(n-1)||j==(n)/2)) {
   
   System.out.print("*");
    }
           else{
            System.out.print(" ");
           }
           
           
           
        
        }System.out.println();
    }


    }
}
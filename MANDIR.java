import java.util.Scanner;

public class MANDIR {
    public static void main(String[] args) {
        int n=19;
       
           
                for ( int j=0;j<n;j++){

                    for (int i = 0; i < n; i++) {
                        if (i==0||j==0||j==(n-1)/2) {
                            System.out.print("p");
                        } else if (i==n-1&&j<n/2) {
                            System.out.print("p");
                        }else {
                            System.out.print(" ");
                        }
                     }


System.out.println();
}
    }
}
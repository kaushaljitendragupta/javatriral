import java.util.Scanner;
public class pwskill {

    

public static void main(String[] args) {
    int n=9;
   
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
     for ( int i=0;i<n;i++){
        System.out.print(" ");
                }
            for (int index = 0; index < n; index++) {
                if (index==0||index==(n-1)/2||index==n-1||j==n-1) {
                    System.out.print("w");
                } else {
                    System.out.print(" ");
                }
            }    

            for ( int i=0;i<n;i++){
                System.out.print(" ");
                        }
                        for (int i = 0; i< n; i++) {
                            if (j==0||j==n-1||j==(n-1)/2) {
                                System.out.print( "s" );
                            } else if(i==0&&j<n/2){
                                System.out.print( "s" );
                            }else if(i==n-1&&j>n/2){
                                System.out.print( "s" );
                            }
                            else {
                                System.out.print( " " );
                            }
                        }

                        for ( int i=0;i<n;i++){
                            System.out.print(" ");
                                    }

                        for ( int i=0;i<n;i++) {
                            if (i==0||i+j==(n-1)/2||j-i==(n-1)/2) {
                             System.out.print("K");
                            }else
                             System.out.print(" ");
                         }
                         for ( int i=0;i<n;i++){
                            System.out.print(" ");
                                    }

                        for ( int i=0;i<n;i++) {
                            if (j==0||j==n-1||i==(n-1)/2) {
                             System.out.print("I");
                            }else
                             System.out.print(" ");
                         }
                         for ( int i=0;i<n;i++){
                            System.out.print(" ");
                                    }
            
                    for ( int i=0;i<n;i++) {
                       if (i==0||j==(n-1)) {
                        System.out.print("l");
                       }else
                        System.out.print(" ");
                    }for ( int i=0;i<n;i++){
                        System.out.print(" ");
                                }
        
                for ( int i=0;i<n;i++) {
                   if (i==0||j==(n-1)) {
                    System.out.print("l");
                   }else
                    System.out.print(" ");
                }

                System.out.println();
}
}

}
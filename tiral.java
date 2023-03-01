import java.util.Scanner;

/**
 * tiral
 */
public class tiral {

    public static void main(String[] args) {

int n=15;

     
            for (int i = 0; i< n; i++) {
                 //for g ke liye code hai jo mujeh nahi aya tha jo mene ashu se pucha tha;
                 for (int j = 0;  j<n; j++) {
                        // if(i==0||j==0) {
                        // System.out.print( "G" );
                    // }else if (i==n-1&&j<=(n)/2) {
                        // System.out.print( "G" );
                    // } else if (i==(n)/2&&j>=(n)/2) {
                        // System.out.print( "G" );
                    // } else if (i>=(n)/2&&(j==n-1||j==(n)/2)){
                        // System.out.print( "G" );
                    // }else{
                        // System.out.print( " " );
                    // for s ke liye trial;
                        if (i==0||i==n-1||i==(n-1)/2) {
                            System.out.print( "s" );
                        } else if(j==0&&i<n/2){
                            System.out.print( "s" );
                        }else if(j==n-1&&i>n/2){
                            System.out.print( "s" );
                        }
                        else {
                            System.out.print( " " );
                        }


                }System.out.println();
                          
            }
                            
    }
}

import java.util.Scanner;
/**
 * kaushal
 */
public class kaushal {

    public static void main(String[] args) {
        
        int n=8;
        for ( int j=0;j<n;j++){

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
           if (i==0||j==0||i==n-1||j==(n-1)/2) {
            System.out.print("A");
           }else
            System.out.print(" ");
        }
 for ( int i=0;i<n;i++){
            System.out.print(" ");
                    }
                    for ( int i=0;i<n;i++) {
                        if (i==0||j==n-1||i==n-1) {
                         System.out.print("u");
                        }else
                         System.out.print(" ");
                     }

                     for ( int i=0;i<n;i++){
                        System.out.print(" "); }

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
                        System.out.print(" "); }
                                for (int i = 0;  i<n; i++) {
                                    if (i==0||j==(n-1)/2||i==(n-1)) {
                                        System.out.print( "H" );
                                    }else{
                                        System.out.print(" ");
                                    }
                                }
                                for ( int i=0;i<n;i++){
                                    System.out.print(" ");
                                            }
                    
                            for ( int i=0;i<n;i++) {
                               if (i==0||j==0||i==n-1||j==(n-1)/2) {
                                System.out.print("A");
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

                        for ( int i=0;i<n;i++){
                            System.out.print(" ");
                                    }



                                    
                         //for g ke liye code hai jo mujeh nahi aya tha jo mene ashu se pucha tha;
                 for (int i = 0;  i<n; i++) {
                    if(i==0||j==0) {
                    System.out.print( "G" );
                }else if (j==n-1&&i<=(n)/2) {
                    System.out.print( "G" );
                } else if (j==(n)/2&&i>=(n)/2) {
                    System.out.print( "G" );
                } else if (j>=(n)/2&&(i==n-1||i==(n)/2)){
                    System.out.print( "G" );
                }else{
                    System.out.print( " " );
                }
                      
            }
            for ( int i=0;i<n;i++){
                System.out.print(" ");
                        }
                        for ( int i=0;i<n;i++) {
                            if (i==0||j==n-1||i==n-1) {
                             System.out.print("u");
                            }else
                             System.out.print(" ");
                         }
                         for ( int i=0;i<n;i++){
                            System.out.print(" ");
                                    }


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
                         for (int i = 0; i < n; i++) {
                            if (j==0||i==(n-1)/2) {
                                System.out.print("T");
                            } else {
                                System.out.print(" ");
                            }
                         }
                         for ( int i=0;i<n;i++){
                            System.out.print(" ");
                                    }
            
                    for ( int i=0;i<n;i++) {
                       if (i==0||j==0||i==n-1||j==(n-1)/2) {
                        System.out.print("A");
                       }else
                        System.out.print(" ");
                    }

System.out.println();

    }
}}
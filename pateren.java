import java.util.Scanner;
/**
 * pateren
 */
public class pateren {

    public static void main(String[] args) {
         int n=24907;

// for (int i = 0;  i <n;  i++) {
//     for (int j = 0;  j <n  ; j++) {
// if (i+j==(n-1)/2||j-i==(n-1)/2) {
//      System.out.print( i+i);
// }else{
//     System.out.print(" ");
// }
//     }  
    
//     System.out.println();
  
//     }
int count=0;
int last;
for (int index = 0; index <n; index++) {
    

    last=n%10;
    n=n/10;count++;
}System.out.println(count);
int abtakkareverse=0;
for (int index = 0; index <count; index++) {
    

last=n%10;
n=n/10;
abtakkareverse=abtakkareverse*10+last;
}
System.out.println(abtakkareverse);


    }
}
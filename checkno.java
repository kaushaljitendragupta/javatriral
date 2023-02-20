import java.util.Scanner;/**
 * checkno
 */
public class checkno {

    public static void main(String[] args) {
        int number,b,c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number:");
number=scan.nextInt();
c=scan.nextInt();
b=scan.nextInt();
System.out.println("the avg is "+" "+(number+b+c));


    }
}
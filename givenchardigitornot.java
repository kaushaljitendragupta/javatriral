import java.util.Scanner;
/**
 * givenchardigitornot
 */
public class givenchardigitornot {

    public static void main(String[] args) {
        
        char ch;
        Scanner scan = new Scanner(System.in);
        ch=scan.next().charAt(0);
        if (ch>='0'&&ch<'z') {
            System.out.println("it is char "+(int)ch);
        }
    }
}
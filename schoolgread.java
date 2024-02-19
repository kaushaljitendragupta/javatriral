import java.util.Scanner;
/**
 * schoolgread
 */
public class schoolgread {

    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        int n;
        n=foo.nextInt();
        if (n>=90&&n<100) {
            System.out.println("you are geteing a++ gread");
        }else if (n>=70&&n<90) {
            System.out.println("you are geting a");
        } else if (n>=30&&n<70) {
            System.out.println("you are geting b");
        } else {
            System.out.println("you are geting c and you are fail");
        } 
    }
  









}
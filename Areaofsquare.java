import java.util.Scanner;
public class Areaofsquare {

    public static void main(String[] args) {
        int a;
        double PI=3.14;
        System.out.println("Enter the number");
        Scanner scan  = new Scanner(System.in);
         a=scan.nextInt();   
         System.out.println("the area of square is = "+a*a); a++;
         int area=a*a;
         System.out.println("the another metheod of area "+area);  
           System.out.println("the area of circle is  "+area*PI);  
    }
}
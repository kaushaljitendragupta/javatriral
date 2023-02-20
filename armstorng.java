import java.util.Scanner;
public class armstorng {

    public static void main(String[] args) {
         int num,r,tem,sum=0;
         System.out.println("Input a number ");
Scanner scan = new Scanner(System.in);
num=scan.nextInt();
for ( int temp = num;num!=0;num=num/10 ) {
    r=num%10;
    sum=sum+(r*r*r);
    if(sum==temp){
    System.out.println(temp+"arm strong num is ");
    }else{
        System.out.println(temp+" is not arm storng num");
    }


}



    }
}
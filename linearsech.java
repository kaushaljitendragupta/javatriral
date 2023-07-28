import java.util.*;
import java.io.*;
/**
 * linearsech
 */
public class linearsech {

public static void linearsearch(int arr[],int x){
    boolean flack=false ;
 
    for (int index = 0; index < arr.length; index++) {
        if (arr[index]==x) {
         flack=true;
         System.out.println("element is found  on location "+index); 
         break;
        } 
    } if (flack==false) {
        System.out.println("element is not found  on location "); 
    }
}
    public static void main(String[] args) {
        int arr[]={5,6,2,3,1,4};
        int x=4;
 linearsearch( arr, x);
   // binarysearch(arr ,x );
    }
}
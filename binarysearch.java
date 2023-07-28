import java.util.*;
import java.io.*;
/**
 * binarysearch
 */
public class binarysearch {

    public static void Binarysearch(int arr[],int x) {
        int  high=arr.length,low=0,mid=(low+high)/2;
        for (int index = 0; index < arr.length; index++) {
            high=arr.length;
            low=0;
            if (arr[index]==mid) {
        
             System.out.println("element is found  on location "+index); 
             break;
            } else if(arr[index]>mid){
    low=mid+1;
            }else if (arr[index]<mid){
                high=mid-1;
            }
    }}
    public static void main(String[] args) {
        int arr[]={5,6,2,3,1,4};
        int x=4;
 
    Binarysearch(arr ,x );
    }
}
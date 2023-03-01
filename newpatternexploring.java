
public class newpatternexploring {

    public static void main(String[] args) {
        int n=25;
        System.out.println("first  row i=0 wali");
        for (int j = 0;  j< n; j++) {
            for (int i = 0; i< n; i++) {
             
           if ((j-i<=0||i+j<=n-1)) {
            System.out.print("   "); 
           }else{
            System.out.print("*  ");
           }  }
            
          
    

            System.out.println("  ");
        }
    }
}
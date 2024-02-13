import java.util.*;
/**
 * loop
 */
public class loop {

    public static void main(String[] args) {
        
// int n=25; float pi=(22/7);
// for (int index = 0; index < n; index++) {
//     for (int j = 0; j < n; j++) {
//         if (index==(2*pi*(n-1)/2)*(n-1)/2 ) {
//             System.out.print(" ");
//         }
// else{
//     System.out.print("* ");
 
// }


//     }
//     System.out.println();
// }

        int radius =15;
       

        // Loop through rows and columns
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                // Calculate distance from center
                double distance = Math.sqrt(i * i + j * j);

                // Check if within radius (with slight tolerance for rounded output)
                if (distance <= radius + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // New line for each row
        }
    }
}










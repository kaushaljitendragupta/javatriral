import java.util.Scanner;

public class patter {
     public static void main(String[] args) {
         int n = 7;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || j == 0 || i == n - 1 || j == (n - 1) / 2) {
                    System.out.print("A");
                } else
                    System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                if (i == 0 || j == 0 || i == n - 1 || j == (n - 1) / 2 || j == n - 1) {
                    System.out.print("B");
                } else
                    System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                if (i == 0 || j == 0 || j == n - 1) {
                    System.out.print("c");
                } else
                    System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                if (j == 0 || i == n - 1 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("d");
                } else
                    System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                if (i == 0 || j == 0 || j == (n - 1) / 2 || j == n - 1) {
                    System.out.print("E");
                } else {
                    System.out.print(" ");
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                if (i == 0 || j == 0 || i == (n - 1) - (n - 1) || j == (n - 1) - (n - 1) / 2) {
                    System.out.print("f");
                } else {
                    System.out.print(" ");
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                if (i == 0 || j == 0) {
                    System.out.print("G");
                } else if (j == n - 1 && i <= (n) / 2) {
                    System.out.print("G");
                } else if (j == (n) / 2 && i >= (n) / 2) {
                    System.out.print("G");
                } else if (j >= (n) / 2 && (i == n - 1 || i == (n) / 2)) {
                    System.out.print("G");
                } else {
                    System.out.print(" ");
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
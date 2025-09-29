/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathapp;
import java.util.Scanner;

/**
 *
 * @author RIVERA_CPE112
 */
public class MathApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean A = true;
        while (A) {
            System.out.println("=== Math App Menu ===");
            System.out.println("1. Addition of two numbers\n2. Subtraction of two numbers\n3. Multiplication of two numbers\n4. Division of two numbers\n5. Factorial of a number\n6. Power (x^y)\n7. Sum of numbers 1 to N\n8. Check if a number is prime\n0. Exit");
            System.out.print("Enter your choice: ");
            int B = input.nextInt();
            switch (B) {
                case 1:
                    System.out.print("\nEnter first number: ");
                    double C = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double D = input.nextDouble();
                    input.nextLine();
                    double E = C + D;
                    System.out.println("Result: " + E);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String F = input.nextLine();
                    if (F.equals("yes")) {
                    }
                    ;
                    if (F.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;
                case 2:
                    System.out.print("\nEnter first number: ");
                    double G = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double H = input.nextDouble();
                    input.nextLine();
                    double I = G - H;
                    System.out.println("Result: " + I);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String J = input.nextLine();
                    if (J.equals("yes")) {
                    }
                    ;
                    if (J.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;
                case 3:
                    System.out.print("\nEnter first number: ");
                    double K = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double L = input.nextDouble();
                    input.nextLine();
                    double M = K * L;
                    System.out.println("Result: " + M);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String N = input.nextLine();
                    if (N.equals("yes")) {
                    }
                    ;
                    if (N.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;
                case 4:
                    System.out.print("\nEnter first number: ");
                    double O = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double P = input.nextDouble();
                    input.nextLine();
                    double Q = O / P;
                    System.out.println("Result: " + Q);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String R = input.nextLine();
                    if (R.equals("yes")) {
                    }
                    ;
                    if (R.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;
                case 5:
                    System.out.print("\nEnter the number: ");
                    int S = input.nextInt();
                    input.nextLine();
                    int T = S--;
                    while (S >= 1) {
                        int U = T * S;
                        T = U;
                        S--;
                    }
                    System.out.println("Result: " + T);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String V = input.nextLine();
                    if (V.equals("yes")) {
                    }
                    ;
                    if (V.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;

                case 6:
                    System.out.print("\nEnter the base number: ");
                    int W = input.nextInt();
                    System.out.print("Enter The Exponent number: ");
                    int X = input.nextInt();
                    input.nextLine();
                    double Y = Math.pow(W, X);
                    System.out.println("Result: " + Y);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String Z = input.nextLine();
                    if (Z.equals("yes")) {
                    }
                    ;
                    if (Z.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;

                case 7:
                    System.out.print("\nEnter the number: ");
                    int a = input.nextInt();
                    input.nextLine();
                    int b = 0;
                    int c = 1;
                    while (c <= a) {
                        int d = b + c;
                        b = d;
                        c++;
                    }
                    System.out.println("Result: " + b);
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String e = input.nextLine();
                    if (e.equals("yes")) {
                    }
                    ;
                    if (e.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;

                case 8:
                    System.out.print("\nEnter the number: ");
                    int f = input.nextInt();
                    input.nextLine();
                    if (f < 0) {
                        System.out.println("Result: invalid number");
                    } else if (f == 2) {
                        System.out.println("Result: Prime number");
                    } else if (f % 2 == 0) {
                        System.out.println("Result: Even number");
                    } else if (f % 1 == 0) {
                        System.out.println("Result: Prime number");
                    }
                    System.out.print("\nDo you want to perform another computation? (yes/no): ");
                    String g = input.nextLine();
                    if (g.equals("yes")) {
                    }
                    ;
                    if (g.equals("no")) {
                        System.out.println("Thank You");
                        A = false;
                    }
                    break;

                case 0:
                    System.out.println("Thank You");
                    A = false;
                    break;
            }
        }
    }
}

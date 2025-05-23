package java_lessons;

import java.util.Scanner;

public class Polish {
    public static int area (int l, int b){
        return l * b;
    }
    private static int add (int a, int b){
        return a + b;
    }
    public static void maxNumber(int a, int b){
        if (a>b){
            System.out.println(a +" is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("These are same numbers.");
        }
    }

    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);
        System.out.println("Enter Length: ");
        while (!usrInput.hasNextInt()){
            System.out.println("Invalid input. Please put integer.");
            usrInput.next();
        }
        int length = usrInput.nextInt();
        System.out.println("Enter Width: ");
        while (!usrInput.hasNextInt()){
            System.out.println("Invalid input. Please put integer.");
            usrInput.next();
        }
        int width = usrInput.nextInt();
        usrInput.close();
        System.out.println("The area is " + area(length, width));
        System.out.println("The addition of sides: " + add(length, width));
        maxNumber(length,width);
    }
}

package java_lessons;


import java.util.Scanner;

class Calculator {
    public void operation(int a, int b, String operator){
        switch(operator){
            case ("+"):
                System.out.println("The result: " +(a + b));
                break;
            case ("-"):
                System.out.println("The result: " +(a-b));
                break;
            case ("*"):
                System.out.println("The result: " +(a*b));
                break;
            case ("/"):
                if(b != 0) {
                    System.out.println("The result: " + (a / b));
                }else {
                    System.out.println("ERROR");
                }
                break;
            default:
                System.out.println("ERROR");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First num: ");
        int a = scanner.nextInt();
        System.out.println("Second num: ");
        int b = scanner.nextInt();
        System.out.println("Choose operator: (+,-,*,/)");
        String operator = scanner.next();

        Calculator calculator = new Calculator();
        calculator.operation(a,b,operator);
    }
}



package java_lessons;

public class JavaArray {

    public static void main(String[] args) {
        int[] x = new int[10]; //one dimensional array
        //enhanced for loop
        for (int temp: x){
            System.out.println("x = " + temp);
        }
        int[][] b = new int [3][3];
        int temp = 0;
        //setting value to two-dimensional array
        for(int i = 0; i < 3; i++){
            for (int j= 0; j < 3; j++){
                b[i][j] = temp;
                temp += 10;
            }
        }
        //printing value from two-dimensional array
        for(int i = 0; i < 3; i++){
            for (int j= 0; j < 3; j++){
                System.out.println(b[i][j]);
            }
            System.out.println();
        }
        //for loop. (initial value, condition, increment/decrement)
        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }
        //while loop
        int y = 1; //initial value,
        while (y <= 10){ //condition
            System.out.println("y = " + y);
            y++;//increment/decrement
        }
        //do..while loop
        int z = 1;
        do {
            System.out.println("z = " + z);
            z++;
        } while (z <=10);
        //switch case
        int a = 4;
        switch (a){
            case (1):
                System.out.println("a is not 1");
                break;
            case (4):
                System.out.println("a is 4");
                break;
            default:
                System.out.println("no value");
                break;
        }

    }
}

package java_lessons.error_handling.throwandthrows;

public class ProgramA {

    public int divideNums (int a, int b) throws Exception {
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e){
            System.out.println("Program A exception. " + e);
            throw new Exception("Check your numbers");
        }

        return c;
    }
}


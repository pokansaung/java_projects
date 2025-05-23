package java_lessons.error_handling.throwandthrows;

public class ProgramB {

    public static void main(String[] args) {
        ProgramA obj = new ProgramA();
        try {
            System.out.println(obj.divideNums(10, 0));
        } catch (Exception e){
            System.out.println("Program B: " + e.getMessage());
        }
    }

}

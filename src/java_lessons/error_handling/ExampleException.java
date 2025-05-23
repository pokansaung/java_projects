package java_lessons.error_handling;

public class ExampleException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int[] d = new int[4];
        //try{..codes..} catch(Exception "name"){}
        //try-catch ကိုသုံးခြင်းဖြင့် program ရပ်မသွားဘဲ error message ပြ
        try {
            c = a / b;
        } catch (Exception exception){
            System.out.println("Exception occurred. " + exception);
            exception.printStackTrace();
        } finally {
            System.out.println("Will always run");
        }
        System.out.println("C = " + c);

    }
}

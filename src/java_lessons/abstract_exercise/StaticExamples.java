package java_lessons.abstract_exercise;

public class StaticExamples {
    static int staticVariable; //static is one per class (good to use website counter method)
    int nonStaticVariable; //

    //static method can only access other static variables & methods
    public static void staticMethod(){
        System.out.println("Static Variables: " + staticVariable);
        staticVariable++;
    }
    public void nonStaticMethod(){
        System.out.println("Non Static Variables: " + nonStaticVariable);
        nonStaticVariable++;
    }
    static{
        System.out.println("Static block of codes.");
    }
    StaticExamples(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        //static code runs first before the constructor
        StaticExamples obj1 = new StaticExamples();
        obj1.staticMethod();
        obj1.staticMethod();
        StaticExamples.staticMethod();
        obj1.nonStaticMethod();
        obj1.nonStaticMethod();

        System.out.println("---------");
        //static code runs one time only.
        StaticExamples obj2 = new StaticExamples();
        obj2.staticMethod();
        obj2.staticMethod();
        obj2.nonStaticMethod();
        obj2.nonStaticMethod();
    }
}

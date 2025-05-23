package java_lessons.error_handling;

public class Keywords {
    //variable arguments
    public void addNumbers (int ...a){
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }
    //static keyword
    public static void display(){
        System.out.println("This is from static method.");
    }

    //final keyword
    //final can apply to class, data and methods.
    //final data is constant. cannot be changed.
    //final methods cannot be overridden.
    //final classes cannot be sub classed.
    final int a = 1000;


    public static void main(String[] args) {
        Keywords obj = new Keywords();
        obj.addNumbers(20,7,5,3,4,5,5);

        //static method don't need to create object.
        display();


    }
}

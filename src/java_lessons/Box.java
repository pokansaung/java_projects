package java_lessons;
//"extends" keyword is used to define inheritance
//"super" keyword is used to assign superclass data & methods
public class Box { //superclass (parent class)

    public void calculateArea(int length, int width){
        System.out.println("Area from superclass: " + (length * width));
    }



    public static void main(String[] args) {
        NewBox myanmarPost = new NewBox();
        myanmarPost.calculateArea(20,20);

    }
}

class NewBox extends Box { //subclass (child class)

    public void calculateArea(int length, int width){
        super.calculateArea(length,width); //super is used to call superclass method
        System.out.println("Area from subclass: " +(length * width));
    }
}

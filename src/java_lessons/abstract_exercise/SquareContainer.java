package java_lessons.abstract_exercise;

public class SquareContainer extends Container{


    public double calculateAreaOfBase(int length) {
        double area = length * length;
        System.out.println("Square Area : " + area);
        return area;
    }
}

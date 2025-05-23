package java_lessons.abstract_exercise;
//"abstract" ကိုသုံးပြီး abstract class လုပ်။ အဲထဲမှာ abstract method လုပ်
//empty method လုပ်ချင်ရင် abstract class လုပ်
public abstract class Container {
    public void calculateVolume(int length, int height){
        double volume = calculateAreaOfBase(length) * height;
        System.out.println("Volume = " + volume);
    }
//abstract method
    public abstract double calculateAreaOfBase(int length);

}

package java_lessons.backing_property;

public class Person {
    private int _age; // backing property

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this._age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public boolean isAdult() {
        return _age >= 18;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30); // setter ကိုခေါ်ပြီး _age ထဲကို 30 သိမ်းဆည်း
        System.out.println(person.getAge()); // getter ကိုခေါ်ပြီး _age ရဲ့ value (30) ကို ပြန်ထုတ်ပေး
        System.out.println(person.isAdult()); // isAdult method ကိုခေါ်ပြီး _age >= 18 ဆိုတဲ့ condition ကို စစ်ဆေးပြီး true or false ပြန်ထုတ်ပေး
        person.setAge(-5); // setter ကိုခေါ်ပေမယ့် condition မကိုက်ညီလို့ "Invalid age" လို့ ပြသပြီး _age ရဲ့ value မပြောင်းလဲ
    }
}
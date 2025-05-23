package java_lessons.abstract_exercise;
//interface is a class with only empty methods
public interface InterfaceTest {
    public void New();
    public void open();
    public void save();
}
//"implements" keyword is used to extend interface class.
class Excel implements InterfaceTest{

    public void New() {
        System.out.println("New file is created.");
    }

    public void open() {
        System.out.println("File is opened.");
    }

    public void save() {
        System.out.println("File is saved.");
    }

    public static void main(String[] args) {
        Excel file = new Excel();
        file.New();
        file.open();
        file.save();
    }
}


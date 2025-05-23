package java_lessons.company_project;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String companyName;
    public Company(String companyName){
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        //creating Company
        Company company = new Company("Win Thant Trading");
        //creating employees
        Employee alex = new Employee("Alex", 5);
        Employee linda = new Employee("Linda", 6);
        Employee sam = new Employee("Sam", 5);
        Employee dean = new Employee("Dean", 5);
        Employee sara = new Employee("Sara", 7);

        //creating departments
        Department sale = new Department("Sale Department");
        Department it = new Department("IT Department");
        //adding employees to department
        sale.addEmployee(alex);
        sale.addEmployee(linda);
        sale.addEmployee(sam);
        it.addEmployee(dean);
        it.addEmployee(sara);

        System.out.println(company.companyName);
        sale.describe();
        System.out.println();
        it.describe();
    }
}

class Department {
    private final String deptName;
    private double budget;

    //int[] x = new int[5];
    //using array to store employee's data
    //private final Employee[] empData = new Employee[5];

    //using arraylist
    private final List<Employee> empData = new ArrayList<>();
    int counter = 0;

    //constructor is method same name as class.
    //is executed when an object is created.
    //used to set default value.
    //does not return anything including void.
    public Department(String deptName) {
        this.deptName = deptName;
        budget = 50000;
    }

    public void addEmployee(Employee obj) {
        //empData[counter] = obj;
        empData.add(obj);
        counter++;
        if (obj.getGrade() >= 5) {
            this.budget += 1000;
        } else {
            this.budget += 500;
        }
    }

    public void describe() {
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Budget: " + this.budget);
        String temp = "Employee: ";
        for (Employee x : empData) { //array ထဲမှာထည့်ထားတဲ့ data ကို for loop နဲ့ပြန်ထုတ်
//            if (x != null) {
//                temp += x.getEmpInfo()+ "  ";
//            }
            temp += x.getEmpInfo() + "  ";
        }
        System.out.println(temp);
    }
}

class Employee {
    private final String name; //always use private variable in class. use getter and setter to set data.

    private final int grade;
    public int getGrade() {
        return grade;
    }

    //creating employee constructor to set employee name and grade.
    public Employee(String name, int grade) {
        this.name = name; //"this" keyword is used to assign class level data.
        this.grade = grade;
    }
    public String getEmpInfo(){
        return name + "(" + grade + ")";
    }

}



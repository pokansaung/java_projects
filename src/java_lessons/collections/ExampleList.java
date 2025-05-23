package java_lessons.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//all classes extend object class by default (even-though cannot see "extends object")
public class ExampleList {

    public static void main(String[] args) {
        //normal array
        String[] array = new String[10]; //have limit
        array[9] = "Moe Win";
        //array[10] = "Yee Mon"; cannot assign. it is full
        //to avoid this, use ArrayList
        ArrayList myList = new ArrayList();
        //can add any types of data to this list.
        myList.add("Moe Win");
        myList.add(100);
        myList.add(true);
        myList.remove("Moe Win");
        //use "Object" for data type as it extends Object class by default.
        for (Object temp: myList){
            System.out.println(temp);
        }
        System.out.println("------------");
        //Generic list can be specific data
        List<String> list = new ArrayList<>();
        list.add("Moe Win");
        list.add("Yee Mon");
        list.add(0,"Yangon"); //can set index position
        for (String temp: list){
            System.out.println(temp);
        }
        System.out.println("-------------");
        //Hash Map
        //hash map (key, value)
        HashMap hm = new HashMap();
        hm.put("Pyae", 1000);
        hm.put("Yee", 5000);
        //hash map does need to loop. use .get(key)
        System.out.println(hm.get("Pyae"));

    }
}

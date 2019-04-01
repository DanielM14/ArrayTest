import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>();

        Scanner keyboard = new Scanner(System.in);

        String addNames;
        System.out.println("Please Enter 5 Names");
        for (int a = 0; a < 5; ++a){
            System.out.println("Enter " + a + "name: ");
            addNames = keyboard.next();
            names.add(addNames);

        }
        names.add(0, "Sam");
        names.remove(3);
        display(names);
    }
    public static void display(ArrayList<String> names){
        System.out.println("The size of the list is " + names.size());
            for (int i = 0; i < names.size(); ++i){
                System.out.println("Position " + i + " Name. " + names.get(i));
        }
    }
}

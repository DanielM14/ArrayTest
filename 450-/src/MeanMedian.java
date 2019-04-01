import java.util.ArrayList;
import java.util.Scanner;

public class MeanMedian {

    public static void main(String args[]) {
        ArrayList<String> numbers = new ArrayList<String>();

        Scanner keyboard = new Scanner(System.in);

        String addNumbers;
        System.out.println("Please Enter 5 Numbers");
        for (int a = 0; a < 5; ++a) {
            System.out.println("Enter " + a + " Numbers: ");
            addNumbers = keyboard.next();
            numbers.add(addNumbers);
        }
        display(numbers);
    }

    public static void display(ArrayList<String> numbers) {
        System.out.println("The size of the list is " + numbers.size());
        for (int i = 0; i < numbers.size(); ++i) {
            System.out.println("Number Position is " + i + numbers.get(i));
        }
    }
}

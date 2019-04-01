import java.util.ArrayList;
import java.util.Scanner;

public class ArrayText {
    private static int total;
    private static String average;

    public static void main(String args[]){
        ArrayList<Integer> scores = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        int addScores;
        System.out.println("Please Enter 5 Scores");
        for (int a = 0; a < 5; ++a){
            System.out.println("Enter " + a + " Score: ");
            addScores = keyboard.nextInt();
            scores.add(addScores);

        }
        display(scores);

    }
    public static void display(ArrayList<Integer> scores){
        System.out.println("The size of the list is " + scores.size());
        for (int i = 0; i < scores.size(); ++i){
            total = 0;
            System.out.println("Position " + i + " Score. " + scores.get(i));
            total = total + scores.get(i);
        }
        System.out.println("average is " + average);
    }
}
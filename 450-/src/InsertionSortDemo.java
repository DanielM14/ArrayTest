import java.util.Scanner;

public class InsertionSortDemo {

    public static void main(String args[]){
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length -1;

        Scanner keyboard = new Scanner(System.in);
        int temp;

        for (int a = 0; a < someNums.length; ++a){
            System.out.print("Enter number " +  (a + 1) + ">>>");
            someNums[a] = keyboard.nextInt();
        }

        display(someNums, 0);

//        for(int a = 0; a < someNums.length -1; ++a){
//            for(int b = 0; b < comparisonsToMake; ++b){
//                if(someNums[b] > someNums[b + 1]){
//                    temp = someNums[b];
//                    someNums[b] = someNums[b + 1];
//                    someNums[b + 1] = temp;
//                }
//            }
//            display(someNums, (a +1));
//            --comparisonsToMake;
//        }
        int a = 1;
        while(a < someNums.length){
            temp = someNums[a];
            int b = a -1;
            while(b >= 0 && someNums[b] > temp){
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }
    }
    public static void display(int[] someNums, int a){
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; ++x){
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
}


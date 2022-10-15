import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int numArray[]  = new int [10];
        int smallest = 0;

        for (int number: numArray) {
            //numArray[number] = scanner.nextInt();
             int numArray = scanner.nextInt();
            if (numArray < smallest){
                smallest = numArray;
            }
        }

        if(smallest < 10){
            System.out.println("The number is less than 10");
        }else {
            System.out.println("the number is equal or greater than 10");
        }


    }
}

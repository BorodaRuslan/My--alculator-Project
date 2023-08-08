package View;

import Controller.ControllerData;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewOptions {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean lock = true;
    public static int userChoice;
    public static ArrayList<Integer> numberUserInput = new ArrayList<>();
    public static StringBuilder stringBuilder = new StringBuilder();





    public static void options(){

        while (lock) {
            System.out.println("""
                    Choose an operation
                    
                    1. Plus (+)
                    2. Minus (-)
                    3. Multiplication (*)
                    4. Division (/)
                    5. View history.
                    0. Close project.
                    """);

            userChoice = scanner.nextInt();
            lock = false;

            if (userChoice < -0 || userChoice > 5) {
                System.out.println("Error: incorrect data entry!");
                lock = true;
            }

        }

        ViewOptions.getDataFromUser();
         ControllerData.filterOptions(userChoice);




    }
//    public static ArrayList<Integer> getDataFromUser(){
//
//        while (lock) {
//
//            System.out.println("Enter a number\n");
//            Integer number = scanner.nextInt();
//            numberUserInput.add(number);
//            System.out.println(stringBuilder.append(number).append(" + "));
//
//            System.out.println("Let's add another number enter -> Y/N" );
//            if (scanner.nextLine().contains("Y")){
//                lock = true;
//            } else if (scanner.nextLine().contains("N")) {
//                lock = false;
//            }
//        }
//        return numberUserInput;
//    }

        public static ArrayList<Integer> getDataFromUser(){
        ArrayList<Integer> result = new ArrayList<>();

        while (lock) {

            System.out.println("Enter a number\n");
            Integer number = scanner.nextInt();
            result.add(number);
            System.out.println(stringBuilder.append(number).append(" + "));

            System.out.println("Let's add another number enter -> Y/N" );
            if (scanner.nextLine().contains("Y")){
                lock = true;
            } else if (scanner.nextLine().contains("N")) {
                lock = false;
            }
        }
        return result;
    }




    public static void getResult(String result){
        System.out.println(result);
    }
}

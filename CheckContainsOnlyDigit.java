package StringsInJava;

import java.util.Scanner;

public class CheckContainsOnlyDigit {

    static boolean checkContainsOnlyDigits(String str){

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here: ");
        String str = sc.nextLine();

        if (checkContainsOnlyDigits(str)) {
            System.out.println("The string contains only digits");
        }else  {
            System.out.println("The string does not contains only digits");
        }


    }
}

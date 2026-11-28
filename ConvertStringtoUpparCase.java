package StringsInJava;

import java.util.Scanner;

public class ConvertStringtoUpparCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here: ");
        String str = sc.nextLine();

        String upparCase = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);

            }
            upparCase = upparCase + ch;
        }

        System.out.println(upparCase);

    }






}

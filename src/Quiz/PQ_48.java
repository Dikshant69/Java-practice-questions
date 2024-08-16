package Quiz;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char shifted = (char) ((c - base + k) % 26 + base);

                result.append(shifted);
            }
            else
                result.append(c);
        }
        return result.toString();
    }
}

public class PQ_48 {
    public static void main(String[] args) throws IOException {
//        System.out.println("Enter the number of letters: ");
//        String sb=" ";
//        //StringBuilder sb = new StringBuilder();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char[] str = new char[n];
//        for(int i=0; i< str.length; i++){
//            str[i] = sc.next().charAt(i);
//        }
//        sb = str.toString();
//        System.out.println("Enter the value of rotation: ");
//        int k = sc.nextInt();
//
//        String result = Result.caesarCipher(sb, k);
//        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the rotation: ");
        int k = sc.nextInt();

        String result = Result.caesarCipher(str, k);
        System.out.println(result);

        sc.close();
    }
}


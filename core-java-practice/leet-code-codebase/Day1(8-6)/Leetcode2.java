import java.util.Scanner;

public class Leetcode2{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s=sc.next();
        int out=0;
       for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'I') {
            if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                out = out + 4;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                out = out + 9;
                i++;
            } else {
                out = out + 1;
            }
    } 
        else if (s.charAt(i) == 'V') {
            out = out + 5;
        } 
        else if (s.charAt(i) == 'X') {
            if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                out = out + 40;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                out = out + 90;
                i++;
            } else {
                out = out + 10;
            }
        } 
        else if (s.charAt(i) == 'L') {
            out = out + 50;
        } 
        else if (s.charAt(i) == 'C') {
            if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                out = out + 400;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                out = out + 900;
                i++;
            } else {
                out = out + 100;
            }
        } 
        else if (s.charAt(i) == 'D') {
            out = out + 500;
        } 
        else if (s.charAt(i) == 'M') {
            out = out + 1000;
        }
    }
        System.out.print(out);
    }
}
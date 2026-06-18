package day2;

import java.util.Scanner;

public class Black_and_white_painting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,c;
        while(true) {
            n = sc.nextInt();
            m = sc.nextInt();
            c = sc.nextInt();
            if (n == 0 && m == 0 && c == 0) {
                break;
            }
            long positions = (long) (n - 7) * (m - 7);
            long answer;
            if (positions % 2 == 0) {
                answer = positions / 2;
            } else if (c == 1) {
                answer = positions / 2 + 1;
            }
            else{
                answer = positions / 2;
            }
            System.out.println(answer);
        }


    }
}

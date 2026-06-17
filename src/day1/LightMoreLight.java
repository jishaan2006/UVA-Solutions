package day1;

import java.util.Scanner;

public class LightMoreLight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n;
        while((n=sc.nextLong())!=0){
            long root = (long) Math.sqrt(n);
            if (root * root == n) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

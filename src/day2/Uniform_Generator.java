package day2;

import java.util.Scanner;

public class Uniform_Generator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int a= sc.nextInt();
            int b=sc.nextInt();
            if(gcd(a,b)==1){
                System.out.printf("%10d%10d    Good Choice%n%n",a,b);
            }else{
                System.out.printf("%10d%10d    Bad Choice%n%n",a,b);
            }
        }
    }
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}

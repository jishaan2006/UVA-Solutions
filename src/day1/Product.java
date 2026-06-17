package day1;

import java.math.BigInteger;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger x=new BigInteger(sc.next());
            BigInteger y=new BigInteger(sc.next());
            System.out.println(x.multiply(y));
        }
    }
}

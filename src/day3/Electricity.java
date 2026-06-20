package day3;

import java.time.LocalDate;
import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            int consumption = sc.nextInt();

            LocalDate prevDate = LocalDate.of(year, month, day);
            int prevConsumption = consumption;

            int count = 0;
            int total = 0;

            for (int i = 1; i < n; i++) {
                day = sc.nextInt();
                month = sc.nextInt();
                year = sc.nextInt();
                consumption = sc.nextInt();

                LocalDate currDate = LocalDate.of(year, month, day);

                if (prevDate.plusDays(1).equals(currDate)) {
                    count++;
                    total += consumption - prevConsumption;
                }

                prevDate = currDate;
                prevConsumption = consumption;
            }

            System.out.println(count + " " + total);
        }

        sc.close();
    }
}
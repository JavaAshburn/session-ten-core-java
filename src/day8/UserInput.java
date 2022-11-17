package day8;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    int total, math, physics, chemistry, biology, computer;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your name: ");
        String fullName = sc.nextLine();

        System.out.println("Please type your age: ");
        int age = sc.nextInt();

        System.out.println("Enter marks of Math: ");
        int math = sc.nextInt();

        System.out.println("Enter marks of Physics: ");
        int physics = sc.nextInt();

        System.out.println("Enter marks of Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.println("Enter marks of Biology: ");
        int biology = sc.nextInt();

        System.out.println("Enter marks of Computer: ");
        int computer = sc.nextInt();


        int total = physics+chemistry+math+biology+computer;
        int percentage = (total/5);
        System.out.println("Total Marks is : " +total);
        System.out.println("Percentage scored by "+fullName+" of age "+age+ " is " +percentage);


        sc.close();

    }
}

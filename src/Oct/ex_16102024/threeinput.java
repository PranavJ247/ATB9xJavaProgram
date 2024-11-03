package Oct.ex_16102024;

import java.util.Scanner;


public class threeinput {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter first side");
        int side1 = sc1.nextInt();
        System.out.println("enter second side");
        int side2 = sc2.nextInt();
        System.out.println("enter third side");
        int side3 = sc3.nextInt();
        if (side1==side2 && side2==side3) {
            System.out.print("the triangel is equilateral traingle");
        }
        else if (side1!=side2 && side2!=side3 && side1!=side3)
        {
            System.out.print("the triangel is scalen traingle");
        }
        else {
            System.out.print("the triangel is isoceles traingle");
        }
        sc1.close();
        sc2.close();
        sc3.close();
    }
}

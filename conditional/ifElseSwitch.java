package conditional;

import java.util.Scanner;

public class ifElseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Negative Number");
        } else if (a == 0) {
            System.out.println("Number is 0");
        }else {
            System.out.println("Positive number entered");
        }

        int day = sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        //ternary Operator
        a = 5; int b = 10;
        int max = (a > b) ? a : b;
        System.out.println(max); // 10

    }
    }


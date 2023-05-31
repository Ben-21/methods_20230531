import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println(printSum(10, 20));
        System.out.println(printSumPlusString(10, 20));
        System.out.println(calcFak1(5));
        System.out.println(calcFak2(5));
        System.out.println(calcFak3(5));

        inputSum();

    }


    public static int printSum(int a, int b) {
        return a + b;
    }

    public static String printSumPlusString(int a, int b) {
        return "Summe: " + (a + b);
    }

    public static int calcFak1(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calcFak2(int value) {
        int result = value;
        for (int i = value - 1; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static int calcFak3(int value) {
        int result = value;
        int i = value - 1;
        while (i >= 1) {
            result = result * i;
            i--;
        }
        return result;
    }


    public static void inputSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        int input1 = scanner.nextInt();
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        int input2 = scanner.nextInt();

        System.out.println("\n" + "Summe: " +(input1+input2));
    }

}

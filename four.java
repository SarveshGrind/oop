// 4th assingment
import java.util.Scanner;

public class four {

    Scanner sc = new Scanner(System.in);

    void ZeroError() {
        System.out.println("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator = sc.nextInt();
        int division = numerator / denominator;
        try {
            System.out.println("The divison is: " + division);
        } catch (Exception e) {
            System.out.println("Zero Error Occured");
        }
    }

    void ArrayOutOfBonds() {
        System.out.println("Entre the index of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index which you want to find: ");
        int j = sc.nextInt();
        try {
            System.out.println("The value at index " + j + "is :" + arr[j]);
        } catch (Exception e) {
            System.out.println("Array out of bonds error");
        }
    }

    void NullPointer() {
        System.out.println("enter the string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            str = null;
        }

        try {
            System.out.println("the String Length: " + str.length());
        } catch (Exception e) {
            System.out.println("Null pointer Error");
        }
    }

    public static void main(String[] args) {
        four obj = new four();
        obj.ZeroError();
        obj.ArrayOutOfBonds();
        obj.NullPointer();
    }
}

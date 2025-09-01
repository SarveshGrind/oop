// 2nd assingmrnt
import java.util.Scanner;

public class two{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        check(num);

        sc.close();
    }

    public static void check(int a){
        int[] numbers = {1, 2, 3, 4, 5};
        boolean found = false;
        for (int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(a == numbers[i] + numbers[j]){
                    System.out.println("Sum of " + numbers[i] + " and " + numbers[j] + " results in " + a);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("sum of 2 numbers in array doesn't result in" + a);
        }
    }
}
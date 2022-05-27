import java.util.Scanner;

public class halfSumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentnum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentnum;
            if (currentnum > maxNum) {
                maxNum = currentnum;

            }
        }
        int finalSum = sum - maxNum;
        int diff = Math.abs(maxNum - finalSum);
        if (maxNum == finalSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + finalSum);
        }
        if (maxNum != finalSum) {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }


    }
}




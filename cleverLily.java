import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double priceOfLaundry = Double.parseDouble(scanner.nextLine());
        int priceOfToys = Integer.parseInt(scanner.nextLine());
        double presentMoney = 0;
        int presentToys = 0;
        double allMoney = 0;
        double brother = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                presentMoney = presentMoney + 10;
                allMoney = allMoney + presentMoney;
                brother++;
            } else {
                presentToys = presentToys + 1;
            }
        }


        int sumOfToys = presentToys * priceOfToys;
        double saveMoney = allMoney - brother++  + sumOfToys;

        if (saveMoney >= priceOfLaundry) {
            System.out.printf("Yes! %.2f", saveMoney - priceOfLaundry);
        } else {
            System.out.printf("No! %.2f", priceOfLaundry - saveMoney);
        }
    }
}




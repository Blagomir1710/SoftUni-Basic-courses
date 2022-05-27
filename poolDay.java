
import java.util.Scanner;

public class poolDay {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numPeople = Integer.parseInt(scanner.nextLine());
            double tax = Double.parseDouble(scanner.nextLine());
            double priceLounger = Double.parseDouble(scanner.nextLine());
            double priceUmbrella = Double.parseDouble(scanner.nextLine());

            double sumTax = numPeople * tax;
            double sumPriceUmbrella = Math.ceil(numPeople * 0.5) * priceUmbrella;
            double sumPriceLounger = Math.ceil(numPeople * 0.75) * priceLounger;

            double finalPrice = sumTax + sumPriceUmbrella + sumPriceLounger;
            System.out.printf("%.2f lv.", finalPrice);
    }
}

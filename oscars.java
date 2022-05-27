import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfActors = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int numcommittee = Integer.parseInt(scanner.nextLine());

//
        for (int i = 1; i <= numcommittee; i++) {
            String text = scanner.nextLine();
            double pointsOfCommitteePerson = Double.parseDouble(scanner.nextLine());
            int lenText = text.length();
            double calculatePoints = lenText * pointsOfCommitteePerson / 2;
            pointsOfAcademy = pointsOfAcademy + calculatePoints;
            if ( pointsOfAcademy > 1250.5) {
                break;
            }
        }
        if ( pointsOfAcademy< 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!",nameOfActors, 1250.5 - pointsOfAcademy );}
        else System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameOfActors,pointsOfAcademy);


        }
    }

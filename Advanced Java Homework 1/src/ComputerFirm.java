import java.util.Scanner;

public class ComputerFirm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberComputers = Integer.parseInt(scanner.nextLine());
        int sumOfSellings;
        int averageRatings;
        int finishedSellings;

        for (int i = 1; i <= numberComputers; i++) {
            int computerRates = Integer.parseInt(scanner.nextLine());

            int rating = computerRates % 10;
            int avaiableSelling = computerRates - (rating);

            if (rating == 2) {
                finishedSellings = 0;
            } else if (rating == 3) {
                finishedSellings = 50;
            }
        }

    }
}

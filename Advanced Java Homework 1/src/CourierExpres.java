import java.util.Scanner;

public class CourierExpres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kgPratka = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int razstorqnieKm = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double nadcenkaKg = 0;
        double nadcenkaKm = 0;
        double obshtaNadcenka = 0;

        if (type.equals("standard")) {
            if (kgPratka < 1)  {
                price = razstorqnieKm * 0.03;
            } else if (kgPratka < 10) {
                price = razstorqnieKm * 0.05;
            } else if (kgPratka < 40) {
                price = razstorqnieKm * 0.10;
            } else if (kgPratka < 90) {
                price = razstorqnieKm * 0.15;
            } else if (kgPratka < 150) {
                price = razstorqnieKm * 0.20;
            }
        } else if (type.equals("express")) {
            if (kgPratka < 1) {
                price = razstorqnieKm * 0.03;
                nadcenkaKg = 0.8 * 0.03;
                nadcenkaKm = kgPratka * nadcenkaKg;
                obshtaNadcenka = razstorqnieKm * nadcenkaKm;
                price = price + obshtaNadcenka;
            } else if (kgPratka < 10) {
                price = razstorqnieKm * 0.05;
                nadcenkaKg = 0.4 * 0.05;
                nadcenkaKm = kgPratka * nadcenkaKg;
                obshtaNadcenka = razstorqnieKm * nadcenkaKm;
                price = price + obshtaNadcenka;
            } else if (kgPratka < 40) {
                price = razstorqnieKm * 0.10;
                nadcenkaKg = 0.05 * 0.10;
                nadcenkaKm = kgPratka * nadcenkaKg;
                obshtaNadcenka = razstorqnieKm * nadcenkaKm;
                price = price + obshtaNadcenka;
            } else if (kgPratka < 90) {
                price = razstorqnieKm * 0.15;
                nadcenkaKg = 0.02 * 0.15;
                nadcenkaKm = kgPratka * nadcenkaKg;
                obshtaNadcenka = razstorqnieKm * nadcenkaKm;
                price = price + obshtaNadcenka;
            } else if (kgPratka < 150) {
                price = razstorqnieKm * 0.20;
                nadcenkaKg = 0.01 * 0.20;
                nadcenkaKm = kgPratka * nadcenkaKg;
                obshtaNadcenka = razstorqnieKm * nadcenkaKm;
                price = price + obshtaNadcenka;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kgPratka,price);
    }
}


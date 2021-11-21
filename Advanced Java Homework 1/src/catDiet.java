import java.util.Scanner;

public class catDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentMaznini = Integer.parseInt(scanner.nextLine());
        int percentProteini = Integer.parseInt(scanner.nextLine());
        int percentVuglehidrati = Integer.parseInt(scanner.nextLine());
        int sumCalories = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());

        double obshtiGramoveMaznini = (sumCalories * (percentMaznini * 0.01)) / 9;
        double obshtiGramoveProteini = (sumCalories * (percentProteini * 0.01)) / 4;
        double obshtiGramoveVuglehidrati = (sumCalories * (percentVuglehidrati * 0.01)) / 4;
        double foodWeight = obshtiGramoveMaznini + obshtiGramoveProteini + obshtiGramoveVuglehidrati;
        double caloriesPerGramFood = sumCalories / foodWeight;
        int waterPercentResult = 100 - water;
        double finalResult = (caloriesPerGramFood * (waterPercentResult * 0.01));
        System.out.format("%.4f", finalResult);




    }
}
 
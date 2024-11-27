import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Преобразование градусов цельсия в фаренгейты(F = C * 1.8 + 32)
        System.out.println("\t\t\t*** Добро пожаловать в преобразователь цельсия в фаренгейт ***");
        System.out.print("Введите температуру в градусах цельсия: ");
        double cels = new Scanner(System.in).nextDouble();
        int coof1 = 9;
        int coof2 = 5;
        int coof3 = 32;
        System.out.println("Это фаренгейт: " + (cels * coof1 / coof2 + coof3));

        System.out.println("\t\t\t*** Добро пожаловать в конвертер валют ***");
        System.out.print("Введите кол-во рублей для перевода в доллары: ");
        double rubDollar = new Scanner(System.in).nextDouble();
        System.out.print("Введите курс доллара: ");
        double cursDollar = new Scanner(System.in).nextDouble();
        System.out.println("Это " + (rubDollar * cursDollar) + " долларов");

        System.out.print("Введите кло-во рублей для перевода в евро: ");
        double rubEuro = new Scanner(System.in).nextDouble();
        System.out.print("Введите курс евро: ");
        double cursEuro = new Scanner(System.in).nextDouble();
        System.out.println("Это " + (rubEuro * cursEuro) + " евро");
        //Curs euro: 0.009309
    }
}
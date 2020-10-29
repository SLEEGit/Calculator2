import java.util.Scanner;

public class HybridTest {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int answer = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        String operand1 = s.next();
        String operator = s.next();
        String operand2 = s.next();

        try {

            try {
                a = Integer.parseInt(operand1);
                b = Integer.parseInt(operand2);
            } catch (NumberFormatException ne) {
                a = RomanNumeral.romanToArabic(operand1);
                b = RomanNumeral.romanToArabic(operand2);
            }

        } catch (IllegalArgumentException ne) {
        System.out.println("Используйте ТОЛЬКО арабские или ТОЛЬКО римские цифры!");
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            System.out.println("Задано неверное число!");
        } else {
            switch (operator) {
                case "+" -> answer = a + b;
                case "-" -> answer = a - b;
                case "/" -> answer = a / b;
                case "*" -> answer = a * b;
                default -> System.out.println("Задана неверная операция!");
            }
        }
        System.out.println("Output: ");
        System.out.println(answer);

    }

}

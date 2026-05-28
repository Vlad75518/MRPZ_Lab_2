import java.util.Random;

public class StringTransform {
    public static void main(String[] args) {

        Random random = new Random(); // Створюємо генератор випадкових чисел

        int number = random.nextInt(10, 1000000); // Генерує число від 10 до 999999

        String str = String.valueOf(number); // Перетворення числа на рядок
        // Наприклад: 64583 → "64583"

        System.out.println("Вихідне число: " + str);

        String result = transform(str); // Видалення першої цифри та збільшення на 1 другої власним методом

        System.out.println("Результат:     " + result);
    }

    static String transform(String s) {

        String withoutFirst = s.substring(1); // Видалення першої цифри
        // Наприклад: "64583" → "4583"

        int secondDigit = Character.getNumericValue(withoutFirst.charAt(0)) + 1; // Взяття другої цифри

        if (secondDigit < 10) { // Звичайний випадок: 4+1=5 → ставиться нова цифра
            // = "5" + "583"
            // = "5583"
            return secondDigit + withoutFirst.substring(1);
        } else {
            // Особливий випадок: якщо була цифра 9, то 9+1=10
            // Ставимо "10" замість однієї цифри
            // Наприклад: "69583" → "10583"
            return "10" + withoutFirst.substring(1);
        }
    }
}

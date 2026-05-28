public class TextTransform {
    public static void main(String[] args) {

        String text = "java is a powerful language. " +
                "it was created in 1995. " +
                "today it is used everywhere: web, mobile and servers.";

        System.out.println("=== Текст ДО ===");
        System.out.println(text);

        // Розбиваємо по пробілах, робимо першу літеру великою, збираємо назад текст
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0))
                    + words[i].substring(1);
        }
        String result = String.join(" ", words);

        System.out.println("\n=== Текст ПІСЛЯ ===");
        System.out.println(result);
    }
}

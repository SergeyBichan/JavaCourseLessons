package by.academy;

public class strString {
    public static void main(String[] args) {
        String str = "Тестовая строка, с несколькими, запятыми";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',')
                n++;
        }
        System.out.println("У нас есть " + n + " запятых");
    }
}

package by.academy;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }

    private static int getRandom() {
        return (int)(Math.random() * 10);
    }
}

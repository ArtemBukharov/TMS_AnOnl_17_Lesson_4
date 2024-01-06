import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для проверки его наличия в массиве");
        int namber = console.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            if (namber == array[i]);
            {
                System.out.println("Число входит в массив");
                break;

            }
        }
    }
}


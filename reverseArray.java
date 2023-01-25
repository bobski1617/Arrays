import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            int swapIndex = input.length -1 -i;
            String oldIndexI = input[i];
            input[i] = input[swapIndex];
            input[swapIndex] = oldIndexI;

        }
        for (String s : input) {
            System.out.print(s + " ");

        }
    }
}

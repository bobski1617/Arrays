import java.util.Scanner;

public class equalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");


        boolean areIdentical = true;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i].equals(second[i])) {
                sum += Integer.parseInt(first[i]);
                areIdentical = true;
                continue;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                return;
            }

        }

        if (areIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }


    }
}

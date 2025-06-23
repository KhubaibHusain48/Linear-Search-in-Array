import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays = {1, 2, 3, 4, 5, 1, 2, 4, 2, 3};
        System.out.print("Enter Element to find it: ");
        int target = sc.nextInt();
        int count = 0;
       for (int element : arrays) {
            if (target == element) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("YES! Element Found");
            System.out.println("Element found " + count + " times");
        } else
            System.out.println("NO! Element Not Found");
    }
}

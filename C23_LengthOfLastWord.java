import java.util.Scanner;

public class C23_LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println("Length of last word: " + count);
        sc.close();
    }
}

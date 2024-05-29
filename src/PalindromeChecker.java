import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.println(palindromeChecker(str));
    }
    static boolean palindromeChecker(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().contentEquals(sb.reverse());
    }
}

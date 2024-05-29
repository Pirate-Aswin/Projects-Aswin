import java.util.Scanner;
class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        revString(str);
    }

    public static void revString(String str){
        String revstr = "";
        for(int n = str.length()-1;n>=0;n--){
            revstr += str.charAt(n);
        }
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+revstr);
    }
}


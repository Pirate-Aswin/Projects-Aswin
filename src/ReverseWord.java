import java.util.Scanner;

class ReverseWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Reversed Word: "+reverseWord(str));
    }
    static StringBuilder reverseWord(String str){
        String[] rev = str.split(" ");
        StringBuilder revstr = new StringBuilder();
        for(int i=rev.length-1;i>=0;i--){
            revstr.append(rev[i]);
            if(i!=0){
                revstr.append(" ");
            }
        }
        return revstr;
    }
}
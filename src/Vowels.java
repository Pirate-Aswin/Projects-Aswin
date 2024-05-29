import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Vowel Count = "+vowelCount(str));
    }
    static int vowelCount(String str) {
       str= str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            if (isVowel(n)) {
                count+=1;
            }
        }
        return count;
    }

         static boolean isVowel(char r){
            if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                return true;
            }
            return false;
        }




}
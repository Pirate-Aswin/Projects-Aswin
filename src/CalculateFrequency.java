
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateFrequency {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        calculateFrequency(str);
    }
    static void calculateFrequency(String str){
        Map<Character,Integer> frequency = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            if(!frequency.containsKey(c)){
                frequency.put(c,1);
            }else{
                frequency.put(c,frequency.get(c)+1);
            }
        }
        System.out.println(frequency);
    }
}
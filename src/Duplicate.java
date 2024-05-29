import java.util.ArrayList;
import java.util.List;

class Duplicate{
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println(duplicateList(arr));
    }

    static List duplicateList(int[] arr){
        ArrayList<Integer> dup=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(dup.contains(arr[i])){
                    break;
                }
                if(arr[i]==arr[j]){
                    dup.add(arr[i]);
                    break;
                }
            }
        }
        return dup;
    }
}
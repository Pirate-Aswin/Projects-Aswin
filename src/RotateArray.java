import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        RotateArray rs = new RotateArray();
        int[] arr = {8,4,8,2,9,5};
        int key= 2;
        System.out.println("Rotated Array: "+rs.rotateArray(arr,key));
    }
    public List<Integer> rotateArray(int[] arr, int key){
        List<Integer> rot = new ArrayList<>();
        int index=arr.length-1;
        for(int i=0;i<key;i++){
            rot.add(0,arr[index]);
            index-=1;
        }
        for(int i=0;i<index+1;i++){
            rot.add(arr[i]);
        }
        return rot;

    }
}
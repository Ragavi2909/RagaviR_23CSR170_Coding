import java.util.*;
public class Prob1 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secLarg = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]< max && arr[i]>secLarg){
                secLarg = arr[i];
            }else{
                secLarg = -1;
        }
        System.out.print(secLarg);
    }
    
}

import java.util.*;
public class prob3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        str = str.strip();
        int[] freq = new int[20];
        for(int i=0;i<str.length;i++){
            freq[str[i]] += 1;
        }

        int max = freq[0];
        for(int i=0;i<freq.length;i++){
            if(freq[i] > max){
                max = freq[i];
            }
        }
        System.out.print(max);
    }
}

import java.util.*;
public class Prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str[i];
        }

        if(str.equals(rev)){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}

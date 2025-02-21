import java.util.*;
public class ReverseString {
    public void CheckReverse(String str){
        StringBuilder string=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            string.append(str.charAt(i));
        }
        System.out.print("Reversed string : "+string);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ReverseString object=new ReverseString();
        object.CheckReverse(str);
        sc.close();
    }
}

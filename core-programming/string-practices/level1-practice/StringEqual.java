import java.util.*;
public class StringEqual{
    public String equalorNot(String str1,String str2){
        int a=str1.length();
        int b=str2.length();
        if(a!=b){
            return false;
        }
        for(int i=0;i<a;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(str1.equals(str2) && equalorNot(str1,str2)){
            System.out.print("Equal");
        }
        else{
            System.out.print("Not Equal");
        }
    }
}
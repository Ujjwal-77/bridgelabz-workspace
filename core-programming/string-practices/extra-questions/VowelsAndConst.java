import java.util.*;
public class VowelsAndConst{
    public void VowelConstCount(String str){
        str.toLowerCase();
        int vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowelcount++;
            }
            else if(str.charAt(i)==' '){
                continue;
            }
            else{
                consonantcount++;
            }
        }
        System.out.println("Vowels Count : "+vowelcount);
        System.out.println("Consonant Count : "+consonantcount);
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        VowelsAndConst object=new VowelsAndConst();
        object.VowelConstCount(str);
        scanner.close();
    }
}//char.isAlphabetic(charracter)
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args)
    {
        String str1="tim pane";
        String str2="pane tim";
        boolean result=checkAnagram(str1,str2);
        System.out.println("Result of trwo string being Anagram is : "+result);
    }
    public  static boolean checkAnagram(String str1, String str2)
    {
        String temp1=str1.replace(" ","");
        String temp2=str2.replace(" ","");
        char[] c1=temp1.toCharArray();
        char[] c2=temp2.toCharArray();
        if(c1.length!=c2.length)
        {
            return false;
        }
        else{
            Arrays.sort(c1);
            Arrays.sort(c2);
           return Arrays.equals(c1,c2);

        }


    }
}

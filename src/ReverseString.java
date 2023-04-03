// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ReverseString {
    public static void main(String[] args) {
        String msg="Hello I am from Mars";
               firstWay(msg);
               secondWay(msg);

    }
    public  static void secondWay(String msg)
    {
        StringBuilder sb= new StringBuilder(msg);
        sb.reverse();
        System.out.println(sb);
    }
    public static void firstWay(String msg)
    {
        String reverseString="";
        for(int i=msg.length()-1;i>=0;i--)
        {
            reverseString=reverseString+msg.charAt(i);
        }
        System.out.println("Reversed String is : "+reverseString);

    }
}
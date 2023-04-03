import java.util.*;

public class FindOccurenceOfEveryChar {
    public  static  void main(String[] args) {
        String str = "This is why i told you keep trying";
        firstWay(str);
        System.out.println("************************************************");
        secondWay(str);
    }

    public  static void firstWay(String str)
    {
        String str1=str.replace(" ","");
        char[] chars=str1.toCharArray();
        Map<Character,Integer> charMap=new HashMap<>();

        for(char a:chars)
        {
            if(charMap.containsKey(a))
            {
                charMap.put(a,charMap.get(a)+1);
            }
            else {
                charMap.put(a,1);
            }
        }
        for (Map.Entry<Character,Integer> data:charMap.entrySet()) {
            System.out.println(data.getKey()+" is "+data.getValue()+" times.");
        }

    }
    public  static void secondWay(String str)
    {
        char[] chars=str.replace(" ","").toCharArray();
        Set<Character> charSet=new HashSet<>();
        for(char a:chars)
        {
            charSet.add(a);
        }
        Iterator<Character>it=charSet.iterator();
        while (it.hasNext())
        {
            char a =it.next();
            System.out.println(a+" is :"+FindOccurenceNum(str,a)+" times");

        }

    }
    public static int FindOccurenceNum(String s,char c)
    {
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}

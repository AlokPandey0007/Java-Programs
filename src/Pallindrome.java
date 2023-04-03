public class Pallindrome {
    public  static  void main(String[] args)
    {
        String a="1221";
       boolean result= checkPallindromeStringTwo(a);
        System.out.println("Given number/String is :"+result);
        int num=1221;
        boolean resultNum=checkPallindromeInt(num);
        System.out.println("Given number is :"+resultNum);
    }
    public static boolean checkPallindromeStringOne(String  msg)
    {
       String rev="";
       for(int i=msg.length()-1;i>=0;i--)
       {
           rev=rev+msg.charAt(i);

       }
        boolean flag=false;
        if(rev.equals(msg))
        {
            flag =true;
        }
        else {
            flag=false;
        }
        return flag;
    }
    public static boolean checkPallindromeStringTwo(String  msg)
    {
        int i=0;
        int j=msg.length()-1;
        boolean flag=false;
        while(i<j)
        {
            if(msg.charAt(i)==msg.charAt(j))
            {
                flag=true;
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static boolean checkPallindromeInt(int num)
    {
        int revInt=0;
int num2=num;
        while(num>0)
        {
            revInt=revInt*10+num%10;
            num=num/10;
        }
        System.out.println(revInt);
       boolean flag=revInt==num2?true:false;
       return flag;


    }
}

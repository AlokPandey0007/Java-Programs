public class FindOccurenceOfGivenChar {
    public  static  void main(String[] args)
    {
        String str="This is why i told you keep trying";
        //find occurence of i
        int count=0;
        for(int i=0;i< str.length();i++)
        {
            if(str.charAt(i)=='i')
            {
                count++;
            }
        }
        System.out.println("i is : "+count+" times.");
    }
}

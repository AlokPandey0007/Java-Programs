public class SwapNumWithoutTemp {
    public static void main(String[] args)
    {
        int x=100;int y=200;
        y=x+y;
        x=y-x;
        y=y-x;
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}

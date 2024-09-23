public class NtoOne {
    public static void main(String[] args)
    {
        NtoOne o = new NtoOne();
        o.recursionNtoOne(10);
    }

    public void recursionNtoOne(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        recursionNtoOne(n-1);
    }
}

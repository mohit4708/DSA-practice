public class OnetoN {
    public static void main(String[] args)
    {
        OnetoN o = new OnetoN();
        o.recusrsiveOnetoN(10);
    }

    public void recusrsiveOnetoN(int n){
       if(n==0){
           return ;
       }
        recusrsiveOnetoN(n-1);
        System.out.println(n);
    }
}

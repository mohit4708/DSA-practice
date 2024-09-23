public class SumofNnumbers {
    public static void main(String[] args)
    {
        SumofNnumbers s = new SumofNnumbers();
        int n=15;
        int result = s.sum(n);
        System.out.println("The sum of 1 to "+n+" is: "+result);
    }

    public int sum(int n){
        if(n==0){
            return 0;
        }

        return n+sum(n-1);
    }
}

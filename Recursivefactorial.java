public class Recursivefactorial {
    public static void main(String[] args){
        Recursivefactorial rf = new Recursivefactorial();
        int n = 5;
        int result = rf.factorial(n);
        System.out.println("The factorial of "+n+" is :"+result);
    }

    public int factorial(int n){
        if(n==0||n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
}

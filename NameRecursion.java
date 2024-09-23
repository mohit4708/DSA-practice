public class NameRecursion {
    public static void main(String[] args){
       NameRecursion nr = new NameRecursion();
       nr.nameRecursion("Mohit",10);
    }

    public void nameRecursion(String name, int n){
        if(n==0){
            return ;
        }
        System.out.println(name);
        nameRecursion(name,n-1);
    }
}

public class stringPalindrome
{
    public static void main(String[] args){
        String s="malayalam";
        stringPalindrome sp = new stringPalindrome();
        String pal = sp.reverseString(s,"",s.length()-1);
        if(s.equals(pal)) {
            System.out.println("The given String is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    public String reverseString(String s,String rev, int i){
        if(i==0){
            return s.charAt(i)+rev;
        }
        rev +=s.charAt(i);
        return rev + reverseString(s,"",i-1);
    }
}

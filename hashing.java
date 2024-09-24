import java.util.Scanner;

public class hashing {
    public static void main(String[] args){
        int n=7;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        hashing hs = new hashing();
        int maxEl = hs.maxElement(arr);

        int[] hash = new int[maxEl+1];
        for(int i=0;i<n;i++){
            hash[arr[i]] +=1;
        }

        System.out.println("Count of Array elements :");
        for(int i=0;i<hash.length;i++){
            if(hash[i]>0) {
                System.out.println("The count of element "+(i)+" in the array is "+hash[i]);
            }
        }
    }
    public int maxElement(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
}

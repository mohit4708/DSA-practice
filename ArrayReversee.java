public class ArrayReversee {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        ArrayReversee ar = new ArrayReversee();
        ar.reverse(arr,0,n);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void reverse(int[] arr, int i, int n){
        if(i==n/2){
            return;
        }
        int j=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=j;
        i++;
        reverse(arr,i,n);
    }
}

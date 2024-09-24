import java.util.Arrays;

public class BinarySearch {
    /* Binary search only works on sorted arrays */
    public static void main(String[] args){
        int[] arr = {30,2,4,98,1,79,3};
        int key = 89;
        Arrays.sort(arr);
        int low=0,high=arr.length-1;
        int count =0 ;
        while(low<high){
            int mid = (low+high)/2;

            if(arr[mid]==key){
                System.out.println("The key was found at index :"+mid);
                count++;
                break;
            }
            else if(arr[mid]<key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(count==0){
            System.out.println("Element not found");
        }
    }
}

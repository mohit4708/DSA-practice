public class LinearSearch {

    public static void main(String[] args){
        int[] arr = {30,2,4,98,1,79,3};
        int key = 89;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("The key was found at index "+i);
                flag=1;
            }
        }

        if(flag==0){
            System.out.println("The key was not found");
        }
    }
}

public class highestFreqElement {
    public static void main(String[] args){
        int[] arr = {19,20,4,19,3,19,4,19};
        highestFreqElement he = new highestFreqElement();
        int max = he.maxElement(arr);

        /* creating hash array */

        int[] hash = new int[max+1];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]] +=1;
        }

        int element = he.highestFrequency(hash);
        System.out.println("The highest frequency element is :"+element);

    }

    public int maxElement(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public int highestFrequency(int[] hash){
        int maxC=0 , ele=0;
        for(int i=0;i<hash.length;i++){
            if(maxC<hash[i]){
                maxC = hash[i];
                ele = i;
            }
        }

        return ele;
    }
}

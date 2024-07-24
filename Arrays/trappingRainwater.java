public class trappingRainwater{
    public static void main(String[] args) {
        int arr[]={4,2,4,8,8,5,4,2,10};
        int n=arr.length;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int i=0;
        int volume=0;
        int count=0;
        while (i<n) {
            //finding the left max;
            if(i==0){
                leftMax=arr[i];
            }
            else{
                for(int j=i;j>=0;j--){
                    if(arr[j]>leftMax){
                        leftMax=arr[j];
                    }
                }
            }

            //finding the right max
            for(int k=i;k<n;k++){
                if(arr[k]>rightMax){
                    rightMax=arr[k];  
                }
            }
            
            int watertrap=Math.min(rightMax, leftMax);

            volume=volume+(watertrap-arr[i]);
            i++;
            leftMax=Integer.MIN_VALUE;
            rightMax=Integer.MIN_VALUE;
            count++;
        }

        System.out.println();
        System.out.println(volume);
        System.out.println(count);
    }
}
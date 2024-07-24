public class buble {
    public static void sortColors(int[] nums) {
        
        int n=nums.length;

        //now their would be the outer loop for the number of terns

        int i=0;
        while (i<n) {
            //inner loop for sorting the elements
            for(int j=0;j<=n-2-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
            i++;
        }
        for(int j=0;j<n;j++){
            System.out.print(nums[j]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};

        sortColors(nums);
    }

}

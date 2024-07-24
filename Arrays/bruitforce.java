public class bruitforce {
    //find the maximum sub array sum using bruit force method
    public static void main(String[] args) {
        int arr[]={2,1,4,0,2,5};
        int maximumSubArraySum=Integer.MIN_VALUE;
        int minumSubArraySum=Integer.MAX_VALUE;
        int n=arr.length;
        int i=0;
        int sum=0;
        int count=0;
        boolean isAchived=true;
        int minLength=Integer.MAX_VALUE;
        while (i<n) {
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                    count++;
                }
                System.out.print(" = "+sum);
                if(sum>maximumSubArraySum){
                    maximumSubArraySum=sum;
                }
                if(sum==14){
                    isAchived=false;
                    if(minLength>count){
                        minLength=count;
                    }
                }
                if(minumSubArraySum>sum){
                    minumSubArraySum=sum;
                }
                sum=0;
                count=0;
                System.out.println();
            }
            
            System.out.println();
            i++;
        }
        System.out.println("Maximum sub array sum : "+maximumSubArraySum);
        System.out.println("Minimum sub array sum : "+minumSubArraySum);
        System.out.println(minLength);


    }
}

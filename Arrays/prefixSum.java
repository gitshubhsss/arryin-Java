public class prefixSum {
    public static void main(String[] args) {

        int arr[]={-2,3,-1,4,3};
        int n=arr.length;
        int prefixSum[]=new int [n];

        prefixSum[0]=arr[0];

        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];//adding the elemennts in the prefix sum
        }
        //if you wants to check prefix sum
        for(int i=0;i<n;i++){
            System.out.print(prefixSum[i]+" ");
        }

        //now we are going to use 2 for loops 

    }   
}

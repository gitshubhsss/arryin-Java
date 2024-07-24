public class stockSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        int maxStock=Integer.MIN_VALUE;
        int maxProfit=0;
        int i=0;
        while (i<n) {
            for(int j=i+1;j<n;j++){
                maxProfit=arr[j]-arr[i];
                if(maxProfit<0){
                    maxProfit=0;
                }
                if(maxProfit>maxStock){
                    maxStock=maxProfit;
                }
            }
            i++;
        }
        System.out.println(maxStock);
    }
}

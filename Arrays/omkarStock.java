public class omkarStock {
    public static void main(String[] args) {
        int arr[]={10,7,1,5,3,6,4,9};
        int maxProfit=0;
        int minPrice=arr[0];
        for(int i=0;i<arr.length;i++){
            int profit = arr[i]-minPrice;
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }
            if(maxProfit < profit){      
                maxProfit = profit;
            }
           
        }
        System.out.println(maxProfit);
    }
}

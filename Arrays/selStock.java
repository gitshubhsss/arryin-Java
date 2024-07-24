public class selStock {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 1,10,5, 3, 6, 4 };
        int n = arr.length;
        // int maxStock = Integer.MIN_VALUE;
        int maxProfit = 0;
        int start = 0;
        int end=n-1;
        int c=1;
        while (start<end) {
            int profit = arr[end] - arr[start];
            if(profit>maxProfit){
                maxProfit=profit;
            }
           
            if(start<end){
                end--;
            }

            if(start==end){
                end=n-1;
                start++;
            }
         
           
        }
        System.out.println(maxProfit);
        
        }
        
    }


public class sortArray {
    public static void main(String[] args) {
        int arr[]={2,4,8,0,5,6};
        int n=arr.length;
        int i=0;
        int whil=0;
        int fur=0;
        while (i<n) {
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                fur++;
            }
            i++;
            whil++;
            
        }
        int time=whil+fur;
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println(time);
    }
}

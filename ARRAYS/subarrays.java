
public class subarrays {
    public static void printSubarrays(int arr[]){
        int ts=0;
       
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                  int sum=0;
             for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
              
               sum+=arr[k];
             }
              ts++;
              System.out.println("sum is"+sum);
             System.out.println();
             
            }
           
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubarrays(arr);
    }

    
}

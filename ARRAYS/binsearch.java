public class binsearch {
    public static int binSearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){//key lies in first half
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return -1;//key not found
    }
    public static void main(String[] args) {
        int arr[]={12,10,8,6,4,2};
        int key=12;
        System.out.println(binSearch(arr, key));
    }
    
}

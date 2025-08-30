import java.util.*;
public class largesmallnum{
    public static void getlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=largest){
                largest=arr[i];
            }

        }
        System.out.println("largest number is:"+ largest);
    }
    public static void getsmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=smallest){
                smallest=arr[i];
            }

        }
        System.out.println("smallest number is:"+ smallest);
    }
    public static void main(String[] args) {
        int arr[]={-1,2,-
            6,3,5};
        getlargest(arr);
        getsmallest(arr);

    }

}
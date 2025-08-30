import java.util.*;
public class linearsearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;//means not found
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,10,12,16};
        int key=10;
        System.out.println(linearSearch(arr, key));
    }
    
}

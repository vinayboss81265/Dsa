// import java.util.Arrays;
import java.util.*;
import java.util.Collection;
public class bubblesort {
    public static void bubbleesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
             int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                     minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
                    
        }
    }
     
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>curr) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }


    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void countsort(int arr[]){
        int n=arr.length;
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                largest=Math.max(largest, arr[i]);
            }

            int count[]=new int[largest+1];
            for(int i=0;i<n;i++){
                count[arr[i]]++;
            }

            int j=0;
            for(int i=0;i<count.length;i++){
                if(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
    }
   public static void main(String[] args) {
    //    int []arr={5,4,1,3,2};
       int arr[]={1,4,1,3,2,4,3,7};
       countsort(arr);
        //  bubbleesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collection.reverseOrder());
         printarray(arr);
   }
}

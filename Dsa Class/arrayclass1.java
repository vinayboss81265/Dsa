import java.util.*;
public class arrayclass1 {
    // public static void update(int marks[]){
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;
    //     }
    // }
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int getlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }

        System.out.println("Smallest element: "+smallest);
        return largest;
    }
    public static int binarysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
    }
    public static void printpairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+tp);
    }
    public static void printsubarrays(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays: "+ts);
    }
    public static void main(String[] args) {





        // int marks[]={97,98,99};
        // update(marks);

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }
        /////////////linear search
        /// 
        // int num[]={2,4,6,8,10,12,14,16};

        // int key=20;

        // int index=linearsearch(num,key);

        // if(index==-1){
        //     System.out.println("Not present element");
        // }
        // else{
        //     System.out.println("Present element this index: "+index);
        // }
         //////////////////find largest and smallest number
        //   int num[]={1,2,6,3,4};

        //   System.out.println("Largest element: "+getlargest(num));


////////////////////////////////binary search
/// 
    //  int num[]={2,4,6,8,10,12,14,16};

    //     int key=4;

    //     int index=binarysearch(num,key);
        
    //     System.out.println("index for key is: "+index);

////////////////////////////////reverse of array
    //    int num[]={2,4,6,8,10};

    //    reverse(num);

    //    for(int i=0;i<num.length;i++){
    //     System.out.print(num[i]+" ");
    //    }
    ////////////////////print the pair 
    //   int num[]={2,4,6,8,10};
     
    //  printpairs(num);
    ///////////////////////print the subarrays
    /// 
    int num[]={2,4,6,8,10};
     
    printsubarrays(num);
         
 










        /////////////////////////////////////
        // int marks[]=new int[5];

        // Scanner sc=new Scanner(System.in);

        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("Physics: "+marks[0]);
        // System.out.println("Physics: "+marks[1]);
        // System.out.println("Physics: "+marks[2]);

        // marks[0]=87+1;

        // System.out.println("Percentage of all marks: "+(marks[0]+marks[1]+marks[2])/3+"%");
        // System.out.println("Physics: "+marks[0]);


        // System.out.println(marks.length);
        /////////////////////////////////////
        

    }
}
public class Recursion {
    public static void printnumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        printnumber(n-1);
        System.out.print(n+" ");
    } 
    public static int factorial(int n){
        if(n==0){
            
            return 1;
        }
        
        int fact=n*factorial(n-1);
        return fact;
    } 
    public static int printsum(int n){
        if(n==1){
            
            return 1;
        }
        
        int fact=n+printsum(n-1);
        return fact;
    } 
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib=fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
    public static boolean isSorted(int arr[],int i){
         if(i==arr.length-1){
            return true;
         }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurr(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         
        return firstOccurr(arr, key, i+1);

    }
    public static int LastOccurr(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         
        return LastOccurr(arr, key, i-1);

    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        return x*power(x, n-1);
    }
    public static int optimizepower(int a,int n){
        if(n==0){
            return 1;
        }

        int halfpower=optimizepower(a, n/2);
        int halfpowerans=halfpower*halfpower;
        if(n%2!=0){
            halfpowerans=a*halfpowerans;
        }
        return halfpowerans;
        //////////////
        // int ans=optimizepower(a, n/2);
        // if(n%2==0){
        //     return ans*ans;
        // }
        // else{
        //     return a*ans*ans;
        // }
    }
    public static void main(String[] args) {
        ///print the number n ot 1
        // printnumber(6);
        ///////////factorial
        // System.out.println("Factorial of n numbers: "+factorial(5));
        // System.out.println("printsum of n numbers: "+printsum(5));

        ////////////fibonnaci
        // System.out.println(fibonacci(5));
        // //////////sorted or not
        // int arr[]={1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));
        //////////////////////////////
        //  int arr[]={8,3,6,9,5,10,2,5,3};
        //  System.out.println(firstOccurr(arr, 5, 0));
        //  int arr[]={5,5,5,5};
        //  int n=arr.length-1;
        //  System.out.println(LastOccurr(arr, 5, n));
        ///////////power x to n
        // System.out.println(power(2, 10));
        System.out.println(optimizepower(2, 10));
    }
}

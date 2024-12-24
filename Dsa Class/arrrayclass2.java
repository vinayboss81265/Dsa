public class arrrayclass2 {

    public static void maxsubarraysum(int arr[],int n){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("total subarrays sum:"+maxsum);
    }

    public static void maxsubarraysum1(int arr[],int n){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;

                    currsum+=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("total subarrays sum:"+maxsum);
    }
    public static void kadanes(int arr[]){
          int ms=Integer.MIN_VALUE;
          int cs=0;
          for(int i=0;i<arr.length;i++){
             cs+=arr[i];
             if(cs<0){
                cs=0;

            }
             ms=Math.max(ms,cs);
          }

          System.out.println("max sum: "+ms);
    }
    ////////////tapped water
    public static int trappedwater(int height[]){
          int n=height.length;
          int leftmax[]=new int[n];
          leftmax[0]=height[0];
          for(int i=1;i<n;i++){
              leftmax[i]=Math.max(height[i],leftmax[i-1]);
          }

          int rightmax[]=new int[n];
          rightmax[n-1]=height[n-1];
          for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
          }
         
          int trappedwater=0;
          for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
          }
            
       return trappedwater;
    }

    public static int buyAndStock(int prices[]){
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){

            int diff=prices[i]-mini;
            profit=Math.max(profit,diff);
            mini=Math.min(prices[i],mini);
        }

        return profit;
    }
    public static void main(String[] args) {
        // int arr[]={1,-2,6,-1,3};
        // int n=arr.length;
        // maxsubarraysum(arr,n);
        // maxsubarraysum1(arr,n);
        //////////kadanes algo
        /// 
        //  int arr[]={-2,-3,4,-1,-2,1,5,-3};
        //  kadanes(arr);
        // ////////////tapped water
        // int arr[]={4,2,0,6,3,2,5 };
        // System.out.println(trappedwater(arr));
        ////////////buys and sell stocks 
        int arr[]={7,1,5,3,6,4};
        System.out.println(buyAndStock(arr));
    }

}

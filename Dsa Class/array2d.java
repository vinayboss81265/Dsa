import java.util.Scanner;

public class array2d{
    // public static boolean search(int matrix[][],int key){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //                if(matrix[i][j]==key){
    //                 System.out.println("fount at elment this index:("+i+","+j+")");
    //                 return true;
    //                }
    //         }
    //     }
    //     return false;
    // }
    // public static int maximum(int matrix[][]){
    //     int maxi=Integer.MIN_VALUE;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             maxi=Math.max(maxi,matrix[i][j]);
    //         }
    //     }
    //     return maxi;
    // }
    // public static int minimum(int matrix[][]){
    //     int mini=Integer.MAX_VALUE;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             mini=Math.min(mini,matrix[i][j]);
    //         }
    //     }
    //     return mini;
    // }

    public static void printspiral(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int startrow=0;
        int startcol=0;
        int endrow=n-1;
        int endcol=m-1;

        while (startrow<=endrow && startcol<=endcol) {
            //top
            for(int j=startcol;j<=endcol;j++){
                    System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                    System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if (startrow==endrow) {
                    break;
                }
                    System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if (startcol==endcol) {
                    break;
                }
                
                    System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();

    }

    public static boolean searchforsorted(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if(matrix[row][col]==key){
                System.out.println("found the element this index:("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found !");
        return false;
    }
    public static int digonalsum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        ////optimize
        for(int i=0;i<matrix.length;i++){
            //pr
            sum+=matrix[i][i];
            //sc
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void printarray(int matrix[][]){
        System.out.println("the matrix is :");

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
             System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
          
        }
    }
    public static void main(String[] args) {
        // int matrix[][]=new int[2][3];
        // int n=2,m=3;
        // Scanner sc=new Scanner(System.in);
        int row=2,col=3;
        int matrix[][]={{2,3,7},
                        {5,6,7}};

        
        printarray(matrix);

        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        
       printarray(transpose);
        // search(matrix, 6);

        // System.out.println("Maxi value:"+maximum(matrix)); 
        // System.out.println("Mini value:"+minimum(matrix)); 

        ///spiral matrix
        // int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
        // int matrix[][]={{10,20,30,40},
        //                 {15,25,35,45},
        //                 {27,29,37,48},
        //                 {32,33,35,50}};

    //   printspiral(matrix);
    ///
        // System.out.println(digonalsum(matrix)); 
        /////
        /// 
        // searchforsorted(matrix, 33);
  }
}
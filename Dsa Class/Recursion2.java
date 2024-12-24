public class Recursion2 {
    public static int tillingproblem(int n){
        if(n==0 ||n==1){
            return 1;
        }

        int veticalplaced=tillingproblem(n-1);
        int horizontalplaced=tillingproblem(n-2);

        int totolways=veticalplaced+horizontalplaced;
        return totolways;
    }

    //////////remove duplicate
    public static void removeduplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeduplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            removeduplicate(str, idx+1, newstr.append(currchar), map);
        }
    }
    //////////////friend pairing problem
    public static int friendparing(int n){
        if(n==1 || n==2){
            return n;
        }

        //single
        // int single=friendparing(n-1);

        // //pair
        // int pairfrd=friendparing(n-2);
        // int pairways=(n-1);
        
        // int totolways=single+(pairways*pairfrd);

        // return totolways;

        //sortcut
        return friendparing(n-1) + (n-1)*friendparing(n-2);
    }

    //binary string problem placed 0 or 1
    public static void printbtoS(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        if(lastplace==0){
            printbtoS(n-1, 0, str+"0");
            printbtoS(n-1, 1, str+"1");
        }
        else{ //lastplace 1 hua tu 0 placed kar skata hai bass
            printbtoS(n-1, 0, str+"0");
        }
    }

    //find length of string
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }

        return length(str.substring(1))+1;
    }
    public static void main(String[] args) {
        // System.out.println(tillingproblem(4));

        String str="appnnacollege";
        // removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);


        // System.out.println(friendparing(3));

        // printbtoS(3, 0, "");

        //find length
        System.out.println(length(str));
    }
}

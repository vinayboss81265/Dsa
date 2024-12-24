
import java.util.*;

import javax.management.openmbean.SimpleType;
public class string{

    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        /////////or
        // for(int i=0;i<str.length()/2;i++){
        //     int n=str.length();
        //     if(str.charAt(i)!=str.charAt(n-1-i)){
        //         return false;
        //     }
        // }
        // return true;
    }

    public static float getshortestpath(String str){
        int n=str.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
             char dir=str.charAt(i);
             if(dir=='S'){
                y--;
             }
             else if(dir=='N'){
                y++;
             }
             else if(dir=='W'){
                x--;
             }
             else{
                x++;
             }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);
    }

    public static String substring(String str,int st,int ed){
          String ans="";
          for(int i=st;i<ed;i++){
               ans+=str.charAt(i);
          }
         return ans;
    }
    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            ans+=str.charAt(i);
            if(count>1){
                ans+=count.toString();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");

        // Scanner sc=new Scanner(System.in);
        // // String name=sc.next();
        // String name=sc.nextLine();
        // System.out.println(name);
     

         //////////find length
        //  String fullname="Vinay kumar";
        //  System.out.println(fullname.length());

         // concatenation
        //  String firstname="Vinay";
        //  String lastname="Kumar";
        //  String ftol=firstname+" "+lastname;
        //  System.out.println(ftol);


        /// find the one one charter
        // for(int i=0;i<ftol.length();i++){
        //     System.out.print(ftol.charAt(i)+" ");
        // }
        // System.out.println();


        //find palindrome
        // String name="vinay";
        // System.out.println(isPalindrome(name));
     /////////////////FIND SHORTEST PATH IN STRING 
    //   String path="WNEENESENNN";
    //   System.out.println(getshortestpath(path));


    ///Equal its two string s
//      String s1="Tony";
//      String s2="Tony";
//      String s3=new String("Tony");

//      if(s1==s2){  //equals 
//         System.out.println("s1 and s2 are equals");
//      }
//      else{
//         System.out.println("Not equals");
//      }

//      if(s1==s3){    ///not equals
//         System.out.println("s1 and s2 are equals");
//      }
//      else{
//         System.out.println("Not equals");
//      }

// //using equal function
//      if(s1.equals(s3)){    ///not equals
//         System.out.println("s1 and s3 are equals");
//      }
//      else{
//         System.out.println("Not equals");
//      }
     ////////////////
     /// find substring in a string
        // String str="helloword";
        //inbult fuction
        // System.out.println(str.substring(0,5));

        // System.out.println(substring(str,0,5));

        //////////q2 longest string find
        //  String fruit[]={"apple","mango","banana"};

        //  String largest=fruit[0];
        //  for(int i=1;i<fruit.length;i++){
        //     if(largest.compareTo(fruit[i])<0){
        //         largest=fruit[i];
        //     }
        //  }

        // System.out.println(largest);
        ////////////////stringbuilder
        // StringBuilder sb=new StringBuilder();
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        
        // System.out.println(sb);
        // System.out.println(sb.length());

        //////Q convert string  first later in upper case
        //  String path="hi, i am vinay";
        // System.out.println(toUppercase(path));

        ///////Compress the strig   ex:-a3b2c4
        String str="abbbcccdd";
        System.out.println(compress(str));
    }
}
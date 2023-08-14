//sagar sir----> assignment no.1
//check all vowels are present in string or not


import java.util.Scanner;

public class allVowelsString {
 void allVowels(String str){

     int []check=new int[5];
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='a'||str.charAt(i)=='A'){
             check[0]=1;
         }
         else if(str.charAt(i)=='e'||str.charAt(i)=='E'){
             check[1]=1;
         }
         else if(str.charAt(i)=='i'||str.charAt(i)=='I'){
             check[2]=1;
         }
         else if(str.charAt(i)=='o'||str.charAt(i)=='O'){
             check[3]=1;
         }
         else if(str.charAt(i)=='u'||str.charAt(i)=='U'){
             check[4]=1;
         }
     }
    int flag=0;
     for(int i=0;i<5;i++){
         if(check[i]==0){
            flag=1;
            break;
         }
     }
     //return 0;


     if(flag==0){
         System.out.println("String contains all vowels: "+str);
     }
     else{
         System.out.println("String not contain all vowels");
     }

 }
// void checkVowels(String str){
//     if(allVowels(str)==1){
//         System.out.println("Not A");
//     }else{
//         System.out.println("Accpet");
//     }
// }
 public static void main(String args[]){

     // String str="education";
     allVowelsString a1=new allVowelsString();
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter String: ");
     //String str1=sc.nextLine();
     a1.allVowels("EDUCATION");
 }


}

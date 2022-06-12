// https://www.codechef.com/JUNE221D/problems/ALTERADD 
//Incomplete 
import java.util.Scanner;
import java.lang.*;
import java.io.*;

 class CodeChef 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
             Scanner sc = new Scanner(System.in);
             int t= sc.nextInt();
             for(int i=1;i<=t;i++){
                int a= sc.nextInt();
                int b= sc.nextInt();
                if(i % 2 !=0){
                    a++;
                }else{
                    b=b+2;
                }

                if( a==b){
                    System.out.println("yes")
                }else{
                    System.out.println("No")
                }

             }
        } catch(Exception e) {
        }
    
       
    }
}
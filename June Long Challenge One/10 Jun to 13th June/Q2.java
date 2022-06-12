//Question Link:- https://www.codechef.com/JUNE221D/problems/SUBSCRIBE_

import java.util.Scanner;
import java.lang.*;
import java.io.*;

 class CodeChef 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
             Scanner sc= new Scanner(System.in);
             int t=sc.nextInt();

             for(int i=0;i<=t;i++){
                int n=sc.nextInt();//N grups of friends
                int x=sc.nextInt();//Rate of subscribtion 

                if(n % 6 == 0){
                    int group= n/6;
                    System.out.println(group*x);
                }else if(n == 0){
                    System.out.println("0");
                }else{
                    int group=n/6
                    int remaining = n % 6;
                    System.out.println(group*x + x);
                }
             }
        } catch(Exception e) {
        }
    
       
    }
}
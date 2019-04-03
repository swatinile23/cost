/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author PARAG NARESHCHANDRA
 */
public class Prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("enter the no of testcases");
        int T=Integer.parseInt(sc.next());
        int[] res=new int[T];
        //System.out.print(T);
        for(int j=0;j<T;j++){
        //System.out.println("enter the number of people");
        
        int N=Integer.parseInt(sc.next());
         //System.out.println("enter the cost space seprated");
         String str=br.readLine();
         String[] str1=str.split(" ");
         //System.out.println(str);
         int[] A=new int[N];
           for(int a=0;a<N;a++){
               A[a]=Integer.parseInt(str1[a]);
           } 
          if(N==1){
              //System.out.println(A[0]);
              res[j]=A[0];
          }else if(N==2){
            if(A[0]<A[1]){
              res[j]=A[1];  
            }
            else{
                res[j]=A[0];
            }
        }else if(N==3){
            res[j]=A[0]+A[1]+A[2];
        }
            else if(N>2){
            int cost=0;
            for(int m=0;m<N;m=m+2){
                if(A[m]<A[m+1]){
                    cost=cost+A[m+1];
                    cost=cost+A[m];
                }else{
                    cost=cost+A[m];
                    cost=cost+A[m+1];
                }
            }
           
            System.out.println(cost);
        }
          
           /*for(int a=0;a<N;a++){
               System.out.println(A[a]);
           }*/
        }
        for(int i=0;i<T;i++){
            System.out.println(res[i]);
        }
        
    }

    private static void elseif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

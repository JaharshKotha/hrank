import java.util.*;
public class Solution {
       
          static void partition(int[] ar,int n) {
              if(n==0)
                  return ;
              int [] b = new int[n];
              int [] c = new int[n];
              int [] d = new int[n];
              int x=0,y=0,z=0;
              d[z]=ar[0];
              ++z;
              
              for(int i=1;i<n;i++)
                  {
                  if(ar[i]>ar[0])
                      {
                      b[x]=ar[i];
                      ++x;
                  }
                  if(ar[i]<ar[0])
                      {
                      c[y]=ar[i];
                      ++y;
                  }
                  if(ar[i]==ar[0])
                      {
                      d[z]=ar[0];
              ++z;
                  }
              }
              printArray(c,y);
              printArray(d,z);
              printArray(b,x);
       }   
 
 static void printArray(int[] ar,int dum) {
     int cnt=0;
         for(int n: ar){
             if(cnt==dum)
                 continue;
             ++cnt;
            System.out.print(n+" ");
         }
           
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar,n);
       }    
   }

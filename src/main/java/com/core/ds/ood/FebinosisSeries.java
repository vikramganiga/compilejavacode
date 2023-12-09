
package com.core.ds.ood;

public class FebinosisSeries {

        public static void main(String[] args) {
            
            int f1=0;
            int f2=1;
            int fn=f1+f2;
            int n=20;

            System.out.print(" "+f1 + " "+f2);
            while(fn < n){
                System.out.print(" "+ fn);
                f1=f2;
                f2=fn;
                fn=f1+f2;
            }
        }
    
}
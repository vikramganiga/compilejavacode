package com.core.ds.ood;

public class CountWords {
    

    public static void main(String[] args) {
        
        String[] listWords = {"raj", "viv", "magu", "cheku", "viv"};

        for(int i=0;i < listWords.length;i++){
            int count =1;
            int p=0;
            int q=i+1;

            while(p < i){
                if(listWords[i].compareTo(listWords[p]) == 0 )
                    count++;
                p++;
            }
            while(q < listWords.length ){
                if(listWords[i].compareTo(listWords[q]) ==0 )
                    count++;
                q++;
            }

            System.out.println("word "+ listWords[i] +" count" + count);
        }
    }
}

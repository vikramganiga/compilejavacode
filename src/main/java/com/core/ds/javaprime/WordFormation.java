package com.core.ds.javaprime;

public class WordFormation {
    
    Character character[] = {'c', 'a', 't', 'd', 'o',  'g'};

    public void getWorldFormation(){
        for(int i=0; i < character.length; i++){
            for(int j=0; j< character.length; j++){
                
                if(j == i)
                    continue;
                System.out.println(" "+character[i]+character[j]);
            }
        }
    }

}

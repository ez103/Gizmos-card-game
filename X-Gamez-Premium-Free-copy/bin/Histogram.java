import java.util.Map;
import java.util.TreeMap;

import java.util.Iterator;

import java.util.Scanner;
import static java.lang.System.*;
public class Histogram {
    private String[] splited;
    TreeMap <String, Integer> let = new TreeMap<String, Integer>();
    public Histogram(String b){
        
        String[] splited = b.split(" ");
        for(String a : splited){
            if(let.get(a)!=null){
                let.put(a,let.get(a)+1);
            }
            else{
                let.put(a,1);
            }
        }
    
    }
    public String toString(){
        String ret = "";
        /* Go through every key do \t print astriks*/ 
        Iterator<Map.Entry<String, Integer>> iterator = let.entrySet().iterator();
    
        // Loop through the TreeMap using the iterator
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String y ="";
            for(int i =0; i<entry.getValue();i++){
                y = y+"*";
            }
            String d = entry.getKey()+"\t "+y+"\n";
            ret = ret+d;
        }
        return ret;
    }
}

package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {
    public boolean isPalindrome(String text){
        Queue<Character> cola = new LinkedList<>();
        int tam = text.length();


        for(int i = 0 ;i < tam ; i++){
            cola.add(text.charAt(i));
        }
        
        while(cola.size() > 1){
            char arriba = cola.remove();
            int actual = cola.size();


            for(int i =0 ; i < actual -1 ; i++){
                cola.add(cola.remove());
            }

            char abajo = cola.remove();

            if(arriba != abajo ){
                return false;
            }
        }
        return true;

        
    }
    
}

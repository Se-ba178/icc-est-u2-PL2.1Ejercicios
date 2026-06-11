package utils;

import java.util.Stack;

public class SignValidator{
    public boolean isValid(String s){
        Stack<Character> pila= new Stack<>();

        for(int i =0; i<s.length();i++){
            char n=  s.charAt(i);

            if(n==  '(' ){
                pila.push(n);
            }else if(n=='['){
                pila.push(n);

            }else if(n== '{'){
                pila.push(n);
            }else{
                if(n== ')'){
                    if(pila.isEmpty()){
                        return false;
                    }


                }else if(n==']'){
                    if(pila.isEmpty()){
                        return false;
                    }

                }else if(n== '}'){
                    if(pila.isEmpty()){
                        return false;
                    }
                }
                char top=pila.pop();
                if(n==')' && top != '('){
                    return false;

                }
                if(n== ']' && top != '['){
                    return false;
                }
                if(n=='}' && top != '{'){
                    return false;
                }

                
            }


        }
        return pila.isEmpty();
    
        

    }



}
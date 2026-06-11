package utils;

import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack){
        Stack<Integer> stackReserva = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            
            if (!stackReserva.isEmpty() && stackReserva.peek() > temp) {
                
                stack.push(stackReserva.pop());
                
                
                while (!stackReserva.isEmpty() && stackReserva.peek() > temp) {
                    stack.push(stackReserva.pop());
                }
            }
            
            
            stackReserva.push(temp);
        }

        
        while (!stackReserva.isEmpty()) {
            stack.push(stackReserva.pop());
        }

    }
}

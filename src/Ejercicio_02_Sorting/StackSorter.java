package Ejercicio_02_Sorting;

import Materia.Stacks.Stack;


public class StackSorter {
    
    public void sortStack(Stack stack){
        Stack tempStack = new Stack();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }

            tempStack.push(current);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

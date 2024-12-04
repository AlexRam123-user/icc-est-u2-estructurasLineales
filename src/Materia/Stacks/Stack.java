package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {
    private Node top;

    // Creamos la pila con la cima nula o vacia
    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    // Metodo que retira el nodo de la cima
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    // Metodo que retorna el Valor del node de la cima
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    // Metodo de retorna el tamaño de la pila.
    // complejidad O(n)
    public int getSize() {
        int size = 0;
        Node current = top;
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }
}

import Materia.Modelos.Pantalla;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;


public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();
    }

    public static void runStack(){
        // Instanciar la clase
        Stack stack = new Stack();

        // Agregar elementos a la pila
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        // Mostrar Valores
        System.out.println("Cima     -> "+stack.peek());
        System.out.println("Retirar  -> "+stack.pop());
        System.out.println("Cima     -> "+stack.peek());
        System.out.println("Retirar  -> "+stack.pop());
        System.out.println("Cima     -> "+stack.peek());
        System.out.println("Retirar  -> "+stack.pop());
        System.out.println("Cima     -> "+stack.peek());

        stack.printStack();
        System.out.println(stack.getSize());
    }

    public static void runStackGeneric(){
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home.menu/settings"));

        System.out.println("Estoy en "+router.peek().getRuta());
        System.out.println("Regreso a "+ ((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en "+router.peek().getRuta());

        System.out.println("Pantallas = "+router.getSize());
        System.out.println("Estoy en "+router.peek().getRuta());
    }
}

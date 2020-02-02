import NodeClass.Node;
import STACKADT.StackInterface;

public class definationStack<E> implements StackInterface<E> {
    private Node<E> top;
    private Node<E> bottom=null;
    private int size=0;
    public void add(E data, int size){

    }

    @Override
    public void push(E data) {
        add(data,size);


    }

    @Override
    public void pop(E data) {

    }

    @Override
    public void peek() {

    }
}

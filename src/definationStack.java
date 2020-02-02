import NodeClass.Node;
import STACKADT.StackInterface;

public class definationStack<E> implements StackInterface<E> {
    private Node<E> top;
    private Node<E> bottom=null;
    private int size=0;
    public void addFirst(E data){
        Node<E> node=new Node<>(data,null);
        size++;
    }
    public void add(E data, int size){
        if(size<0) {
            throw new IndexOutOfBoundsException();
        }else if(size==0){
            addFirst(data);
        }else{

        }


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

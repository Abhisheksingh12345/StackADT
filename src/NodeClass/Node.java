package NodeClass;

public class Node<E> {
    private E data;
    private Node<E> next;
    public Node(E data){
        this.data=data;
    }
    public Node(E data,Node<E> next){

    }
}

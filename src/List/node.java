package List;

public class node <T>{
    public T data;
    public node<T> next;
    public node (node<T> next, T data){
        this.data=data;
        this.next=next;
    }
}

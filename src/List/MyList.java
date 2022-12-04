package List;

public class MyList<T> implements Comparable<MyList<person>> {
    public node<T> head; // указатель на первый элемент списка
    node<T> tail; // указатель на послений жлемент списка
    public int count; // счетчик количества элементов в списке
    public MyList(){
    }
    public void addFirst(T data) {
        node<T> new_node = new node<T>(head, data);
        head = new_node;
        if (tail == null) {
            tail = new_node;
        }
        count++;
    }

    public void addLast(T data) {
        node<T> new_node = new node<T>(null, data);
        if (tail==null){
            head=new_node;
            tail=new_node;
        }else {
            node<T> last_node=tail;
            last_node.next=new_node;
            tail=new_node;
        }
        count++;
    }
    public void NoElements() throws Exception{
        if (count==0){
            throw new NoElemet();
        }
    }

    public void print() {
        node<T> Nnode = head;
        System.out.println("----------------");
        for (int i=0; i<count; ++i){
            System.out.println(Nnode.data + " -> ");
            Nnode=Nnode.next;
        }//while (Nnode.next!=null);
        System.out.println("null");
        System.out.println("-----------------");
    }

    @Override
    public int compareTo(MyList<person> o) {
        return 0;
    }
}

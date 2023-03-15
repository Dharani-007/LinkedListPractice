public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }
    public void append(T data) {
        Node newNode = new Node(data);
        if(head == null) {
            tail = newNode;
            head = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public void popFirst() {
        Node<T> temp = head.getNext();
        head = temp;
    }
    T popLast() {
        T data = tail.getData();
        if(head == null) {
            return null;
        }
        Node<T> secondLast = head;
        while(secondLast.getNext()!= tail) {
            secondLast = secondLast.getNext();
        }
        tail = secondLast;
        tail.setNext(null);
        return data;
    }
    public Node<T> search(T searchData){
        Node<T> temp = head;
        while(temp != null) {
            if(temp.getData().equals(searchData))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }
}
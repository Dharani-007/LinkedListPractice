
public class LinkedList {
    public static void display(){
        System.out.println("Welcome to Data Structure Problems using Java Generics");
    }
    public static void main(String[] args) {
        display();
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
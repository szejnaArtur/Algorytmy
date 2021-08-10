package pl.arturszejna.collections.list.linkedList;

public class SinglyLinkedList<E> {

    public Node<E> head = null;
    public Node<E> tail = null;

    static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(E data){
        Node<E> newNode = new Node<>(data);

        if (head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display(){
        Node<E> current = head;
        while (head!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

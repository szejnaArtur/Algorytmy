package pl.arturszejna.collections.list.linkedList;

public class SinglyLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display(){
        Node current = head;
        while (head!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

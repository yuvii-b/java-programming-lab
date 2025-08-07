package week4;

//w4q10 - implementation of singly linked list
public class SinglyLinkedList {
    private Node head;

    // nested Node class
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    SinglyLinkedList(){
        head = null;
    }

    public void addNode(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void deleteNode(int value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        // Deleting head node
        if(head.data == value){
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        while(current != null && current.data != value){
            prev = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Node with value " + value + " not found");
            return;
        }

        prev.next = current.next;
    }

    public void search(int value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        int index = 0;
        boolean found = false;
        while(current != null){
            if(current.data == value){
                System.out.println("Node is found at position " + index + " of the linked list");
                found = true;
            }
            ++index;
            current = current.next;
        }
        if(!found){
            System.out.println("Node with value " + value + " is not found in the linked list");
        }
    }

    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(20);
        list.addNode(40);
        System.out.println("Linked List:");
        list.display();
        list.deleteNode(30);
        System.out.println("List after deletion:");
        list.display();
        System.out.println("\nSearching for 20:");
        list.search(20);
        System.out.println("\nSearching for 99:");
        list.search(99);
    }
}
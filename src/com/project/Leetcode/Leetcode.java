package com.project.Leetcode;

/**
 *
 *
 */

class Node {

    int value;
    Node next;

    public Node(){

    }

    public Node(int value){
        this.value = value;
    }
}

class LinkList{

    Node head;
    Node tail;

    // if head is not null
    // the value, the last node

    public Node insertAtFirst(int value){

        Node current = new Node(value);

        if (head == null){
            head = current;
            return head;
        }

        current.next = head;
        head = current;

        return head;
    }

    public void insertAtEnd(int value){

        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;

        }
        else {

            Node last =  head;

            // 1,2,null

            while (last.next != null){
                last = last.next;
            }

            last.next = newNode;
            this.tail = last.next;

        }

    }

    public void printMiddle() {

        int count = 0;
        Node mid = head;
        Node n = head;

        //1-2-3

        while (head != null) {

            if (count % 2 == 1) {
                mid = mid.next;
            }
            ++count;

            head = head.next;
        }

        // If empty list is provided

            if (mid != null)
            System.out.println("The middle element is [" +
                    mid.value + "]\n");

            while (head != null){
                n = n.next;

                System.out.println(n.value);
                head = head.next;
            }

    }

    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes to the end of the list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteNode(int value){

        // 10-20-30-60-40
        Node previous = null;
        Node current = head;

        while (current != null){

            if (current.value == value && head.value == value){
                head = head.next;
            } else if (current.value == value){
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }


    public void reverseList(){

        Node current = head;
        Node previous = null;
        Node next;

        while (current != null){

            // 1-2-3-4-5
            // next=2, previous = 1, current = 2
            // next=3, previous = 2, current = 3
            // next=4, previous = 3, current = 4
            // next=5, previous = 4, current = 5

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    //recursive linklist reverse

    public Node mergeNodes(Node headA, Node headB){


        Node temp = new Node();

        while (true){

            if (headA == null){
                temp.next = headB.next;
                break;
            }

            if (headB == null){
                temp.next = headA.next;
                break;
            }

            if (headA.value <= headB.value){
                temp.next = headA;
                headA = headA.next;
            } else {
                temp.next = headB;
                headB = headB.next;
            }

            temp = temp.next;

            System.out.println(temp.value);

        }

        return temp.next;
    }
}


public class Leetcode {



    public static void main(String[] args) {

        LinkList linkList1 = new LinkList();
        LinkList linkList2 = new LinkList();

        linkList1.insertAtEnd(10);
        linkList1.insertAtEnd(30);
        linkList1.insertAtEnd(50);


        linkList2.insertAtEnd(20);
        linkList2.insertAtEnd(40);
        linkList2.insertAtEnd(60);

        linkList1.deleteNode(30);
        linkList1.display();

//        linkList1.deleteNode(30);
//        linkList1.display();

        linkList1.mergeNodes(linkList1.head, linkList2.head);



//        linkList1.deleteNode(30);
//        linkList1.display();
//
//        linkList1.reverseList();
//        linkList1.display();

    }
}

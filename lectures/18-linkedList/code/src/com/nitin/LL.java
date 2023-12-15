package com.nitin;

public class LL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int val, int index) {
        if (head == null || index == 0) {
            insertFirst(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(val, temp.next);
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("No items to delete");
            return;
        }
        head = head.next;
    }

    public int find(int target) {
        Node node = head;
        while (node != null) {
            if (node.value == target) {
                return node.value;
            }
            node = node.next;
        }
        return -1;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("No items to delete");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void delete(int index) {
        if (head == null) {
            System.out.println("No items to delete");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        try {
            if (temp == null) {
                throw new NullPointerException("Invalid index");
            }
            temp.next = temp.next.next;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
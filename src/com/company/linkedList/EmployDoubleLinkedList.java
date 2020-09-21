package com.company.linkedList;

public class EmployDoubleLinkedList {

    private EmployeeNodeDouble head;
    private EmployeeNodeDouble tail;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNodeDouble node = new EmployeeNodeDouble(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;

        size ++;

    }

    public void addToEnd(Employee employee) {
        EmployeeNodeDouble node = new EmployeeNodeDouble(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size ++;
    }

    public void printList() {
        EmployeeNodeDouble current = head;
        System.out.print("Head <->");
        while(current != null) {
            System.out.print(current + " <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public EmployeeNodeDouble removeFromFront() {
        if (head == null) {
            return null;
        }

        EmployeeNodeDouble removed = head;

        if (head.getNext() == null) {
            tail = null;
        }

        head = removed.getNext();
        head.setPrevious(null);
        size --;
        return removed;
    }

    public EmployeeNodeDouble removeFromEnd() {
        if (head == null || head.getNext() == null) {
            return null;
        }

        EmployeeNodeDouble removed = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }

        tail = tail.getPrevious();
        tail.setNext(null);
        size --;
        return removed;
    }
}

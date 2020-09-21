package com.company.linkedList;

public class EmployLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size ++;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head ->");
        while(current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode removeFromFront() {
        if (head == null) {
            return null;
        }
        EmployeeNode removed = head;
        head = removed.getNext();
        size --;
        return removed;
    }
}

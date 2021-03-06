package com.company.stack;

import com.company.linkedList.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

// Preferred way of implementing Stack
public class ListStack {
    private LinkedList<Employee> stack;

    public ListStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

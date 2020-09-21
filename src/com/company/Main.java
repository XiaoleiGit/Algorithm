package com.company;

import com.company.arrayAndSortAlgorithm.*;
import com.company.binaryTree.Tree;
import com.company.hashTable.ChainedHashTable;
import com.company.linkedList.EmployDoubleLinkedList;
import com.company.linkedList.EmployLinkedList;
import com.company.linkedList.Employee;
import com.company.search.BinarySearch;
import sun.awt.image.ImageWatched;

import java.util.*;

public class Main {

    public static void main(String[] args) {

// ----------- Sort Algorithm -----------

        int[] array = {22, -15, 4, 31, -1, 50, 0};

//        BubbleSort.sortArray(array);
//        SelectionSort.sortArray(array);
//        InsertionSort.sortArray(array);
//        InsertionSort.sortRecursion(array, array.length);
//        MergeSort.sortArray(array, 0, array.length);
//        QuickSort.sortArray(array, 0, array.length);
//
//        System.out.println("-------------------");
//        for (int value : array) {
//            System.out.println(value);
//        }


// ----------- Search Algorithm -----------
//        int[] arr = {-12, -3, 5, 20, 100};
//        System.out.println(BinarySearch.binarySearch(arr, 8));
//        System.out.println(BinarySearch.recursionBinarySearch(arr, -3, 0, arr.length - 1));


// -----------  Linked list -----------

//        Employee emp1 = new Employee("Xiaolei", "Wang", 18);
//        Employee emp2 = new Employee("Yuchen", "Wei", 19);
//        Employee emp3 = new Employee("Hua", "Zhang", 20);
//        Employee emp4 = new Employee("Xinsheng", "wang", 21);
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        employees.add(emp3);
//        employees.add(emp4);
//
//        EmployLinkedList employLinkedList = new EmployLinkedList();
//        employLinkedList.addToFront(emp1);
//        employLinkedList.addToFront(emp2);
//        employLinkedList.addToFront(emp3);
//        employLinkedList.addToFront(emp4);
//
//        employLinkedList.printList();
//        System.out.println(employLinkedList.getSize());
//
//        employLinkedList.removeFromFront();
//        employLinkedList.printList();

// ----------- Double linked list -----------

//        EmployDoubleLinkedList employDoubleLinkedList = new EmployDoubleLinkedList();
//        employDoubleLinkedList.addToFront(emp1);
//        employDoubleLinkedList.addToFront(emp2);
//        employDoubleLinkedList.addToFront(emp3);
//        employDoubleLinkedList.addToFront(emp4);
//
//        employDoubleLinkedList.printList();
//
//        Employee emp5 = new Employee("Shuang", "Xue", 17);
//        employDoubleLinkedList.addToEnd(emp5);
//        employDoubleLinkedList.printList();
//        employDoubleLinkedList.removeFromFront();
//        employDoubleLinkedList.printList();


// ----------- ChainedHashTable -----------

//        ChainedHashTable chainedHashTable = new ChainedHashTable();
//        chainedHashTable.put("Wang", emp1);
//        chainedHashTable.put("Wei", emp2);
//        chainedHashTable.put("Zhang", emp3);
//        chainedHashTable.put("wang", emp4);
//        chainedHashTable.printHashTable();
//        System.out.println(chainedHashTable.get("wang"));
//        chainedHashTable.remove("Zhang");
//        chainedHashTable.remove("Wang");
//        chainedHashTable.printHashTable();


// ----------- HashMap -----------
//        Map<String, Employee> hashMap = new HashMap<>();
//        hashMap.put("Wang", emp1);
//        hashMap.put("Wei", emp2);

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        hashMap.forEach((k, v) -> System.out.println(v));


// ----------- Is string a palindrome? -----------
//        String str1 = "I did, did I?";
//        String strLower = str1.toLowerCase();
//
//        LinkedList<Character> stack = new LinkedList<>();
//        LinkedList<Character> queue = new LinkedList<>();
//        for (int i = 0; i < strLower.length(); i ++) {
//            if (strLower.charAt(i) > 'a' && strLower.charAt(i) < 'z') {
//                stack.addFirst(strLower.charAt(i));
//                queue.addLast(strLower.charAt(i));
//            }
//        }
//
//        while (!stack.isEmpty()) {
//            if (!stack.removeFirst().equals(queue.removeFirst())) {
//                System.out.println("Not palindrome");
//            }
//        }
//
//        System.out.println("Is palindrome");


// ----------- Tree -----------
//          10
//      8        17
//           11      20

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(17);
        tree.insert(11);
        tree.insert(20);

// Traverse in-order : 8 -> 10 -> 11 -> 17 -> 20
        tree.traverseInOrder();

        System.out.println();
        System.out.println(tree.get(11));
        System.out.println(tree.get(9));
        System.out.println(tree.min());
        System.out.println(tree.max());





    }
}

package com.company.hashTable;

import com.company.linkedList.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    private int hashKey(String key) {
//        return key.length() % hashTable.length;
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(iterator.hasNext()) {
            storedEmployee = iterator.next();
            if(storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = 0;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++; // index is 1 bigger then actual index
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }
        if (storedEmployee == null) {
            return null;
        } else {
            hashTable[hashedKey].remove(index-1);
            return storedEmployee.employee;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.print("Position " + i + " : ");
            if (hashTable[i].isEmpty()) {
                System.out.println("Empty HashTable");
            } else {
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();

                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee + " -> ");
                }
                System.out.println("null");
            }
        }
    }
}

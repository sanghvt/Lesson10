package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // ArrayList in Java
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("PHP");
        arrayList.add("C++");
        System.out.println("Cac phan tu cua arrayList: ");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Java");
        arrayList1.add("Python");
        arrayList1.add("PHP");

        arrayList.retainAll(arrayList1);
        System.out.print("\t " + arrayList + "\n");
//        for(String obj : arrayList)
//            System.out.print(obj + " ");
//        System.out.println("");
//
//        Iterator<String> ite = arrayList.iterator();
//        while(ite.hasNext())
//            System.out.print(ite.next() + " ");
//        System.out.println();

        //Linked List

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("PHP");
        linkedList.add("C++");
        System.out.println("Cac phan tu cua linkedList: ");
        System.out.print("\t " + linkedList + "\n");

        // hashSet in Set
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("PHP");
        System.out.println("Cac phan tu cua HashSet: ");
        System.out.print("\t" + hashSet + "\n");

        //Linked HashSet

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        System.out.println("Cac phan tu cua linkedHashSet: ");
        System.out.print("\t" + linkedHashSet + "\n");

        // Tree Set

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("Java");
        treeSet.add("PHP");
        treeSet.add("C++");
        System.out.println("Cac phan tu cua treeSet: ");
        System.out.print("\t" + treeSet + "\n");

        // Hash Map

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Sang", "Python");
        hashMap.put("Dat", "C++");
        hashMap.put("Ninh", "PHP");
        hashMap.put("Quoc", "Java");
        hashMap.put("Thai", "HTML");

        System.out.println("Cac phan tu cua HashMap: ");
        //show(hashMap);
        System.out.println(hashMap);

        //Linked HashMap

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Python");
        linkedHashMap.put(4, "C++");
        linkedHashMap.put(3, "PHP");
        System.out.println("Cac phan tu cua LinkedHashMap: ");
        show(linkedHashMap);

        //Tree Map

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");
        treeMap.put(4, "C++");
        treeMap.put(3, "PHP");
        System.out.println("Cac phan tu cua treeMap: ");
        show(treeMap);

        //HashTable
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("Sang", "Java");
        hashTable.put("Dat", "Python");
        hashTable.put("Quoc", "C++");
        hashTable.put("Ninh", "PHP");
        System.out.println("Cac phan tu cua hashTable: ");
        System.out.println(hashTable);

        //EnumSet

        List<Student> listStudents = new ArrayList<Student>();
        listStudents.add(new Student(1, "Dat", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 24, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        Collections.sort(listStudents);

        System.out.println("ArrayList after sorting by comparable: ");
        for (Student st : listStudents) {
            System.out.println(st);
        }

        Collections.sort(listStudents, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.getAge() - b.getAge();
            }
        });

        System.out.println("ArrayList after sorting by comparator");
        for (Student st : listStudents)
            System.out.println(st);

        // Properties

        FileReader file = new FileReader("sang.properties");

        Properties properties = new Properties();
        properties.load(file);

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));

//        properties = System.getProperties();
//
//        Set set = properties.entrySet();
//        Iterator itr = set.iterator();
//        while (itr.hasNext()) {
//            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//
//
//        }
    }
    public static void show(Map<Integer,String> map){
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            System.out.println(key + " " + map.get(key));
        }
    }
}

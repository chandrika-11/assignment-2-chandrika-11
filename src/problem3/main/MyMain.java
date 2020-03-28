/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPriorityQueue priorityQueue = new MyPriorityQueue();
        System.out.println("Enter number of nodes");
        int nodes = scanner.nextInt();
        while (nodes-- > 0) {
            Student student = new Student();
            System.out.println("Enter name");
            String name = scanner.next().trim();
            System.out.println("Enter roll number");
            int roll = scanner.nextInt();
            student.setName(name);
            student.setRollNumber(roll);
            Node node = new Node();
            node.setStudent(student);
            priorityQueue.enQueue(node);
        }
        System.out.println("Display Queue");
        Node node = priorityQueue.deQueue();
        while (node != null) {
            System.out.println(node);
            node = priorityQueue.deQueue();
        }
    }
}

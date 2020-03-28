/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.println("Enter number of nodes=");
        int n = scanner.nextInt();
        while (n-- > 0) {
            System.out.println("Enter data=");
            int element = scanner.nextInt();
            TreeNode node = new TreeNode();
            node.setData(element);
            bst.insert(node);
        }
        System.out.println("----PreOrder Traversal out-----");
        bst.showTreeData(bst.getRoot());
        System.out.println("----PostOrder Traversal");
        bst.postOrderTraversal(bst.getRoot());
        System.out.println("First element is valid but Second is not");
    }
}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.ArrayList;

// to implement BinarySearchTree
public class MyBinarySearchTree {

 private TreeNode root;
 private ArrayList<Integer> arrayList;

 public MyBinarySearchTree() {
  arrayList = new ArrayList<>();
 }

 public TreeNode getRoot() {
  return root;
 }

 public void setRoot(TreeNode root) {
  this.root = root;
 }

 public void insert(TreeNode newNode) {
  if (getRoot() == null) {
   setRoot(newNode);
   return;
  }


 }
}

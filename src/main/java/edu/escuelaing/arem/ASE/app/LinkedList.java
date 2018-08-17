/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/* Class linkedList */
public class LinkedList {

private Node end = null;
private int size = 0;

public void insertEnd(double data) {
    Node n = new Node(data);
    n.next = end;
    end = n;
    size+=1;
}

public Node deleteEnd() {
    Node temp = end;
    end = end.next;
    if (end!=null){
        size-=1;
    }
    return temp;
}


public boolean isEmpty() {
    return (end == null);
  }
public double getNode(double i) {
    int n = indexOf(end); // count-1 actually
    Node current = end;
    while (n > i) {
        --n;
        current = current.next;
    }
    return current.data;
}

private int indexOf(Node link) {
    if (link == null) {
        return -1;
    }
    return 1 + indexOf(link.next);
}
public int getSize() {
    return size;
}


}
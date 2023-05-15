
package com.mycompany.tpfinal;

/**
 *
 * @author gusta
 */
public class Node {
    private Pessoa data;
    private Node next;

    public Node(Pessoa data) {
        this.data = data;
    }

    public Pessoa getData() {
        return data;
    }

    public void setData(Pessoa data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

package com.mycompany.tpfinal;

public class ListIterator implements iterator<Pessoa> {
    private Node current;

    public ListIterator(Node root) {
        current = root;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Pessoa next() {
        Pessoa data = current.getData();
        current = current.getNext();
        return data;
    }
}

package com.mycompany.tpfinal;

public class ListaEncadeada implements iterable<Pessoa> {
    private Node root;
    private int size;

    public ListaEncadeada() {
        this.root = null;
        this.size = 0;
    }

    /** Metodo para adicionar uma pessoa 
    *@author Gustavo Vaz  
    */
    public boolean add(Pessoa element) {
        if (root == null) {
            root = new Node(element);
            size++;
            return true;
        }

        Node current = root;
        Node previous = null;

        while (current != null) {
            int comparison = current.getData().compareTo(element);

            if (comparison == 0) {
                return false;
            }

            if (comparison > 0) {
                Node newNode = new Node(element);

                if (previous == null) {
                    newNode.setNext(current);
                    root = newNode;
                } else {
                    newNode.setNext(current);
                    previous.setNext(newNode);
                }

                size++;
                return true;
            }

            previous = current;
            current = current.getNext();
        }

        Node newNode = new Node(element);
        previous.setNext(newNode);
        size++;
        return true;
    }

    
    /** Metodo para remover uma pessoa
    *@author Gustavo Vaz  
    */
    
    public boolean remove(Pessoa element) {
        Node current = root;
        Node previous = null;

        while (current != null) {
            int comparison = current.getData().compareTo(element);

            if (comparison == 0) {
                if (previous == null) {
                    root = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }

                size--;
                return true;
            }

            previous = current;
            current = current.getNext();
        }

        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public iterator<Pessoa> iterator() {
        return (iterator<Pessoa>) new ListIterator(root);
    }

  
}

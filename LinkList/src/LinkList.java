public class LinkList {

    private Node First;
    private Node Last;

    LinkList() {
        First = null;
        Last = null;
    }

    public boolean isEmpty() {
        return First == null;
    }

    public void insertAtFirst(int item) { //O(1)
        Node n = new Node();
        n.value = item;
        n.prev = Last;
        if (isEmpty()) {
            Last = n;
        } else {
            n.next = First;
            First.prev = n;
        }
        First = n;
    }

    public void insertAtLast(int item) { //O(1)
        Node n = new Node();
        n.value = item;
        n.next = null;
        if (isEmpty()) {
            First = n;
        } else {
            Last.next = n;
            n.prev = Last;
        }
         Last = n;
    }

    public int deleteFirstNode() { //O(1)
        Node p = First;
        if (isEmpty()) {
            System.out.println("List Is Empty");
            return -1;
        } else if (p.next == null) {
            First = null;
        } else {
            First = p.next;
            First.prev = null;
        }
        return p.value;
    }

    public int deleteLastNode() { //O(1)
        if (isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }
        Node p = Last;
        Last = Last.prev;
        Last.next = null;
        return p.value;
    }

    public void print() { //O(n)
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node p = First;
            while (p != null) {
                System.out.print(" {" + p.value + "} --> ");
                p = p.next;
            }
        }
    }


    public int min() { //O(n)

        Node p = First;
        int temp = First.value;
        while (p != null) {
            if (p.value < temp) {
                temp = p.value;
            }
            p = p.next;
        }

        return temp;
    }





    public void oddNumber() { //O(n)


        Node p = First;

        while (p != null) {
            if (p.value % 2 != 0) {
                System.out.print(" {" + p.value + "} --> ");
            }
            p = p.next;

        }

    }

    public void printReverse() {    //O(n)
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node p = Last;
            while (p != First) {

                System.out.print(" {" + p.value + "} --> ");
                p = p.prev;
            }

        }
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;
    }


}
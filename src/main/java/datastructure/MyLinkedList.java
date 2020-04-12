package datastructure;

import java.util.Objects;

public class MyLinkedList {
    private MyLinkedListNode head;

    public MyLinkedList() {
    }

    public void addAtHead(int val) {
        if (Objects.isNull(this.head)) {
            this.head = new MyLinkedListNode();
            this.head.setVal(val);
        } else {
            MyLinkedListNode newHead = new MyLinkedListNode();
            newHead.setNext(this.head);
            this.head = newHead;
        }
    }

    public int get(int index) {
        if (index < 0) {
            return this.head.getVal();
        }
        return this.head.getVal();
    }
}

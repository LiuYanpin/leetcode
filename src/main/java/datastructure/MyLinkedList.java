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
            newHead.setVal(val);
            this.head = newHead;
        }
    }

    public int get(int index) {
        if (index < 0) {
            return this.head.getVal();
        }
        int i = 0;
        MyLinkedListNode temp = this.head;
        while (i < index) {
            if (Objects.isNull(temp.getNext())) {
                break;
            }
            temp = temp.getNext();
            i++;
        }
        return temp.getVal();
    }

    public void addAtTail(int val) {
        MyLinkedListNode newTail = new MyLinkedListNode();
        newTail.setVal(val);
        MyLinkedListNode temp = this.head;
        while (Objects.nonNull(temp)) {
            if (Objects.isNull(temp.getNext())) {
                temp.setNext(newTail);
                break;
            }
            temp = temp.getNext();
        }
    }

    public void addAtIndex(int index, int val) {
        int i = 0;
        MyLinkedListNode temp = this.head;
        while (i < index - 1) {
            if (Objects.isNull(temp.getNext())) {
                break;
            }
            temp = temp.getNext();
            i++;
        }
        MyLinkedListNode newNode = new MyLinkedListNode();
        newNode.setVal(val);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            this.head = this.head.getNext();
        }
    }
}

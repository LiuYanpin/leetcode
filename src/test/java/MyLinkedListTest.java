import datastructure.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    @Test
    public void should_be_true() {
        assertTrue(true);
    }

    @Test
    public void should_initialize_an_empty_linked_list() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        assertEquals(1, myLinkedList.get(0));
    }

    @Test
    public void should_add_an_item_before_original_head_when_add_at_head() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(2);
        assertEquals(2, myLinkedList.get(0));
        assertEquals(1, myLinkedList.get(1));
    }

    @Test
    public void should_add_an_item_when_add_at_tail() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        assertEquals(1, myLinkedList.get(0));
        assertEquals(2, myLinkedList.get(1));
    }

    @Test
    public void should_add_item_correctly() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtHead(3);
        myLinkedList.addAtTail(4);

        assertEquals(3, myLinkedList.get(0));
        assertEquals(1, myLinkedList.get(1));
        assertEquals(2, myLinkedList.get(2));
        assertEquals(4, myLinkedList.get(3));

    }
}
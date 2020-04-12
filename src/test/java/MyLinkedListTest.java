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
}
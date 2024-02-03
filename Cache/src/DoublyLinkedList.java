import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

  DoublyLinkedListNode<E> dummyHead;
  DoublyLinkedListNode<E> dummyTail;

  public DoublyLinkedList() {
    // We can instantiate these by null, since we are never gonna use val for these
    // dummyNodes
    dummyHead = new DoublyLinkedListNode<>(null);
    dummyTail = new DoublyLinkedListNode<>(null);

    // Also Initially there are no items
    // so just join dummyHead and Tail, we can add items in between them easily.
    dummyHead.next = dummyTail;
    dummyTail.prev = dummyHead;
  }

  public void detachNode(DoublyLinkedListNode<E> node) {
    // Just Simply modifying the pointers.
    if (node != null) {
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }
  }

  public void addNodeAtLast(DoublyLinkedListNode<E> node) {
    DoublyLinkedListNode<E> tailPrev = dummyTail.prev;
    tailPrev.next = node;
    node.next = dummyTail;
    dummyTail.prev = node;
    node.prev = tailPrev;
  }

  public DoublyLinkedListNode<E> addElementAtLast(E element) {
    if (element == null) {
      throw new InvalidElementException();
    }
    DoublyLinkedListNode<E> newNode = new DoublyLinkedListNode<>(element);
    addNodeAtLast(newNode);
    return newNode;
  }

  public boolean isItemPresent() {
    return dummyHead.next != dummyTail;
  }

  public DoublyLinkedListNode<E> getFirstNode() throws NoSuchElementException {
    DoublyLinkedListNode<E> item = null;
    if (!isItemPresent()) {
      return null;
    }
    return dummyHead.next;
  }

  public DoublyLinkedListNode<E> getLastNode() throws NoSuchElementException {
    DoublyLinkedListNode<E> item = null;
    if (!isItemPresent()) {
      return null;
    }
    return dummyTail.prev;
  }
}

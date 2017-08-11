// Java program for linked-list implementation of queue
  
// A linked list (LL) node to store a queue entry
class QNode
{
    int key;
    QNode next;
     
    // constructor to create a new linked list node
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}
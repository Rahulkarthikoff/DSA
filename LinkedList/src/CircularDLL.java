public class CircularDLL {
    DLLNode head;
    DLLNode tail;

    void insertAtBegin(int data)
    {
        DLLNode newNode = new DLLNode(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            newNode.prev = tail;
            head = newNode;
        }
    }

    void insertAtEnd(int data)
    {
        DLLNode newNode = new DLLNode(data);
        if(head == null || tail == null)
        {
            insertAtBegin(data);
        }else {
            head.prev = newNode;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;

            tail = newNode;
        }
    }

    void printCircularDLL()
    {
        DLLNode temp = head;
//        System.out.println(head.data);
        do{
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }while(temp != head);
    }
}

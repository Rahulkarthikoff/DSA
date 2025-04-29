public class DLLMethods {
    DLLNode head;
    DLLNode tail;

    void insertAtBegin(int data)
    {
        DLLNode newNode = new DLLNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
//            newNode.next = head;
//            head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data)
    {
        DLLNode newNode = new DLLNode(data);
        if(head == null || tail == null )
        {
            insertAtBegin(data);
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAtPos(int data, int pos)
    {
        pos = pos -1;
        DLLNode newNode = new DLLNode(data);
        if(pos == 0)
        {
            insertAtBegin(data);
        }
        else{
            int currPos = 1;
            DLLNode temp = head;
            while(temp.next!=null)
            {
                if(currPos == pos){
                    break;
                }
                currPos++;
                temp = temp.next;

            }
            if(currPos < pos && temp.next == null)
            {
                System.out.println("Invalid case");
                return;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }

    }
    void printDLL()
    {
        DLLNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
    }
    void changeFirstAndLast()
    {
//        DLLNode temp;
//        head.prev = tail.prev;
//        tail.next = head.next;
//        head.next = null;
//        tail.prev = null;
        int t = head.data;
        head.data = tail.data;
        tail.data = t;

    }
}

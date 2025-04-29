public class SLLMethods {
    SLLNode head;

    void insertAtBegin(int data)
    {
        SLLNode newNode = new SLLNode(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtEnd(int data)
    {
        SLLNode newNode = new SLLNode(data);
        if(head == null)
        {
            head = newNode;
        }else {
            SLLNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }


    void insertAtPosition(int data, int pos)
    {
        SLLNode temp = head;

        int currPos = 1;
        if(pos == 0)
        {
            insertAtBegin(data);
        }else {
            while (temp != null) {

                if (currPos == pos-1) {
                    break;
                }
                currPos++;
                temp = temp.next;
            }

            SLLNode newNode = new SLLNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void printLL()
    {
        SLLNode temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data+" ---> ");
            temp=temp.next;
        }
    }
}

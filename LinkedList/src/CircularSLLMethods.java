public class CircularSLLMethods {
       SLLNode head;
       SLLNode tail;

       void insertAtBegin(int data)
       {
           SLLNode newNode = new SLLNode(data);

           if(head == null)
           {
               head = newNode;
               newNode.next = head;
               tail = head;
           }
           else{
               newNode.next = head;
               head = newNode;
               tail = newNode;
           }
       }


       void insertAtEnd(int data)
       {
           SLLNode newNode = new SLLNode(data);
           if(head== null)
           {
               insertAtBegin(data);
           }else{
               tail.next = newNode;
               tail = newNode;
               tail.next = head;
           }
       }


       void insertAtPos(int data, int pos)
       {
           if(pos == 0)
           {
               insertAtBegin(data);
           }
           SLLNode tmp = head;
           int cPos = 1;
           pos = pos - 1;
           do{
               if(cPos == pos)
               {
                   break;
               }
               cPos++;
               tmp = tmp.next;

           }while(tmp!=head);
           SLLNode newNode = new SLLNode(data);
           newNode.next = tmp.next;
           tmp.next = newNode;
       }

       void printCircularSinglyLL()
       {
           SLLNode temp=head;
           do{
               System.out.print(temp.data+" --> ");
               temp = temp.next;
           }while(temp != head);
       }
}

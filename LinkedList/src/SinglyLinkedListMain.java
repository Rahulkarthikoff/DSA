//class SinglyLinkedListMain extends SLLMethods{
//    public static void main(String[] args)
//    {
////        Node newNode = new Node(2);
//
//        SinglyLinkedListMain m = new SinglyLinkedListMain();
//        m.insertAtEnd(1);
//        m.insertAtEnd(2);
//        m.insertAtEnd(3);
//        m.insertAtEnd(4);
//        m.insertAtPosition(5,2);
//        m.printLL();
//    }
//}
class SinglyLinkedListMain extends CircularSLLMethods{
    public static void main(String[] args)
    {
//        Node newNode = new Node(2);

        SinglyLinkedListMain m = new SinglyLinkedListMain();
        m.insertAtBegin(1);
        m.insertAtEnd(2);
        m.insertAtEnd(3);
        m.insertAtEnd(4);
        m.insertAtPos(7,2);

        m.printCircularSinglyLL();
    }
}
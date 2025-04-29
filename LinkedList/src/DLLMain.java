//public class DLLMain extends DLLMethods{
//    public static void main(String[] args) {
//        DLLMain m = new DLLMain();
//        m.insertAtBegin(6);
//        m.insertAtEnd(7);
//        m.insertAtEnd(8);
//        m.insertAtEnd(9);
////        m.insertAtPos(5,10);
//        m.printDLL();
//        m.changeFirstAndLast();
//        System.out.println("**************************************");
//        m.printDLL();
//    }
//}
public class DLLMain extends CircularDLL{
    public static void main(String[] args) {
        DLLMain m = new DLLMain();
        m.insertAtBegin(6);
        m.insertAtEnd(7);
        m.insertAtEnd(8);
        m.insertAtEnd(9);
//        m.insertAtPos(5,10);
//        m.printDLL();
//        m.changeFirstAndLast();
//        System.out.println("**************************************");
//        m.printDLL();
        m.printCircularDLL();
    }
}

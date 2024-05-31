package DsaAssignment2;
public class Main {
    public static void main(String[] args) {
        // Example usage
        LinkedList linkedList = new LinkedList();

// 1. Inserting a Node at Any Given Position
        linkedList.insertAtPos(15, 1);
        linkedList.insertAtPos(23, 2);
        linkedList.insertAtPos(33, 3);
        linkedList.insertAtPos(42, 4);

        linkedList.printList();

// 2. Deleting a Node at Any Given Position
        linkedList.deleteAtPosition(1);
        linkedList.printList();
// 3. Deleting a Node After a Given Node
        linkedList.deleteAfterNode(3);
        linkedList.printList();

// 4. Searching a Node
        System.out.println(linkedList.searchNode(10)); // true
        System.out.println(linkedList.searchNode(5)); // false

// 5. Implementing a Stack Using Linked Lists
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // 2
        System.out.println(stack.peek()); // 1
    }
}


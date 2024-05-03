public class Main {

    public static void main(String[] args) {
        // Test creating a new LinkedList and adding initial elements
        LinkedList myList = new LinkedList(10);
        myList.append(20);
        myList.append(30);
        System.out.println("Initial List:");
        myList.printAll();

        // Test appending elements
        myList.append(40);
        myList.append(50);
        System.out.println("After appending elements:");
        myList.printAll();

        // Test prepending elements
        myList.prepend(5);
        System.out.println("After prepending an element:");
        myList.printAll();

        // Test inserting elements
        myList.insert(3, 25); // Inserting in the middle
        myList.insert(0, 1);  // Inserting at the beginning
        myList.insert(myList.getLength(), 60); // Inserting at the end
        System.out.println("After inserting elements:");
        myList.printAll();

        // Test removing elements
        myList.remove(0); // Remove from beginning
        myList.remove(myList.getLength() - 1); // Remove from end
        myList.remove(2); // Remove from middle
        System.out.println("After removing elements:");
        myList.printAll();

        // Test setting an element
        myList.set(2, 100);
        System.out.println("After setting element at index 2 to 100:");
        myList.printAll();

        // Test reversing the linked list
        myList.reverse();
        System.out.println("After reversing the linked list:");
        myList.printAll();

        // Test making the list empty
        myList.makeEmpty();
        System.out.println("After making the list empty:");
        myList.printAll();
    }
}

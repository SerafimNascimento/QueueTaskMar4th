import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        TASK 1 - Create a LinkedList that represents the printer queue. Each element is a string representing the
        document name.
        * */
        LinkedList<String> queue = new LinkedList<>();

        // TASK 2 - Add at least 5 documents to the queue.
        queue.add("Document01");
        queue.add("Document02");
        queue.add("Document03");
        queue.add("Document04");
        queue.add("Document05");

        displayNextToBePrinted(queue);
        // TASK 3 - Display the entire queue.
        displayQueue(queue);

        // TASK 4 - Simulate the printing process: Remove and display each document name until the queue is
        //empty.

        //System.out.println();

        while (!queue.isEmpty()) {
            System.out.println();
            System.out.println("Printed document: " + queue.removeFirst());
            displayNextToBePrinted(queue);
            displayQueue(queue);
        }

        /*for (int it = 0; it < queue.size(); it++) {
            if (queue.isEmpty()) {
                System.out.println("The queue is empty. Then it is not possible to print anything.");
            } else {
                System.out.println();
                System.out.println("Printed document: " + queue.removeFirst());
                displayNextToBePrinted(queue);
                displayQueue(queue);
            }
        } */

        /*
        System.out.println();
        System.out.println("Printed document: " + queue.removeFirst());
        displayNextToBeRemoved(queue); // TASK 5 - Create a function that displays the next document to be printed without removing it.
        displayQueue(queue);
        queue.remove();
        displayNextToBeRemoved(queue); // TASK 5 - Create a function that displays the next document to be printed without removing it.
        displayQueue(queue);
        queue.remove();
        displayNextToBeRemoved(queue); // TASK 5 - Create a function that displays the next document to be printed without removing it.
        displayQueue(queue);
        queue.remove();
        displayNextToBeRemoved(queue); // TASK 5 - Create a function that displays the next document to be printed without removing it.
        displayQueue(queue);
        queue.remove();
        displayNextToBeRemoved(queue); // TASK 5 - Create a function that displays the next document to be printed without removing it.
        displayQueue(queue);
        displayNextToBeRemoved(queue); // TASK 5 - Create a function that displays the next document to be printed without removing it.
         */

        /*
        try {
            queue.remove();
        } catch(Exception e) {
            System.out.println("It is not possible to remove cuz the queue is empty.\n"+e.getMessage());
        }
        */

    }

    // TASK 3 - Display the entire queue.
    public static void displayQueue(LinkedList<String> queue) {
        if (queue.isEmpty()){
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Documents in the Queue to be Printed:");
            /*for (int i = 0; i < queue.size(); i++) {
                System.out.print(queue.get(i) + " - ");
            }
            System.out.println();
             */
            for (String doc : queue) {
                System.out.print(doc + " - ");
            }

        }
    }

    // TASK 5 - Create a function that displays the next document to be printed without removing it.
    public static void displayNextToBePrinted(LinkedList<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("No next elements to be printed because the queue is empty.");
        } else {
            System.out.println("\nNext document to be printed is "+queue.getFirst());
        }

    }

}
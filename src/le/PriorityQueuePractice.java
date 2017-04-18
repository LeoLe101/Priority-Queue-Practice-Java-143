package le;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Phuc Hong Le
 */
public class PriorityQueuePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a list of 5 numbers: ");
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10);
        int count = 0;
        while (count != 5) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            queue.add(num);
            count++;
        }
        //show the output in an order that have been sorted from the binary heap
        Iterator<Integer> itr = queue.iterator();
        System.out.println("Sorted List using NEXT method in iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        //show the output in an order that have been sorted from small to big
        System.out.println("Sorted List using POLL method in iterator: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }

}

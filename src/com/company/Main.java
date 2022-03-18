package com.company;

import ibadts.Queue;
import ibadts.Stack;

import javax.swing.text.Element;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        homework4();
    }

    public static void example1() {
        Queue<Integer> queue = new Queue<>();
        int largest = 0;
        try (Scanner scanner = new Scanner(System.in)) {

            while (scanner.hasNextInt()) {
                int var = scanner.nextInt();
                queue.enqueue(var);
                if (var > largest) {
                    largest = var;
                }

            }
            while (!queue.isEmpty()) {
                System.out.println(100.0 * queue.dequeue() / largest);
            }


        } catch (Exception e) {
            System.exit(1);
        }
    }


    public static void reverse(Queue<String> from, Queue<String> to) {
        if (from.isEmpty()) {
            return;
        } else {
            String first = from.dequeue();
            reverse(from, to);
            to.enqueue(first);
        }

    }

    public static void reverse2(Queue<String> queue) {
        if (queue.isEmpty()) {
            return;
        } else {
            String first = queue.dequeue();
            reverse2(queue);
            queue.enqueue(first);
        }

    }


    public static void reverseIterative(Queue<String> queue) {
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());

        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }

    public static void homework1(Queue<Element> queue) {
        int i = 0;
        while (!queue.isEmpty()) {
            queue.dequeue();
            i += 1;
        }
        System.out.println(i);
    }

    public static void example3() {
        Queue<Integer> queue = new Queue<>();
        int numDays = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            boolean run = true;

            while (scanner.hasNextInt()) {
                queue.enqueue(scanner.nextInt());
                numDays++;
            }
        } catch (Exception e) {
            System.exit(-1);
        }

        int numWeeks = numDays / 7;
        if (numDays % 7 != 0) {
            numWeeks++;
        }

        int[][] data = new int[numWeeks][7];

        int week = 0;
        int day = 0;
        while (!queue.isEmpty()) {
            data[week][day] = queue.dequeue();
            day++;
            if (day == 7) {
                week++;
                day = 0;
            }
        }
        for (int[] w : data) {
            for (int d : w) {
                System.out.println(d + " ");
            }
            System.out.println();
        }


    }

    public static void homework4() {
        Queue<String> business = new Queue<>();
        Queue<String> economy = new Queue<>();
        business.enqueue("Hugo");
        business.enqueue("Utu");
        business.enqueue("Aleksei");
        economy.enqueue("Oskari");
        economy.enqueue("Gabriel");
        economy.enqueue("Chen");

        while (!business.isEmpty() && !economy.isEmpty()) {
            System.out.println(business.dequeue());
            if (!business.isEmpty()) {
                System.out.println(business.dequeue());
            }
            System.out.println(economy.dequeue());
        }
        if (!business.isEmpty()) {
            while (!business.isEmpty()) {
                System.out.println(business.dequeue());
            }
        }
        if (!economy.isEmpty()) {
            while (!economy.isEmpty()) {
                System.out.println(economy.dequeue());
            }

        }
    }

}

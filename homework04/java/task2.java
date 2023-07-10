//  Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


package homework04.java;

import java.util.*;

public class task2 {

    public static void main(String[] args) {
        int[] list = {99, 155, 211, 10, 77, 333, 12, 1 };
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(Integer temp : list) {
            linkedList.add(temp);
        }
        System.out.println(linkedList);
        enqueue(linkedList, 11);
        System.out.println(linkedList);
        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);
        System.out.println(first(linkedList));
    }
    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }
    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }
    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package homework04.java;

import java.util.*;

public class task1 {

    public static void main(String[] args) {
        int[] list = {15, 26, 1, 8, 33, 51, 88, 99, 157, 66};
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("linkList = " + linkList);
    }
}



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        numbers[0] = 34;
//        numbers[1]=90;
//        numbers[2] = 466;
//
//        for(int num: numbers){
////            System.out.println(num);
//        }
////        System.out.println(Arrays.toString(numbers));
//        Array nums = new Array(3);
//        nums.insert(90);
//        nums.print();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
//        System.out.println(list);

        Linked lList = new Linked();
        lList.addLast(30);
        lList.addFirst(90);
        lList.addFirst(70);
        lList.addFirst(560);
        lList.removeLast();
        lList.contains(70);
        lList.indexOf(70);
        System.out.println(lList.contains(560));
    }
}


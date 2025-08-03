import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(63);
//        list.add(34);
//        list.add(43);
//        list.add(66);
//        list.add(64);

//        System.out.println(list.contains(65));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);

        // inpuut
        for(int i = 0; i< 5; i++){
            list.add(in.nextInt());
        }

        // get item at any index
        for(int i = 0; i< 5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}

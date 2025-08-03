public class Array {
    public static void main(String[] args) {
        // syntax

        // datatypes[] variable_name = new dattype[siz];
        // store 5 roll numbers
        int[] rollno = new int[5];
        // or directly
        int[] rollno2 = {34,56,344,23,65,45};

        int[] ros; // declaration of array ros is getting defined in the stack
        ros = new int[5]; // initialization: actuallly here objectis being created
        System.out.println(ros[1]); // 0

        String[] arr = new String[4];
        System.out.println(arr[0]);  // null




    }
}

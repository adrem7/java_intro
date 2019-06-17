import java.util.ArrayList; 
import java.util.Arrays;

// can you remember how to set up your main function?
public class ArrayEx {
  public static void main(String[] args) {
// declare an array of Strings and print it
    String[] my_array_of_strings = new String[5];
    
    my_array_of_strings[0] = "String_1";
    my_array_of_strings[1] = "String_2";
    my_array_of_strings[2] = "String_3";
    my_array_of_strings[3] = "String_4";
    my_array_of_strings[4] = "String_5";
    
    System.out.println(my_array_of_strings[0]);
    System.out.println(Arrays.toString(my_array_of_strings));

// declare an array of integers and print it
    int[] my_array_of_integers = new int[5];

    my_array_of_integers[0] = 1;
    my_array_of_integers[1] = 2;
    my_array_of_integers[2] = 3;
    my_array_of_integers[3] = 4;
    my_array_of_integers[4] = 5;

    System.out.println(Arrays.toString(my_array_of_integers));
// declare an ArrayList of integers, add numbers to it, and then print it
    ArrayList<Integer> my_array_list = new ArrayList<Integer>(2);
    
    my_array_list.add(1);
    my_array_list.add(2);

    System.out.println(my_array_list);
  }
}
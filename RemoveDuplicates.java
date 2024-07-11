import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 integers:");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        
        removeDuplicate(list);
        
        System.out.println("The distinct integers are:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for (Integer num : list) {
            if (!temp.contains(num)) {
                temp.add(num);
            }
        }
        
        list.clear();
        list.addAll(temp);
    }
}


import java.util.*;
public class ArraySearchAndDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter array size
        System.out.println("Enter array size: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        // entry array
        System.out.println("Enter " + N + " integers");
        for(int i = 0;i < N;i++){
            int num = scanner.nextInt();
            array[i] = num;
        }
        // search or delete
        System.out.println("Enter 'S' for search or 'D' for delete: ");
        char operation = scanner.next().charAt(0);
        if (operation == 'S' || operation == 's'){
            System.out.println("Enter an integer to search: ");
            int X = scanner.nextInt();
            boolean flag = false;
            int index = -1;
            for (int i = 0; i < array.length; i++){
                if (X == array[i]){
                    index = i;
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println("Found at index: " + index);
            }else{
                System.out.println("Not found");
            }

        }else if (operation == 'D' || operation == 'd' ){
            System.out.println("Enter index: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < N){
                int j = 0;
                int[] newArray = new int[N-1];
                for (int i = 0; i < N; i++){
                    if (i != index){
                        newArray[j] = array[i];
                        j++;
                    }
                }
                System.out.println("New array: ");
                for (int num : newArray){
                    System.out.print(num + " ");
                }
                System.out.println();
            }else{
                System.out.println("Invalid index");
            }

        }else{
            System.out.println("Invalid operation");
        }
    }
}

import java.util.Scanner;
class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value = value;
    }
    public int intValue(){
        return this.value;
    }
    public short shortValue(){
        return (short) this.value;
    }
    public long longValue(){
        return (long) this.value;
    }
    public double doubleValue(){
        return (double) this.value;
    }
    @Override
    public boolean equals(Object object){
        if (object instanceof MyInteger){
            return this.value == ((MyInteger) object).value;
        }
        return false;
    }
    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
}
public class Main {
    public float Calculator(int[] input1,String[] input2){
        float out = 0;
        float[] array = new float[input1.length];
        array[0] = (float) input1[0];
        for (int i = 1;i< input1.length;i++){
            if (input2[i-1].equals("Add")){
                array[i] = (float) input1[i];
            }else if (input2[i-1].equals("Sub")){
                array[i] = (float) -1 * input1[i];
            }else if (input2[i-1].equals("Div")){
                array[i] = array[i-1]/(float) input1[i];
                array[i-1] = 0;
            }else{
                array[i] = array[i-1]* (float) input1[i];
                array[i-1] = 0;
            }
        }
        for (int i = 0; i< array.length;i++){
            out += array[i];
        }
        return out;
    }
    public void convert(int minutes){
        int unit = 24 * 60;
        int days = minutes/unit;
        int year = days/365;
        int otherDays = days - 365*year;
        System.out.printf("%d minutes is approximately %d years and %d days",minutes,year,otherDays);
        System.out.println();
    }
    public void printSquaresCubes(){
        System.out.println("Number Square Cube");
        for (int i = 0; i <= 10; i++) {
            int square = i*i;
            int cube = square*i;
            System.out.printf("%-9d%-8d%d%n", i, square, cube);
        }

    }
    public void printPow(){
        System.out.println("a b pow(a, b)");
        for(int a = 1;a<=5;a++){
            int b = a + 1;
            int pow = (int) Math.pow(a,b);
            System.out.printf("%d %d %d%n",a,b,pow);
        }
    }
    public void occuranceOfMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (end with 0):");
        int count = 0;
        int maxNumber = Integer.MIN_VALUE;
        while(true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }else {
                if (num > maxNumber){
                    maxNumber = num;
                    count = 1;
                }else if (num == maxNumber){
                    count++;
                }
            }

        }
        scanner.close();
        if (count > 0){
            System.out.println("\nThe largest number is " + maxNumber);
            System.out.println("The occurrence count of the largest number is " + count);
        }else {
            System.out.println("No valid numbers were entered.");
        }
    }
    public int findSingle(int[] nums){
        int out = 0;
        for (int num : nums){
            out ^= num;
        }
        return out;
    }
    public void printNumberIf(int num){
        if (num == 1){
            System.out.println("ONE");
        }else if(num == 2){
            System.out.println("TWO");
        }else if(num == 3){
            System.out.println("THREE");
        }else if(num == 4){
            System.out.println("FOUR");
        }else if(num == 5){
            System.out.println("FIVE");
        }else if(num == 6){
            System.out.println("SIX");
        }else if(num == 7){
            System.out.println("SEVEN");
        }else if(num == 8){
            System.out.println("EIGHT");
        }else if(num == 9){
            System.out.println("NINE");
        }else {
            System.out.println("OTHER");
        }
    }
    public void printNumberSwitch(int num){
        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        // problem1
        System.out.println("problem1");
        int[] input1 = new int[]{5,6,14,7};
        String[] input2 = new String[]{"Add","Sub","Div"};
        System.out.println(main.Calculator(input1,input2));
        int[] input3 = new int[]{5,6,14,4,1};
        String[] input4 = new String[]{"Add","Sub","Div","Mul"};
        System.out.println(main.Calculator(input3,input4));
        // problem2
        System.out.println("problem2");
        main.convert(3456789);
        //problem3
        System.out.println("problem3");
        main.printSquaresCubes();
        //problem4
        System.out.println("problem4");
        main.printPow();
        //problem5
        System.out.println("problem5");
        main.occuranceOfMax();
        //problem6
        System.out.println("problem6");
        int[] nums1 = new int[]{2,2,1};
        System.out.println(main.findSingle(nums1));
        int[] nums2 = new int[]{4,1,2,1,2};
        System.out.println(main.findSingle(nums2));
        //problem7
        System.out.println("problem7");
        for(int i = 1;i<=10;i++){
            main.printNumberIf(i);
            main.printNumberSwitch(i);
        }
        //problem8
        System.out.println("problem8");
        MyInteger myInteger1 = new MyInteger(125);
        MyInteger myInteger2 = new MyInteger(125);
        MyInteger myInteger3 = new MyInteger(40000);
        System.out.println(myInteger1.intValue());
        System.out.println(myInteger1.shortValue());
        System.out.println(myInteger1.longValue());
        System.out.println(myInteger1.doubleValue());
        System.out.println(myInteger1.equals(myInteger2));
        System.out.println(myInteger1.equals(myInteger3));
        System.out.println(myInteger1.toString());


    }
}
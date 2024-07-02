public class sum{
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        int a = 10;
        int b = 5; 

        int sum = calculateSum(a, b);
        System.out.println("Sum is : " + sum);
    }
}
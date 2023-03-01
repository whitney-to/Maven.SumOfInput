import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);
        
        System.out.println("sumOfNumbers method: "+sum);

        System.out.println("gaussianSumOfNumbers method: "+gaussianSumOfNumbers(number));

        compareMethodsTime(100000);
    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int i = 0;
        int result = 0;
        while(i<=n){
            result+=i;
            i++;
        }
        return result;
    }
    
    
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        if(n%2==0){
            return (n/2)*(n+1);
        } else {
            double temp = n;
            return (int) ((temp/2.0)*(n+1));
        }
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
    static void compareMethodsTime(int number){
        // timing sumOfNumbers method
        long start = System.currentTimeMillis();
            sumOfNumbers(number);
        long end = System.currentTimeMillis();
        long dif1 = end - start;

        // timing gaussianSumOfNumbers method
        start = System.currentTimeMillis();
            gaussianSumOfNumbers(number);
        end = System.currentTimeMillis();
        long dif2 = end - start;

        // check if sumOfNumbers method take less time
        if(dif1<dif2){
            System.out.format("For number = %d, %s is faster",number,"sumOfNumbers method");
        } else { // check otherwise
            System.out.format("For number = %d, %s is faster",number,"gaussianSumOfNumbers method");
        }
    }
}

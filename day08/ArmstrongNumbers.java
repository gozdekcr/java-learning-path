package day08;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        // A number is called an Armstrong number if the sum of its
        // digits, each raised to the power of the total number of digits,
        // equals the number itself.

        

        for(int i = 100 ; i<=999 ; i++) {
            int temp , sum=0;
            temp = i;

            while(temp>0) {
                int digit = temp % 10;                    //get last digit
                sum += digit * digit * digit; 
                temp /= 10;                               //remove last digit
            }

            if(sum==i) {
                System.out.println(i + " ");
            }

        }













    }
}

public class Odd {

    public static void main(String[] args) {

        //create an array of 10 numbers
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i < numbers.length; i++) {
            /* Use the modulus operator to check if the number odd: If we divide
            any number by 2 and remainder is not equal to zero,it is odd.
             */

            if(numbers[i]%2 != 0)
                System.out.println(numbers[i] + " is odd number.");

        }

    }
}

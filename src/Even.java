public class Even {

    public static void main(String[] args) {

        //create an array of 10 numbers
    int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

    for(int i=0; i < numbers.length; i++) {
     /* Use modulus operator to check if the number is even: If we divide any number by 2 and remainder is 0 then the number is even.*/

     if(numbers[i]%2 == 0)
         System.out.println(numbers[i] + " is even number.");
    }
  }
}
public class Smallest {

    public static void main(String[] args) {

        // array of 10 numbers
        int[] numbers = new int[]{32,23,54,53,63,43,34,23,65,98};
        // assign first element of an array to smallest
        int smallest = numbers[0];
        for(int i=1; i< numbers.length; i++)
        {
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("Smallest Number is : " +smallest);
    }
}

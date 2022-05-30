public class Largest {

    public static void main(String[] args) {
        double[] myList = {1.4, 2.5, 3.2, 4.4};

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
}

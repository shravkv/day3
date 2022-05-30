public class Dupli {

    public static void main(String[] args) {

        int [] num={5,3,2,4,2,3,};
        System.out.println( "Duplicate elements of an array");
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if(num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }
    }
}

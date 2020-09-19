public class SumOfNumberPair {

    public PairObject getSumPair(final int[] array, final int sum){
        /**
         * time complexity O(n^2)
         */
        for (int i : array) {
            for (int j : array) {
                if (i+j == sum) {
                    System.out.println("found");
                    return new PairObject(i, j, true);
                }
            }
        }
        return new PairObject(0, 0, false);
    }

    public PairObject getSumPairEfficient(final int[] array, final int sum){
        /**
         * time complexity O(n)
         */
        int i = 0;
        int j = array.length - 1;
        while(i<j){
            int calculatedSum = array[i]+array[j];
            if( calculatedSum== sum) {
                System.out.println("found");
                return new PairObject(array[i], array[j], true);
            }else if(calculatedSum < sum)
                i++;
            else
                j--;
        }
        return new PairObject(0, 0, false);
    }


    public static void main(String[] args) {
        final int[] arr = {2,3,4,4};
        SumOfNumberPair pair = new SumOfNumberPair();
        System.out.println(pair.getSumPair(arr,8).toString());
        System.out.println(pair.getSumPairEfficient(arr,8).toString());

    }


    static class PairObject{
        public int num1;
        public int num2;
        public boolean hasPairs;

        public PairObject(int num1, int num2, boolean hasPairs) {
            this.num1 = num1;
            this.num2 = num2;
            this.hasPairs = hasPairs;
        }

        @Override
        public String toString() {
            return "PairObject{" +
                    "num1=" + num1 +
                    ", num2=" + num2 +
                    ", hasPairs=" + hasPairs +
                    '}';
        }
    }
}

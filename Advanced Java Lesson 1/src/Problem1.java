public class Problem1 {

    public static void main(String[] args) {

        int[] array = {-123123,-5,10,20,30,-10,40,63,100,12312};

        int min = array[0];
        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] <= min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
//        System.out.println(min);
//        System.out.println(max);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}

public class Linear {
    public static void main(String[] args) {
        int[] array = {11,33,21,22,34,56,88};
        int value = 99;
        for (int i = 0; i < array.length; i++){
            if (value == array[i]) {
                System.out.println(value + " ditemukan");
            } else {
                System.out.println("null");
            }
        }
    }
}
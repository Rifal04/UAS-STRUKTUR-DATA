public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {11,22,33,44,55,66,77,88};
        BinaryCari(array, 44);
    }

    public static int  BinaryCari (int[] list, int value){
        int left = 0;
        int right = list.length;
        while (left < right){
            int NilaiTengah = (left + right) /2;
            System.out.println(NilaiTengah);
            if (list[NilaiTengah] == value){
                return NilaiTengah;
            } else if (list[NilaiTengah] < value) {
                left = NilaiTengah +1;
            } else {
                right = NilaiTengah;
            }
        }
        return -1;
    }
}
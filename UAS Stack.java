import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> angka = new Stack<>();
        boolean ApakahKosong = angka.empty();
        System.out.println("apakah stack kosong? " + ApakahKosong);
//        add
        angka.push(7);
        angka.push(12);
        angka.push(26);
        angka.push(722);
//        show
        System.out.println(angka);
//        delete
        angka.pop();
        System.out.println(angka);

    }
}
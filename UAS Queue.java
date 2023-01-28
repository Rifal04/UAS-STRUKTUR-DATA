import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> PasarMinggu = new LinkedList<>();
//        insert
        PasarMinggu.add("kosan");
        PasarMinggu.add("kontrakan");
        PasarMinggu.add("rumah");
        PasarMinggu.add("warung");
//        show
        System.out.println(PasarMinggu);
//        delete
        PasarMinggu.poll();
//        show
        System.out.println(PasarMinggu);

    }
}
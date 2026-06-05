public class PrintAsc {

    static void printAsc(int n) {
        if (n == 0) {
            return;
        }

        printAsc(n - 1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n = 5;
        printAsc(n);
    }
}

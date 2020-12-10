

public class UnusualAdd {
    public int addAB(int A, int B) {
        int temp = (A & B) << 1;
        A = A ^ B;
        B = temp;
        while (B != 0) {
            temp = (A & B) << 1;
            A = A ^ B;
            B = temp;
        }
        return A;
    }
}

/**
 * NaiveSolution
 */
public class NaiveSolution {

    public int josephus(int n, int k) {
        return jos(n, k) + 1;
    }

    public int jos(int n, int k) {
        if (n == 1)
            return 0;

        return (jos(n - 1, k) + k) % n;
    }

}

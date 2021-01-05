
public class leet70 {
    public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p+q;
        }
        return r;
    }
    public static void main(String[] args) {
        leet70 test = new leet70();
        System.out.println(test.climbStairs(5));
    }
}

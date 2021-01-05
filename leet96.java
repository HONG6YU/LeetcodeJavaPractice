
public class leet96 {
    public int numTrees(int n) {
        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j < i+1; j++) {
                count[i] += count[j-1] * count[i-j];
            }
        }
        return count[n];
    }
}

import java.util.ArrayList;
import java.util.List;

public class leet840 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> largeGroupPositions(String s) {
        int length = s.length();
        int count = 1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                count++;
                continue;
            }
            if (count>=3) {
                List<Integer> curIntegers = new ArrayList<>();
                curIntegers.add(i-count+1);
                curIntegers.add(i);
                ans.add(curIntegers);
            }
            count = 1;
        }
        return ans;
    }
}

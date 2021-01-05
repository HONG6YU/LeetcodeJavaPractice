import java.util.ArrayList;
import java.util.List;

public class leet840 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> largeGroupPositions(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int curLength = 0;
            int j = i;
            for (; j < length; j++) {
                char c2 = s.charAt(j);
                if (c2==c) {
                    curLength++;
                }else{
                    if (curLength>=3) {
                        List<Integer> curAns = new ArrayList<>();
                        curAns.add(i);
                        curAns.add(j-1);
                        ans.add(curAns);
                    }
                    break;
                }
            }
            i = j+1;
        }
        return ans;
    }
}

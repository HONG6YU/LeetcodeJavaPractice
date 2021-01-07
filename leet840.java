//test editors
import java.util.ArrayList;
import java.util.List;

public class leet840 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> largeGroupPositions(String s) {
        int length = s.length();
        int count = 1;
        for (int i = 0; i < length; i++) {

            if (i==length-1||s.charAt(i)!=s.charAt(i+1)) {
                if (count>=3) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(i-count+1);
                    cur.add(i); 
                    ans.add(cur);
                }
                count = 1;
            }else{
                count++;
            }
        }
        return ans;
    }
}

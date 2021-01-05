package leetcode;

public class leet1046 {
    public int lastStoneWeight(int[] stones) {
        if (stones.length==0) {
            return 0;
        }
        if (stones.length==1) {
            return stones[0];
        }
        QuickSort(stones,0,stones.length-1);
        int n = stones.length-1;
        for (int i = n-1; i >= 0; i--) {
            stones[i] = Math.abs(stones[i]-stones[i+1]);
            QuickSort(stones,0,stones.length-1);
        }
        return stones[0];
        
    }
    private void QuickSort(int[] array,int start,int end)
    {
        if(start<end)
        {
            int key=array[start];//初始化保存基元
            int i=start,j;//初始化i,j
            for(j=start+1;j<=end;j++)
            {
                if(array[j]<key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环
                {
                    int temp=array[j];
                    array[j]=array[i+1];
                    array[i+1]=temp;
                    i++;
                }
                
            }
            array[start]=array[i];//交换i处元素和基元
            array[i]=key;
            QuickSort(array, start, i-1);//递归调用
            QuickSort(array, i+1, end);
            
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,56,2,-12,0};
        leet1046 test = new leet1046();
        test.QuickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}

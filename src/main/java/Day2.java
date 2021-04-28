import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
  1833. 雪糕的最大数量
 夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。

 商店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。

 给你价格数组 costs 和现金量 coins ，请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。

 注意：Tony 可以按任意顺序购买雪糕。
 示例 1：

 输入：costs = [1,3,2,4,1], coins = 7
 输出：4
 解释：Tony 可以买下标为 0、1、2、4 的雪糕，总价为 1 + 3 + 2 + 1 = 7
 示例 2：

 输入：costs = [10,6,8,7,7,8], coins = 5
 输出：0
 解释：Tony 没有足够的钱买任何一支雪糕。
 示例 3：

 输入：costs = [1,6,3,1,2,5], coins = 20
 输出：6
 解释：Tony 可以买下所有的雪糕，总价为 1 + 6 + 3 + 1 + 2 + 5 = 18 。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/maximum-ice-cream-bars
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Day2 {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0;
        int num=0;
        List<Integer> list =new ArrayList<>(costs.length);

        for (int cost:costs) {
            if(cost<coins){
                list.add(cost) ;
            }

        }
        Collections.sort(list);
        if(list.size()==0){
            return 0;
        }
        if(list.size()>0&&list.get(0)==coins){
            return 1;
        }
        for (int l: list  ) {
            sum=sum+l;
            num++;
            if (num==list.size()&&sum<=coins){
                return list.size();
            }
            if (sum>coins){
                break;
            }
        }
        return num-1;
    }
}
/**
 执行用时：155 ms, 在所有 Java 提交中击败了5.11%的用户
 内存消耗：50.2 MB, 在所有 Java 提交中击败了99.58%的用户
 **/
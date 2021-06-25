 class Answer1 {

    /**
     * 1832. 判断句子是否为全字母句 显示英文描述
     * 题目难度Easy
     * 全字母句 指包含英语字母表中每个字母至少一次的句子。
     *
     * 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。
     *
     * 如果是，返回 true ；否则，返回 false 。
     *
     *示例 1：
     *
     * 输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
     * 输出：true
     * 解释：sentence 包含英语字母表中每个字母至少一次。
     * 示例 2：
     *
     * 输入：sentence = "leetcode"
     * 输出：false
     */
    public boolean checkIfPangram(String sentence) {
     boolean flag = true;
     int num[]=new int[25];
        for (char a:sentence.toCharArray()) {
            int b=a-97;
            num[b]=b+1;
        }
        for (int c:num) {
            if (c<1){
                flag=false;
            }
        }
    return flag;
    }

     /**
      * 执行用时：1 ms, 在所有 Java 提交中击败了97.59%的用户
      * 内存消耗：36.7 MB, 在所有 Java 提交中击败了52.46%的用户
      */
 }

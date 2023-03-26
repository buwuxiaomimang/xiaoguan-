package a3无重复字符的最长子串;


import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("ww");
        System.out.println(a);

    }
        public static int lengthOfLongestSubstring (String s){
            if (s.length() == 0)
                System.out.println(0);
            HashMap<Character, Integer> map = new HashMap<>();
            int left=0;
            int max=0;
            for (int i=0;i<s.length();i++){
                if (map.containsKey(s.charAt(i)))
                    left= Math.max(left,map.get(s.charAt(i))+1);
                map.put(s.charAt(i),i);
                max=Math.max(max,i-left+1);
    }
            return max;
}
}
//思路：
// 1.放到HasMap里面去（这里用是既要知道是内个字母也要知道是几个数）
// 2.如果没重就放进去，最大值更新，如果重了（if语句判断），就更新left,     最右边减最左边更新max，下标相减
// 3.因为知道长度，索引用for循环
//
//
//
//笔记：HashMap（键值对，键和值都有类型）：这里用是既要知道是内个字母也要知道是几个数
//方法里(开始，结束，特殊情况，内容)

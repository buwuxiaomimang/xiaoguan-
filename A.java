package a3���ظ��ַ�����Ӵ�;


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
//˼·��
// 1.�ŵ�HasMap����ȥ���������Ǽ�Ҫ֪�����ڸ���ĸҲҪ֪���Ǽ�������
// 2.���û�ؾͷŽ�ȥ�����ֵ���£�������ˣ�if����жϣ����͸���left,     ���ұ߼�����߸���max���±����
// 3.��Ϊ֪�����ȣ�������forѭ��
//
//
//
//�ʼǣ�HashMap����ֵ�ԣ�����ֵ�������ͣ����������Ǽ�Ҫ֪�����ڸ���ĸҲҪ֪���Ǽ�����
//������(��ʼ���������������������)

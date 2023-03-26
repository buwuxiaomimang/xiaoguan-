package 比特位计数;

class A {
    public int[] countBits(int n) {
        int[] bits =new int [n+1];
        for(int i=0;i<=n;i++){
            bits[i]=count(i);
        }
        return bits;
    }
    public int count(int i){
        int one=0;
        while(i>0){
            i &=(i-1);
            one++;
        }
        return one;
    }
}
//定义一个数组
//for循环存数，调用方法存值
//&= 一次去一个1


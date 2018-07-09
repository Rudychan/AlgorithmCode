package leetcode.primary.dynamic;

/**
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����
 * ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 * ע�⣺���� n ��һ����������
 * ʾ�� 1��
 * ���룺 2
 * ����� 2
 * ���ͣ� �����ַ�����������¥����
 * 1.  1 �� + 1 ��
 * 2.  2 ��
 * 
 * ʾ�� 2��
 * ���룺 3
 * ����� 3
 * ���ͣ� �����ַ�����������¥����
 * 1.  1 �� + 1 �� + 1 ��
 * 2.  1 �� + 2 ��
 * 3.  2 �� + 1 ��
 * 
 * @author ��׳��
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ClimbStairs {
	
	/**
	 * ��¥��.
	 * 
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		if (n == 0) return 1;
		int[] a = new int[n + 1];
		a[0] = 1;
		a[1] = 1;
		for (int i = 2; i <= n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		return a[n];
	}
	
	public static void main(String[] args) {
		int n=1;
		int r=new ClimbStairs().climbStairs(n);
		System.out.println(r);
	}
}

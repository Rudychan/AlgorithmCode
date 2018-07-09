package leetcode.primary.dynamic;

/**
 * ��ҽ���.
 * 
 * ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ������������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
 * ����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
 * 
 * ʾ�� 1:
 * ����: [1,2,3,1]
 * ���: 4
 * ����: ͵�� 1 �ŷ��� (��� = 1) ��Ȼ��͵�� 3 �ŷ��� (��� = 3)��
 * ͵�Ե�����߽�� = 1 + 3 = 4 ��
 * 
 * ʾ�� 2:
 * ����: [2,7,9,3,1]
 * ���: 12
 * ����: ͵�� 1 �ŷ��� (��� = 2), ͵�� 3 �ŷ��� (��� = 9)������͵�� 5 �ŷ��� (��� = 1)��
 * ͵�Ե�����߽�� = 2 + 9 + 1 = 12 ��
 *  
 * @author ��׳��
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Steal {
	
	/**
	 * �����������������.
	 * 
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		int[] m = new int[nums.length];
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		m[0] = nums[0];
		m[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			m[i] = Math.max(m[i - 2] + nums[i], m[i - 1]);
		}
		return m[nums.length - 1];
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		int r = new Steal().rob(nums);
		System.out.println(r);
	}
}

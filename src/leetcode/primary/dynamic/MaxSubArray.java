package leetcode.primary.dynamic;

/**
 * ��������.
 * 
 * ����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
 * 
 * ʾ��:
 * ����: [-2,1,-3,4,-1,2,1,-5,4],
 * ���: 6
 * ����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
 * 
 * ����:
 * ������Ѿ�ʵ�ָ��Ӷ�Ϊ O(n) �Ľⷨ������ʹ�ø�Ϊ����ķ��η���⡣
 * 
 * @author ��׳��
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class MaxSubArray {
	
	/**
	 * ��������.
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return 0;
		int pos1 = 0;
		int pos2 = 0;
		int tmp = nums[0];
		int sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (tmp > 0) {
				tmp += nums[i];
				if (tmp > sum) {
					sum = tmp;
					pos2 = i;
				}
			} else {
				tmp = nums[i];
				if (tmp > sum) {
					sum = tmp;
					pos1 = i;
					pos2 = i;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums={
			-2,1,-3,4,-1,2,1,-5,4
		};
		int r=new MaxSubArray().maxSubArray(nums);
		System.out.println(r);
	}
}

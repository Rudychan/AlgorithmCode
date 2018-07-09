package leetcode.primary.dynamic;

/**
 * ������Ʊ�����ʱ��.
 * 
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 * ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
 * ע���㲻���������Ʊǰ������Ʊ
 * 
 * ʾ�� 1:
 * ����: [7,1,5,3,6,4]
 * ���: 5
 * ����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
 * ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
 * 
 * ʾ�� 2:
 * ����: [7,6,4,3,1]
 * ���: 0
 * ����: �����������, û�н������, �����������Ϊ 0��
 * 
 * @author ��׳��
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class BestTimeOfStocks {
	
	/**
	 * �����������.
	 * 
	 * �����Ʊ�۸�Ĳ�����Ȼ������ת��Ϊ��
	 * ���㲨���������������
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
        int[] a=new int[prices.length];
		for(int i=0;i<prices.length-1;i++){
			a[i]=prices[i+1]-prices[i];
		}
        return maxSubArray(a);
    }
    
	/**
	 * ��������.
	 * 
	 * @param nums
	 * @return
	 */
    private int maxSubArray(int[] nums) {
		if(nums.length==0) return 0;
		int tmp=nums[0];
		int sum=nums[0];
		
		for(int i=1;i<nums.length;i++){
			if(tmp>0){
				tmp+=nums[i];
				if(tmp>sum){
					sum=tmp;
				}
			}else{
				tmp=nums[i];
				if(tmp>sum){
					sum=tmp;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] prices={
				7,1,5,3,6,4
		};
		int r=new BestTimeOfStocks().maxProfit(prices);
		System.out.println(r);
	}
}

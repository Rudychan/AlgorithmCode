package leetcode.all;

import leetcode.common.LinkedLists;
import leetcode.common.ListNode;

/**
 * �������.
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 * 
 * ���������ǿ���������ʾ�����Ǹ�������λ����������ʽ�洢�����ǵ�ÿ���ڵ�ֻ�洢�������֡���������ӷ���һ���µ�����
 * ����Լ���������� 0 ֮�⣬���������ֶ��������㿪ͷ��
 * 
 * ʾ����
 * ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * �����7 -> 0 -> 8
 * ԭ��342 + 465 = 807
 * 
 * @author ��׳��
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(-1);//ͷ�ڵ�
		ListNode p = node;//ָʾִ�е���λ��
		int plusOne = 0;//�Ƿ��λ
		
		while (l1 != null || l2 != null) {
			//�����Ӧλ��
			int v1 = (l1 != null) ? l1.val : 0;
			int v2 = (l2 != null) ? l2.val : 0;
			int r = v1 + v2 + plusOne;
			
			//֮�ʹ���9����ȥʮ��Ϊ��ֵ������λ
			if (r > 9) {
				plusOne = 1;
				ListNode tmp = new ListNode(r - 10);
				p.next = tmp;
				p = tmp;
			} else {
				plusOne = 0;
				ListNode tmp = new ListNode(r);
				p.next = tmp;
				p = tmp;
			}
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}

		//������һλ��Ȼ��Ҫ��λ�������ڵ�
		if (plusOne == 1) {
			p.next = new ListNode(1);
		}
		return node.next;
	}

	public static void main(String[] args) {
		//����㷨�����Ǹ�Ч�ģ���������������Լ��ǹ���ȥ��
		int[] list1 = { 
				2,4,3,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,2,4,3,
				2,4,3,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,2,4,3,9 };
		int[] list2 = { 
				5,6,4,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,2,4,3,
				2,4,3,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,9,9,9,9 };

		ListNode l1 = LinkedLists.arrayToLinkedList(list1);
		ListNode l2 = LinkedLists.arrayToLinkedList(list2);

		ListNode root = new Solution2().addTwoNumbers(l1, l2);
		LinkedLists.print(root);
	}
}

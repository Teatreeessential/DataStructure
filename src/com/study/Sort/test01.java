package com.study.Sort;

public class test01 {
	public static void main(String[] args) {
		int [] arr = {3,4,8,1,2,10,8};
		test01 t = new test01();
		t.quicksort(arr, 0, arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public void quicksort(int[] arr,int left,int right) {

		if(left<=right) { //��� �̺κ��� �ƹ� ��� �������̾���.
			int pivot = partition(arr,left,right);
			quicksort(arr,left,pivot-1);
			quicksort(arr,pivot+1,right);
			
		}
	}
	
	public void swap(int[] arr,int low,int high) {
		int temp;
		temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
	
	public int partition(int []arr,int left,int right) {
			int pivot = arr[left];
			int low = left+1;
			int high = right;
		while(low<=high) { 
			//�� �κп��� <=�� �ƴ� <�� �� ��� �迭�� ���̰� �ΰ��� ��쿡�� ���Ͽ� �ڸ� �ٲ��� ���� ���ϰ� �ȴ�.
			//������� 2,1�� ���  low�� 1 high�� 1�ش� �κп����� �ڸ��ٲ��� �߻����� �ʴ´�.
			//�ش� �ݺ����� ������ swap�޼��忡�� left�� ��� 0�̰� high�� ���1�̱⶧���� �ٲ� 
			//������ 1,2�� ��쿡��  high�� left�� ���� �ε����� ����Ű�� �ǰ� �ѹ��� swap�� �߻��ϰ� �ȴ�.
			while(low<=right&&pivot>=arr[low]) low++;
			
			//������ å������ pivot>=arr[low]&&low<=right�� ������ ������
			//c����� ��쿡�� arr[�ʰ��ε���]�� ��쿡�� ������ 0�� ���ϵȴ�.
			//�׸��� �ｼ pivot>=[low] �κ��� ������ �߻����� �ʴ´�.
			while(pivot<=arr[high]&&high>=(left+1)) high--;
			if(low<=high) {
				swap(arr,low,high);
				
			}
		}
		swap(arr,left,high);
		return high;
		

	}

}

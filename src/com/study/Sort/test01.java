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

		if(left<=right) { //사실 이부분은 아무 상관 없던것이었다.
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
			//이 부분에서 <=가 아닌 <을 할 경우 배열의 길이가 두개일 경우에는 비교하여 자리 바꿈을 하지 못하게 된다.
			//예를들어 2,1의 경우  low도 1 high도 1해당 부분에서는 자리바뀜이 발생하지 않는다.
			//해당 반복문을 나가서 swap메서드에서 left의 경우 0이고 high의 경우1이기때문에 바뀜 
			//하지만 1,2의 경우에는  high와 left가 동일 인덱스를 가르키게 되고 한번의 swap만 발생하게 된다.
			while(low<=right&&pivot>=arr[low]) low++;
			
			//윤성우 책에서의 pivot>=arr[low]&&low<=right이 가능한 이유는
			//c언어의 경우에는 arr[초과인덱스]의 경우에는 무조건 0이 리턴된다.
			//그말은 즉슨 pivot>=[low] 부분은 에러가 발생하지 않는다.
			while(pivot<=arr[high]&&high>=(left+1)) high--;
			if(low<=high) {
				swap(arr,low,high);
				
			}
		}
		swap(arr,left,high);
		return high;
		

	}

}

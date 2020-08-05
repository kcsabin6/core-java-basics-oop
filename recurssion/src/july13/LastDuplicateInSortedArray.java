package july13;

public class LastDuplicateInSortedArray {

	
	public static void main(String[] args) {
		int[] arr={0,1,2,2,4,5,5,5,8,8};
		int s=8;
		
		//System.out.println(findByBinary(arr,s));
		int index=findByBinary(arr,s);
		 System.out.println("Last duplicate is found at index "+index);

	}

	private static int findByBinary(int[] arr, int num) {
		int start=0;
		int index=-1;
		int end=arr.length-1;
			
		
		while(start<=end) {
		int mid= (start+end)/2;
		if(arr[mid]==num) {
			index= mid;
			start=mid+1;
		}
		else if(num<arr[mid]) {end=mid-1;}
		else{start=mid+1;}
		}
		return index;
		
	}
	
	

}

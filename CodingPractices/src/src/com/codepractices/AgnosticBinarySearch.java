package src.com.codepractices;

public class AgnosticBinarySearch {
	
//	AgnosticBinarySearch  - you are not sure whether array is in ascending or descending

	public static void main(String[] args) {
		
		//int[] arr= {12,14,18,34,38,56,78,98};
		
		int[] arr= {99,76,65,54,44,43,21,5};
		int target=99;
		
		System.out.println(agnosticBinarySearch(arr, target));
	}
	
	static int agnosticBinarySearch(int arr[], int target) {
		
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc;
		
		if(arr[start]<arr[end]) {
			isAsc=true;
		}else isAsc=false;
			
		
		if (isAsc) {
			while(start<=end) {
				

				int mid= start+(end-start)/2;
				
				if(arr[mid]==target) {
					return mid;
				}
				
				if(target>arr[mid]) {
					start=mid+1;
				}
				
				if(target<arr[mid]) {
					end=mid-1;
				}
					
			}
		}else {
				while(start<=end) {
				

				int mid= start+(end-start)/2;
				
				if(arr[mid]==target) {
					return mid;
				}
				
				if(target<arr[mid]) {
					start=mid+1;
				}
				
				if(target>arr[mid]) {
					end=mid-1;
				}
					
			}
		}
		
		return -1;
		
	}
	
		

}

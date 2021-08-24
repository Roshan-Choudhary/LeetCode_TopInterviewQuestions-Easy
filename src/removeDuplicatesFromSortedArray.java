public class removeDuplicatesFromSortedArray {

	public static void main(String[] args) {
	     int a[] = {0,0,1,1,1,2,2,3,3,4};
	        int l = a.length;
	        int j=0;
	        int n = a[j];
	        for(int i=1;i<l;i++) {
	            if(n != a[i]) {
	                j++;
	                a[j] = a[i];
	                n = a[i];
	            }
	        }
	
	        for(int i=0;i<j+1;i++) {
	                System.out.print(a[i]+" ");
	        } 

	}

}

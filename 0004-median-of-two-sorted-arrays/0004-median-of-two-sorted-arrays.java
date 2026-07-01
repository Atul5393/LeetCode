class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int arr[] = new int[n+m];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            arr[k++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[k++]=nums2[j];
        }
        Arrays.sort(arr);
        int total = arr.length;
        int mid =total/2;
        if(total%2==1){
            return arr[mid];
        }else{
            return (double)(arr[mid-1]+arr[mid])/2;
        }
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            st.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (st.contains(nums2[i])) {
                arr.add(nums2[i]);
                st.remove(nums2[i]);
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
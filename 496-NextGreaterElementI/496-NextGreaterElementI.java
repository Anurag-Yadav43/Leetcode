class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        Map<Integer , Integer> nextGreaterMap = new HashMap<>();

        for(int i= nums2.length-1;i>=0;i--){
            while(stack.peek() != -1 && stack.peek() <= nums2[i]){
                stack.pop();
            }

            nextGreaterMap.put(nums2[i],stack.peek());
            stack.push(nums2[i]);
        }

        //compare and put into result array
        int []result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}
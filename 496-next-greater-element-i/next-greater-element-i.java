class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;

        for(int e:nums2){
            map.put(e,c);
            c++;
        }
        int[] arr=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            while(!stk.isEmpty() && nums2[i]> nums2[stk.peek()]){
                int idx=stk.pop();
                arr[idx]=nums2[i];
            }
            stk.push(i);
        }

        while(!stk.isEmpty()){
            int idx=stk.pop();
            arr[idx]=-1;
        }
        int[] res=new int[nums1.length];
        int j=0;
        for(int e:nums1){
            int idx=map.get(e);
            res[j]=arr[idx];
            j++;
        }
        return res;
        // for(int e:nums2){
        //     while(!stk.isEmpty() && e>stk.peek()){
        //         int val=stk.pop();
        //         map.put(val,e);
        //     }
        //     stk.push(e);
        // }
        // while(!stk.isEmpty()){
        //     int val=stk.pop();
        //     map.put(val,-1);
        // }
        // int[] res=new int[nums1.length];
        // int i=0;

        // for(int e:nums1){
        //     int val=map.get(e);
        //     res[i]=val;
        //     i++;
        // }
        // return res;
    }
}
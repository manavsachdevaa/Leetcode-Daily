class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     int [] res=new int[nums1.length];
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if(nums1[i]==nums2[j]){
    //                 int idx=j;
                    
    //                 int n=nums2.length-1;

    //                if(j<n){
    //                 for(int k=j+1;k<=n;k++){
    //                     if(nums2[k]>nums2[idx]){
    //                         res[i]=nums2[k];
    //                         break;
    //                     }
    //                     else{
    //                         res[i]=-1;
    //                     }
    //                 }
    //             }
    //             else{
    //                 res[i]=-1;
    //             }
    //         }
    //     }
       
    // }
    //  return res;

    int[] res=new int[nums1.length];
    Stack<Integer> stk=new Stack<>();
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int e:nums2){
        while(!stk.isEmpty() && e>stk.peek()){
            int val=stk.pop();
            map.put(val,e);

        }
        stk.push(e);
    }
    while(!stk.isEmpty()){
        int val=stk.pop();
        map.put(val,-1);
    }
    int i=0;
    for(int e:nums1){
        res[i]=map.get(e);
        i++;
    }
    return res;
    }
}

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int[] freq = new int[100001];
        long k = (long) k1 + k2;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }

        for (int i = 100000; i > 0 && k > 0; i--) {

            if (freq[i] == 0) {
                continue;
            }

            long reduce = Math.min(k, freq[i]);

            freq[i] -= (int) reduce;
            freq[i - 1] += (int) reduce;

            k -= reduce;
        }

        long ans = 0;

        for (int i = 1; i <= 100000; i++) {
            ans += (long) i * i * freq[i];
        }

        return ans;
    }
}


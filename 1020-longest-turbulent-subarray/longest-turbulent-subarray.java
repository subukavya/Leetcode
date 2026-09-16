class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int left = 0;
        int ans = 1;

        for (int right = 1; right < n; right++) {

            if (arr[right] == arr[right - 1]) {
                left = right;
            }
            else if (right == 1 || 
                    (arr[right] > arr[right - 1] && arr[right - 1] <= arr[right - 2]) ||
                    (arr[right] < arr[right - 1] && arr[right - 1] >= arr[right - 2])) {
                ans = Math.max(ans, right - left + 1);
            }
            else {
                left = right - 1;
            }
        }

        return ans;
    }
}
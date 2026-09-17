class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] > arr[i])) {
                int mid = stack.pop();

                int left = stack.isEmpty() ? mid + 1 : mid - stack.peek();
                int right = i - mid;

                sum = (sum + (long) arr[mid] * left * right) % 1000000007;
            }
            stack.push(i);
        }

        return (int) sum;
    }
}
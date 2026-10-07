class Solution {
    Set<String> set = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int left = 0, right = 0;

        // Count how many '(' and ')' must be removed
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left > 0)
                    left--;
                else
                    right++;
            }
        }

        dfs(s, 0, left, right);

        return new ArrayList<>(set);
    }

    void dfs(String s, int index, int left, int right) {

        if (left == 0 && right == 0) {
            if (isValid(s))
                set.add(s);
            return;
        }

        for (int i = index; i < s.length(); i++) {

            // Don't remove the same parenthesis twice
            if (i > index && s.charAt(i) == s.charAt(i - 1))
                continue;

            // We can remove only parentheses
            if (s.charAt(i) == '(' && left > 0) {
                dfs(
                    s.substring(0, i) + s.substring(i + 1),
                    i,
                    left - 1,
                    right
                );
            }

            if (s.charAt(i) == ')' && right > 0) {
                dfs(
                    s.substring(0, i) + s.substring(i + 1),
                    i,
                    left,
                    right - 1
                );
            }
        }
    }

    boolean isValid(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {

            if (c == '(')
                count++;

            else if (c == ')') {
                count--;

                if (count < 0)
                    return false;
            }
        }

        return count == 0;
    }
}
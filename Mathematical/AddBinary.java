class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        char carry = '0';

        while (i >= 0 || j >= 0) {
            char aChar = i >= 0 ? a.charAt(i) : '0';
            char bChar = j >= 0 ? b.charAt(j) : '0';

            if (aChar == '1') {
                if (bChar == '1') {
                    if (carry == '1') {
                        ans.append('1');
                    } else {
                        ans.append('0');
                    }
                    carry = '1';
                } else {
                    if (carry == '1') {
                        ans.append('0');
                    } else {
                        ans.append('1');
                        carry = '0';
                    }
                }
            } else {
                if (bChar == '1') {
                    if (carry == '1') {
                        ans.append('0');
                    } else {
                        ans.append('1');
                    }
                } else {
                    if (carry == '1') {
                        ans.append('1');
                        carry = '0';
                    } else {
                        ans.append('0');
                    }
                }
            }
            i--;
            j--;
        }

        if (carry == '1') {
            ans.append('1');
        }

        return ans.reverse().toString();
    }
}

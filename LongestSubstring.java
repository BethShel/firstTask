package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */


    public int getLengthOfLongestSubstring(String checkString) {
        int n = checkString.length();
        int charCount = 256;
        int curLen = 1;
        int maxLen = 1;
        int visitedArr[] = new int[charCount];
        for (int i = 0; i < charCount; i++) {
            visitedArr[i] = -1;
        }
        visitedArr[checkString.charAt(0)] = 0;
        for (int i = 1; i < n; i++) {
            int prevIndex;
            prevIndex = visitedArr[checkString.charAt(i)];
            if (prevIndex == -1 || i - curLen > prevIndex)
                curLen++;
            else {
                if (curLen > maxLen)
                    maxLen = curLen;
                curLen = i - prevIndex;
            }
            visitedArr[checkString.charAt(i)] = i;
        }
        if (curLen > maxLen)
            maxLen = curLen;
        return maxLen;
    }
}

package com.bank.leetcode.array2;
/* URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13
Output: "Mr%20John%20Smith"

 We will use this approach in this problem. The algorithm employs a two-scan approach.
 In the first scan, we count the number of spaces.
 By tripling this number, we can compute how many extra characters we will
 have in the final string.

 In the second pass, which is done in reverse order, we actually edit the string.
 When we see a space, we replace it with %20.
 If there is no space, then we copy the original character.*/
public class URLify {
    void replaceSpaces(char[] str, int trueLength){
        // create int variables space = 0, index and i = 0
        int spaceCount = 0, index, i = 0;

        // 2. count every space
        for (i = 0; i < trueLength; i ++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        // assign int index to trueLengt + every space * 2
        index = trueLength + spaceCount * 2; // 17 + 6 * 2 = 26; 26 - 6 = 20; 20 - 11 = 9
        if (trueLength < str.length)
            str[trueLength] = '\0'; // end arr

        for (i = trueLength -1; i >= 0; i--){
            if (str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                // assign index with removing - 3
                index = index - 3;
            }
            // if there is no space between chars,
            // then arr is [ every count index of trueArray + counted spaces removes by -1 ]
            // = arr[i] thus arr[] is true size of
            else {
                str[index - 1] = str[i];
                // continue this until index counted spaces cannot be removed
                index --;

            }
        }
    }
}

package com.bank.leetcode.array2;

/*   Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

  At first glance, implementing this method seems fairly straightforward,
  but perhaps a bit tedious.
  1. We iterate through the string,
  2. copying characters to a new string
  3. and counting the repeats.

  4. At each iteration,
  5. check if the current character is the same as the next character.
  6. If not, add its compressed version to the result.
  How hard could it be? */
public class String_Compression {

    String compressBad(String str){
        // assign
        String compressedString = "";
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++){
            countConsecutive++;

        /* If next character is different than current, append this char to result.*/
        if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            compressedString += "" + str.charAt(i) + countConsecutive;
            countConsecutive = 0;
        }
        }
       return compressedString.length() < str.length() ?  compressedString : str;
    }

    // Solution Best We can fix this by using a StringBuilder.
    String compress(String str){
       StringBuilder compressed = new StringBuilder() ;
       int countConsecutive = 0;
       for (int i = 0; i < str.length(); i++){
           countConsecutive++;
        /* If next character is different than current, append this char to result.*/
           if (i + 1 >= str.length() || str.charAt(i) != str.charAt( i + 1) ){
              compressed.append(str.charAt(i));
              compressed.append(countConsecutive);
              countConsecutive = 0;
           }
       }
       return compressed.length() < str.length() ? compressed.toString() : str;

    }

}

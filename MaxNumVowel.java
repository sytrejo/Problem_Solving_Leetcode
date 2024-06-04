/*
Given a string s and an integer k, 
return the maximum number of vowel letters in any 
substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 */

 /**
  * MaxNumVowel
  */
 public class MaxNumVowel {
 
        public static void main(String[] args) {
            String s = "abciiidef";
            int k = 3;
            System.out.println(maxVowels(s, k));
        }
    
        public static int maxVowels(String s, int k) {
            int max = 0;
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (isVowel(s.charAt(i))) {
                    count++;
                }
            }
            max = count;
            for (int i = k; i < s.length(); i++) {
                if (isVowel(s.charAt(i))) {
                    count++;
                }
                if (isVowel(s.charAt(i - k))) {
                    count--;
                }
                max = Math.max(max, count);
            }
            return max;
        }
    
        public static boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
 }

 /*
  * Bruteforce
  public int maxVowels(String s, int k) {
    return IntStream.range(0, s.length() - k + 1)
            .map(i -> (int) s.substring(i, i + k).chars().filter(c -> "aeiou".indexOf(c) >= 0).count())
            .max().orElse(0);
    }
  */
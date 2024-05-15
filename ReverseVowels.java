/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower 
and upper cases, more than once.
 */

class ReverseVowels {

    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int start = 0 ;

        int end = s.length()-1;

        while (start<end){
            while (start < end && !isVowel(chars[start])) {
                start++;
            }

            while (start < end && !isVowel(chars[end])) {
                end--;
            }

            if (start < end) {
                swap(chars, start, end);
                start++;
                end--;
            }

        }

        return new String(chars);
    }

    private void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}

/*
 * Questions to Ask:
 * 1. Will the string be empty?
 * 2. Will the case of the vowels matter?
 */


/*
 * Solution if the string won't be empty and the case doesn't matter
 * 
 * class ReverseVowels {

        public String reverseVowels(String s) {
        s = s.toLowerCase().trim();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

}
 * 
 */
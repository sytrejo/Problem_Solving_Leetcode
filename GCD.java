
class GCD{
    
    // Public method that takes two strings as input and returns a string.
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenation of str1 and str2 is equal to concatenation of str2 and str1.
        // This checks if str1 and str2 have the same pattern that can be repeated to form each other.
        if(!(str1 + str2).equals(str2 + str1)){
            // If they do not form equal concatenations, there is no common divisor string, return an empty string.
            return "";
        }

        // Calculate the greatest common divisor (GCD) of the lengths of str1 and str2.
        // This GCD represents the length of the largest substring that can divide both strings.
        int gcd = gcd(str1.length(), str2.length());

        // Return the substring of str1 from the beginning to the length of the calculated GCD.
        // This substring is the greatest common divisor string of str1 and str2.
        return str1.substring(0, gcd);
    }

    // Private helper method to calculate the greatest common divisor (GCD) of two integers.
    // It uses the Euclidean algorithm.
    private int gcd(int a, int b){
        // If b is 0, the recursion ends, and a is returned as the GCD.
        // Otherwise, recursively call gcd with b and the remainder of a divided by b.
        return b == 0 ? a : gcd(b, a % b);
    }
}


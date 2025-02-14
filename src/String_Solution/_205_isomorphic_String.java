class Solution {
    public boolean isIsomorphic(String s, String t) {
       
       int[] lastSeenPositionInS = new int[256]; // Assuming extended ASCII
        int[] lastSeenPositionInT = new int[256]; // Assuming extended ASCII
      
        // Length of the input strings
        int length = s.length();
      
        // Iterate through each character in the strings
        for (int i = 0; i < length; ++i) {
            // Get the current characters from each string
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);
          
            // If the last seen position of the respective characters
            // in the two strings are not the same, then they are not isomorphic
            if (lastSeenPositionInS[charFromS] != lastSeenPositionInT[charFromT]) {
                return false; // Not isomorphic
            }
          
            // Update the last seen position of the characters
            // i + 1 is used because default value in int arrays is 0, 
            // and we are using the index as a check (can't use 0 as it is the default)
            lastSeenPositionInS[charFromS] = i + 1;
            lastSeenPositionInT[charFromT] = i + 1;
        }
      
        // If all characters in 's' can be replaced to get 't', return true, as the strings are isomorphic
        return true;
    }
}

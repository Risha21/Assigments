package com.Strings;

import java.util.HashMap;

public class StringProgram {
//	private static final String ORIGINAL = "i miss you so much doll";

	public String countSpace(String original) {
		int count = 0;
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == ' ') {
				count = count + 1;
			}

		}
		System.out.println(count);
		return original;
	}

	public void countCharacters(String original) {
		/ Creating a HashMap containing char 
        // as a key and occurrences as  a value 
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
  
        // Converting given string to char array 
  
        char[] strArray = inputString.toCharArray(); 
  
        // checking each char of strArray 
        for (char c : strArray) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
  
        // Printing the charCountMap 
        for (Map.Entry entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 

	public String concatReversedString(String original) {
		StringBuilder reverse = new StringBuilder();
		StringBuilder result = new StringBuilder();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse.append(original.charAt(i));
		}
		return result.append(original).append(" ").append(reverse).toString();
	}

	public static void main(String[] args) {
		// StringProgram.concatReversedString();
		StringProgram sp = new StringProgram();
		System.out.println(sp.concatReversedString("i miss you so much doll"));
		sp.countSpace("i miss you so much doll");

	}

}

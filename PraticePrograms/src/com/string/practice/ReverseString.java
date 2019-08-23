package com.string.practice;

public class ReverseString {
	  private static StringBuilder s1 = new StringBuilder("Do or Die.");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
	    int first = 0;
	    int last;
	    swap(0, s1.length() - 1);
	    while (i < s1.length()) {
	      if (s1.charAt(i) == ' ') {
	        last = i - 1;
	        swap(first, last);
	        first = i + 1;
	      }
	      i++;
	    }
	    swap(first, s1.length() - 1);
	    System.out.println(s1);

	}
	
	private static void swap(int first, int last) {
	    while (first < last) {
	      char ch = s1.charAt(first);
	      s1.setCharAt(first, s1.charAt(last));
	      s1.setCharAt(last, ch);
	      first++;
	      last--;
	    }
	  }

}

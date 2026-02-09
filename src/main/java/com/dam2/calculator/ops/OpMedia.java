package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMedia {
		    public static String run(String input) {
	        int[] nums = ParserUtils.parseInts(input);
	       
	        if (nums == null) return "Error: formato inválido";
	        if (nums.length < 3) return "Error: sub necesita exactamente 3 números";
	        int media = 0;
	         for(int i=0; i<nums.length;i++) {
	        	 media+= nums[i];
	         }
	        return String.valueOf(media/nums.length);
	    }

	}


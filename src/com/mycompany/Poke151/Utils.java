package com.mycompany.Poke151;

import java.lang.String;

public class Utils
{
	public static String KanaHenkan (String str){
		
		StringBuffer sb = new StringBuffer(str);
		
		for (int i =0; i < sb.length(); i++){
			char c = sb.charAt(i);
			if ( c >= 'ぁ' && c <= 'ん' ){
				sb.setCharAt(i, (char)(c - 'ぁ' + 'ァ'));
			}
		}
		
		return sb.toString();
	}
}

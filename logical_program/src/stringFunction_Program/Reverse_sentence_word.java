package stringFunction_Program;

import java.util.Iterator;

public class Reverse_sentence_word {

	public static void main(String[] args) {
		String s="God Of Thunder";
		String[] split = s.split(" ");
		for (int i = split.length-1; i >=0 ; i--)
		{
			System.out.print(split[i]+" ");
		}
	}

}

package CharacterRepeated;

import java.util.Map.Entry;
import java.util.TreeMap;

public class AEBCDABBC {

	public static void main(String[] args) {
		String s="aebcdabbc";
		TreeMap<Character,Integer> t=new TreeMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(!t.containsKey(ch[i]))
			{
				t.put(ch[i],1);
			}
			else
			{
				int count=t.get(ch[i]);
				t.put(ch[i], count+1);
			}
		}
		for(Entry<Character,Integer>o:t.entrySet())
		{
			System.out.println(o.getKey()+" "+o.getValue());
		}
	}

}

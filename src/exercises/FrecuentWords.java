package exercises;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class FrecuentWords {

	public static void main(String[] args) {

		try {

			String string = " Once upon a time, in a faraway land, there was a brave young prince. The prince was loved by all in the kingdom, for he was kind, noble, and wise. The people of the kingdom would often say, 'Our prince is the most noble and brave of all!' However, one day, a dark shadow loomed over the land. The prince knew that his courage would soon be tested. So, with a heart full of determination, he set out on a journey to protect his people and bring peace back to his beloved land.";
			HashSet<String> hs = new HashSet<String>();
			HashMap<String, Integer> hm = new HashMap<String, Integer>();

			string = string.replaceAll("!|,|\\.|\\?", "").toLowerCase().trim();
			String[] s_array = string.split("\\s+");

			for (int i = 0; i < s_array.length; i++) {
				// System.out.println(s_array[i]);
				hs.add(s_array[i]);
			}

			for (String elemenths : hs) {
				int counter = 0;
				for (String elementarray : s_array) {
					if (elementarray.equals(elemenths))
						counter++;
				}
				hm.put(elemenths, counter);
			}
			//System.out.println(Collections.max(hm.values()));
			//System.out.println(hm);
			
			for (int i=Collections.max(hm.values());i>0;i--){
				for(HashMap<K, V> temp: hm) {
					
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

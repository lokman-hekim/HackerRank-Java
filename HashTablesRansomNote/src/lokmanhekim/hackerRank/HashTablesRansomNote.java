package lokmanhekim.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class HashTablesRansomNote {

	public static void main(String[] args) {

		 String[] magazine = "give me one grand today night".split(" ");

         String[] note = "give one grand today".split(" ");

         checkMagazine(magazine, note);
         

	}

	static void checkMagazine(String[] magazine, String[] note) {
		
	Map<String,Integer> magWords=new HashMap<String,Integer>();

	String item;
	for (int i=0;i<magazine.length;i++)
    {
		item = magazine[i];
				
        if (magWords.keySet().contains(item))
        {
        	magWords.replace(item, magWords.get(item)+1);
        }
        else
        {
            magWords.put(item, 1);
        }
    }

	

		String msg = "Yes";
		for (int i = 0; i < note.length; i++) {
			if (magWords.keySet().contains(note[i])) {
				if (magWords.get(note[i]) > 0) {
					magWords.replace(note[i], magWords.get(note[i])-1);
					
				} else {
					msg = "No";
					break;
				}

			} else {
				msg = "No";
				break;
			}
		}
		System.out.println(msg);
	}

}

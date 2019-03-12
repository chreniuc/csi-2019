/**
 * 
 */
package csi;

/**
 * @author STUDENT
 *
 */
public class PlayFair {
	
	public String encrypt(String PlainText, String Key)
	{
		
		String cleared_plain = PlainText.replaceAll("[,;\\s-]", "");
		cleared_plain = cleared_plain.toUpperCase();
		for(int i = 0; i < cleared_plain.length() - 1; i++)
		{
			if(cleared_plain.charAt(i) == cleared_plain.charAt(i+1))
			{
				cleared_plain = cleared_plain.substring(0, i+1) + "X" + cleared_plain.substring(i+1, cleared_plain.length()); // append random X or Z
				i++;
			}
		}
		if(cleared_plain.length() % 2 == 1)
		{
			cleared_plain += 'A'; // Apped random letter
		}
		
		// Prepare key
		String valid_key = prepare_key(Key);
		
		return cleared_plain;
	}
	
	private String prepare_key(String Key)
	{
		String new_key;
		for(int i = 0; i < Key.length(); i++)
		{
			for(int j = i+1; j < Key.length(); j++)
			{
				//new_key = Key.substring(i+1,  Key.length()).replaceAll(Key.charAt(i), "");
			}
		}
		return "";
	}

}

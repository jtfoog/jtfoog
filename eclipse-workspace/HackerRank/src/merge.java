
public class merge {
	static String mergeStrings(String a, String b) {
		String mergedString = "";
		
		if(a.length() == b.length()) {
			for(int i=0; i<a.length(); i++) {
				mergedString = mergedString + a.charAt(i);
				mergedString=mergedString + b.charAt(i);
			}
		}
		else if (a.length() > b.length()){
			int counter=0;
			for (int i=0; i<b.length(); i++) {
				counter++;
				mergedString = mergedString + a.charAt(i);
				mergedString=mergedString + b.charAt(i);
			}
			
			for(int i=counter; i<a.length(); i++) {
				mergedString = mergedString+a.charAt(i);
			}
		}else {
			int counter=0;
			for (int i=0; i<a.length(); i++) {
				counter++;
				mergedString = mergedString + a.charAt(i);
				mergedString=mergedString + b.charAt(i);
			}
			
			for(int i=counter; i<b.length(); i++) {
				mergedString = mergedString+a.charAt(i);
			}
		}
		
		return mergedString;
    }
}

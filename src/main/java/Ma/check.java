package Ma;

import java.util.ArrayList;

public class check {
	
	 private int total=0;
		public int calculate(Integer int1, String string,ArrayList<String>s , ArrayList<Integer> num) {
			// TODO Auto-generated method stub
			for(int i=0;i<s.size();i++) {
				if(s.get(i).equalsIgnoreCase(string)) {
					total=int1.intValue()*num.get(i);
				}
			}

			
	return total;
	}
	}
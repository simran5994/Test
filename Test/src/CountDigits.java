import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = Integer.parseInt("95000991418267990215");
		Map<Long, Long> table= new HashMap<Long,Long>();
		for(long i=0;i<=9;i++){
			table.put(i, (long) 0);
		}
		while(n>0)
		{
			long digit=n%10;
			if(table.containsKey(digit)){
				Long value=table.get(digit);
				
				table.put(digit, ++value);
				n=n/10;
			}
		}
		for(Entry<Long, Long> entry : table.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

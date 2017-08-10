import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RankInMap {
	static int rank=1;
	public static void main(String[] args) {
		HashMap<String, Double> sortedMap = new HashMap<>();
		sortedMap.put("111", 1.11);
		sortedMap.put("222", 2.22);
		sortedMap.put("333", 3.33);
		sortedMap.put("444", 3.33);
		sortedMap.put("555", 1.11);
		sortedMap.put("666", 2.22);
		HashMap<String, ArrayList<Double>> rankMap = new HashMap<>();
		ArrayList<Double> scoreList= new ArrayList<>();
		for(Map.Entry<String, Double> entry: sortedMap.entrySet()){
			scoreList.add(entry.getValue());
		}
		Collections.sort(scoreList,Collections.reverseOrder());
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		int count=0;
		ArrayList<Double> finalList= new ArrayList<>();
	for(int i=0;i<scoreList.size();){
		System.out.println(i);
		for(int j=i;j<scoreList.size();j++){
			if(scoreList.get(i).equals(scoreList.get(j))){
				count++;
				finalList.add(scoreList.get(j));
				i=j;
			}
			else{
				rankMap.put(Integer.toString(rank), finalList);
				rank++;
				i=j;
				finalList= new ArrayList<>();
				break;
			}
					}
		if(i==scoreList.size()-1){
			
			rankMap.put(Integer.toString(rank), finalList);
			break;
		}

		
	}
	System.out.println(rankMap);
	}
}

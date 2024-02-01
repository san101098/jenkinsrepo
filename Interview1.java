package package3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,3,1,2};
		int[] result = findVisited(arr1, arr2);
		for(int i: result)
			System.out.println(i);
}

	private static int[] findVisited(int[] arr1, int[] arr2) {
		int[] visited = new int[100];
		int[] result = new int[100];
		int count =0;
		for(int i:arr1)
		{
			visited[i]++;
			for(int j:arr2)
			{
				if(i==j && visited[i]>1)
				{
					visited[i]--;
					result[count++] = j;
				}
			}
		}
		return result;
	}

	private static int[] findCommonElements(int[] arr1, int[] arr2) {
		List<Integer> resList = new ArrayList<>();
		int count =0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i: arr1)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int j: arr2)
		{
			if(map.containsKey(j) && map.get(j)>0)
			{
				resList.add(j);
				map.put(j, map.get(j)-1);
			}
		}
		int[] result = new int[resList.size()];
		for(int i:resList)
				result[count++] = i;
		return result;
	}
}

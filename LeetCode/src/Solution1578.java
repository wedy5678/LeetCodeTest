public class Solution1578 {
	public int minCost(String s, int[] cost) {
		String op = "";
		int j = 0;
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1)
				j = i + 1;
			else {
				op = op + s.charAt(i);
				break;
			}
			if (s.charAt(i) != s.charAt(j))
				op = op + s.charAt(i);
			else if(cost[i] > cost[j]){
				k = k + cost[j];
			}else if(cost[i] < cost[j]) {
				k = k + cost[i];
			}else if(cost[i] == cost[j]) {
				k = k + cost[i] + cost[j];
			}
				
		}
		System.out.println(op);
		if(s.equals(op))
			k = 0;
		return k;
	}

	public static void main(String[] args) {
		
		Solution1578 solution = new Solution1578();
		String s = "aabaa";
		int[] cost = {1,2,3,4,1};
		System.out.println(solution.minCost(s, cost));
		
	}
}

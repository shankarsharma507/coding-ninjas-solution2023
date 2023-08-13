// You are given a binary matrix with ‘M’ rows and ‘N’ columns initially consisting of all 0s. 'Q' queries follow.


public class Solution {
	public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Write your code here. int index = 0;
        int len = 0;
        for(int i =0; i<q.length;i++) {
            if((int)q[i].charAt(0)=='2'){
                len++;
            }
        }
        int answer [] = new int[len];
        for(int i =0; i<q.length;i++){
            if((int)q[i].charAt(0)=='1'){
                if(q[i].charAt(1)=='R'){
                    for(int p =0;p< mat.length;p++){
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if(mat[indexChange][p]==0) {
                            mat[indexChange][p] = 1;
                        }else{
                            mat[indexChange][p] = 0;
                        }
                    }
                }
                else {
                    for(int p =0;p< mat[0].length;p++){
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if(mat[p][indexChange]==0) {
                            mat[p][indexChange] = 1;
                        }
                        else{
                            mat[p][indexChange]=0;
                        }
                    }
                }
            }
            else{
                int count = 0;
                if(q[i].charAt(1)=='R') {
                    for (int p = 0; p < mat.length; p++) {
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if (mat[indexChange][p] == 0) {
                            count++;
                        }
                    }
                }
                else{
                    for (int p = 0; p < mat.length; p++) {
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if (mat[p][indexChange] == 0) {
                            count++;
                        }
                    }
                }
                answer[index] = count;
                index++;
            }
        }
        return answer;
	}
}
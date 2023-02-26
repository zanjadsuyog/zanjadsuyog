package ClassSolve;

public class UniqueElemet {

	public static void main(String[] args) {
	
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 1};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                boolean isUnique = true;
                for (int j = i+1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        isUnique = false;
                        visited[j] = true;
                    }
                }
                if (isUnique) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

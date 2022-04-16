package October10;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{12,23,34}};
        System.out.println(searchMatrix(arr,5));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midX = mid / col;
            int midY = mid % col;

            if (matrix[midX][midY] == target) {
                return true;
            } else if (matrix[midX][midY] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}

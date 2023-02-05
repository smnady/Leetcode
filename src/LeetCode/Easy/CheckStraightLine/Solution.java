package LeetCode.Easy.CheckStraightLine;

public class Solution {
    public static boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        double k = 0, x1 = coordinates[0][0], x2 = coordinates[1][0];
        double y1 = coordinates[0][1], y2 = coordinates[1][1];
        boolean flag = true, fl = true;
        for (int i = 0; i < n-1; i++) {
            if (coordinates[i][0]!=coordinates[i+1][0]) flag = false;
            if (coordinates[i][1]!=coordinates[i+1][1]) fl = false;
        }
        if (flag || fl) return true;
        if (x2 != x1) {
            k = (y2 - y1)/(x2 - x1);
        }
        double b = coordinates[0][1] - k*coordinates[0][0];
        for (int i = 0; i < n; i++) {
            double l = coordinates[i][1], x = coordinates[i][0];
            if (l != (k * x + b)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coord = new int[][] {{2, 1}, {4, 2}, {6, 3}};
        System.out.println(checkStraightLine(coord));
    }
}

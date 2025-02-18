import java.util.ArrayList;

public class MazeSolver {
    static int[][] maze = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0}
    };

    static int rows = maze.length;
    static int cols = maze[0].length;

    static class Position {
        int x, y;
        Position(int x, int y) { this.x = x; this.y = y; }
        public String toString() { return "(" + x + "," + y + ")"; }
    }

    public static void main(String[] args) {
        ArrayList<Position> path = new ArrayList<>();
        if (solveMaze(0, 0, path)) {
            System.out.println("Path found:");
            for (Position p : path) {
                System.out.println(p);
            }
        } else {
            System.out.println("No path found.");
        }
    }

    public static boolean solveMaze(int x, int y, ArrayList<Position> path) {
        if (x < 0 || y < 0 || x >= rows || y >= cols || maze[x][y] == 1) {
            return false;
        }
        if (path.contains(new Position(x, y))) {
            return false;
        }
        path.add(new Position(x, y));
        if (x == rows - 1 && y == cols - 1) {
            return true;
        }
        if (solveMaze(x + 1, y, path) || solveMaze(x, y + 1, path) ||
                solveMaze(x - 1, y, path) || solveMaze(x, y - 1, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
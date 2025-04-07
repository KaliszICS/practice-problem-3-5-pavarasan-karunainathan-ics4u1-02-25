public class PracticeProblem{
        static String[][] maze;
        static int paths;
        static int search(int row, int col){
                if(maze[row][col].equals("F")){
                        paths++;
                        return 0;
                }

                int min = maze.length * maze[row].length + 1;
                if(row-1 > -1){
                        int candidate = search(row-1, col);
                        min = candidate < min ? candidate : min;
                }
                if(col+1 < maze[row].length){
                        int candidate = search(row, col+1);
                        min = candidate < min ? candidate : min;
                }
                return min+1;
        }

        static int searchMazeMoves(String[][] arr){
                maze = arr;
                paths = 0;
                return search(arr.length-1, 0);
        }

        static int noOfPaths(String[][] arr){
                maze = arr;
                paths = 0;
                search(arr.length-1, 0);
                return paths;
        }

        public static void main(String args[]){}
}

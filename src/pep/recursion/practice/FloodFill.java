package pep.recursion.practice;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }

     //asf -> answer so far
    public static void floodfill(int[][] maze, int row, int col, String asf, boolean[][] visited) {
        if(row<0||col<0||row== maze.length||col== maze[0].length||maze[row][col]==1 || visited[row][col]==true){
            return;
        }
        if(row==maze.length-1 &&  col==maze[0].length-1){
            System.out.println(asf);
            return;
        }
        visited[row][col]=true;
        /*floodfill(maze, row-1, col, asf+"t", visited);
        floodfill(maze, row, col-1, asf+"l", visited);
        floodfill(maze, row+1, col, asf+"d", visited);
        floodfill(maze, row, col+1, asf+"r", visited);*/
        int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
        String[] dirNames = {"t","l","d","r"};
        for(int i = 0;i<dirNames.length;i++){
            floodfill(maze, row+direction[i][0], col+direction[i][1], asf+dirNames[i], visited);
        }
        visited[row][col]=false;
    }
}

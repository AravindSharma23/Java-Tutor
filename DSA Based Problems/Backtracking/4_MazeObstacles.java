//Maze with Obstacles

public class Main
{
	public static void main(String[] args) {
		boolean[][] board = {
	        {true,true,true},
	        {true,false,true},
	        {true,true,true}
	    };
	   mazeObstacles("",board,0,0);
	}
	static void mazeObstacles(String p ,boolean[][] maze, int r , int c){

	    if(r == maze.length-1 &&  c == maze[0].length-1){
            System.out.println(p);
	        return;
	    }
        if(!maze[r][c]){ // maze[r][c] == false is same as this 
            return;
        }
	    if(r< maze.length-1){
	       mazeObstacles(p+"D",maze,r+1,c);
	    }
	    if(c < maze[0].length-1){
	        mazeObstacles(p+"R",maze,r,c+1);

	    }
	}
}

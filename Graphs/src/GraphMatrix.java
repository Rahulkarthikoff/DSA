import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix{
    int[][] adjMatrix;
    int numVertices;

    public GraphMatrix(int vert)
    {
        adjMatrix = new int[vert][vert];
        numVertices = vert;
    }

    public void addEdge(int src, int dst)
    {
        adjMatrix[src][dst] = 1;
        adjMatrix[dst][src] = 1;
    }

    public void displayGraph()
    {
        for(int i = 0; i<adjMatrix.length;i++)
        {
            for(int j = 0;j<adjMatrix[0].length;j++)
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void bfs(int start)
    {
        // boolean array helps to avoid revisits
        boolean[] visited = new boolean[numVertices];
        //queue help to store vertices
        Queue<Integer> data = new LinkedList<>();

        visited[start] = true;
        data.add(start);

        while(!data.isEmpty())
        {
            int currData = data.poll();
            System.out.print(currData+" --> ");
            for(int i = 0;i<numVertices;i++)
            {
                if(adjMatrix[currData][i] == 1 && !visited[i]){
                    visited[i] = true;
                    data.add(i);
                }

            }
        }
    }

    public static void main(String [] args)
    {
        GraphMatrix graph = new GraphMatrix(7);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,1);
        graph.addEdge(2,6);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(6,3);
        graph.addEdge(6,2);

//        graph.displayGraph();

        graph.bfs(0);
    }
}
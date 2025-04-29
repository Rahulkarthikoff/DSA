public class GraphDFSMatrix {
    int[][] adjMatrix;
    int numVertices;

    GraphDFSMatrix(int num)
    {
        adjMatrix = new int[num][num];
        numVertices = num;
    }


    public void addEdge(int s, int d)
    {
        adjMatrix[s][d] = 1;
        adjMatrix[d][s] = 1;
    }

    public void disp()
    {
        for(int i = 0;i<numVertices;i++)
        {
            for(int j = 0;j<numVertices;j++)
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void dfsS(int start, boolean[] visited)
    {
        visited[start] = true;
        System.out.print(start+"-->");
        for(int i=0;i<adjMatrix.length;i++)
        {
            if(!visited[i] && adjMatrix[start][i] == 1)
            {
                dfsS(i, visited);
            }
        }
    }


    public void dfs(int start)
    {
        boolean[] visited = new boolean[adjMatrix.length];
        dfsS(start, visited);
    }

    public static void main(String[] args) {
        GraphDFSMatrix g = new GraphDFSMatrix(6);

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,5);

        g.disp();

        g.dfs(0);
    }
}

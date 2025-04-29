import java.util.*;
public class GraphBFSList {
    List<List<Integer>> adjList ;
    int numVertices;

    GraphBFSList(int num)
    {
        adjList = new ArrayList<>();
        numVertices = num;
        for(int i=0;i<numVertices;i++)
        {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int desc)
    {
        adjList.get(src).add(desc);
        adjList.get(desc).add(src);
    }

    public void displayAdjList()
    {
        for(int i=0;i<adjList.size();i++){
            System.out.println(adjList.get(i).toString());
        }
    }

    public void bfs(int start)
    {
        boolean [] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        //adjList.get(start);
        queue.add(start);

        while(!queue.isEmpty())
        {
            int val = queue.poll();
            System.out.print(val+" --> ");
            visited[val] = true;
            for(int i=0;i<adjList.get(val).size();i++)
            {
                if(visited[adjList.get(val).get(i)]==false) {
                    queue.add(adjList.get(val).get(i));
                    visited[adjList.get(val).get(i)] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFSList graph = new GraphBFSList(5);

        graph.addEdge(0,1);
//        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
//        graph.addEdge(3,4);

        graph.displayAdjList();
        graph.bfs(0);
    }
}

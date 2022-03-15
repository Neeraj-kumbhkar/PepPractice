package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IsGraphConnected {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<graph.GetConnectedGraph.Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new graph.GetConnectedGraph.Edge(v1, v2, wt));
            graph[v2].add(new graph.GetConnectedGraph.Edge(v2, v1, wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visited = new boolean[vtces];

        // write your code here
        for (int i = 0; i < vtces; i++) {
            ArrayList<Integer> comp = new ArrayList<>();
            if (visited[i] == false) {
                getConnectedComp(graph, i, comp, visited);
                comps.add(comp);
            }
        }
        if (comps.size() > 1) {
            System.out.println("Not connected");
        } else {
            System.out.println("connected");
        }
    }

    public static void getConnectedComp(ArrayList<graph.GetConnectedGraph.Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited) {
        visited[src] = true;
        comp.add(src);
        for (graph.GetConnectedGraph.Edge e : graph[src]) {
            if (!visited[e.nbr]) getConnectedComp(graph, e.nbr, comp, visited);
        }

    }

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
}


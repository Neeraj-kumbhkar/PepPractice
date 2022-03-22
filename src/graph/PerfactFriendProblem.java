package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PerfactFriendProblem {

    public static class Edge{
        int src;
        int nbr;
        public Edge(int src,int nbr){
            this.nbr=nbr;
            this.src = src;
        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int v=0;v<n;v++){
            graph[v]=new ArrayList<>();
        }
        for (int e=0; e<k;e++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]) {
                ArrayList<Integer> comp = new ArrayList<>();
                drawwTreeAcreatComp(graph,i,comp,visited);
                comps.add(comp);
            }

        }
        int pair = 0;
        for (int x = 0;  x<comps.size();x++){
            for(int y = x+1;y<comps.size();y++){
                int z = comps.get(x).size()*comps.get(y).size();
                pair+=z;
            }
        }
        System.out.println(pair);
    }

    private static void drawwTreeAcreatComp(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited) {
        visited[src]=true;
        comp.add(src);
        for(Edge e:graph[src]) if(!visited[e.nbr]) drawwTreeAcreatComp(graph,e.nbr,comp,visited);
    }
}

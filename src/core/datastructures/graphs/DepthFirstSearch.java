package core.datastructures.graphs;

import java.util.Stack;

public class DepthFirstSearch {

   public static void main(String[] args) {
      Graph1 g = new Graph1();
      g.addVertex('A');
      g.addVertex('B');
      g.addVertex('C');
      g.addVertex('D');
      g.addVertex('E');
      g.addVertex('F');

      g.addEdge(0, 1);
      g.addEdge(1, 2);
      g.addEdge(0, 3);
      g.addEdge(3, 4);
      g.addEdge(4, 5);
      g.addEdge(1, 3);

      System.out.println("BFS Visits: ");
      g.dfs();
      System.out.println();
   }
}

class Graph1 {
   private final int MAX_VERTS = 20;

   private int nVerts;

   private Stack<Integer> s;

   private Vertex[] vertexList;

   private int[][] adjMat;

   public Graph1() {
      s = new Stack<>();
      nVerts = 0;
      vertexList = new Vertex[MAX_VERTS];
      adjMat = new int[MAX_VERTS][MAX_VERTS];
   }

   public void addVertex(char a) {
      vertexList[nVerts++] = new Vertex(a);
   }

   public void addEdge(int start, int end) {
      adjMat[start][end] = 1;
      adjMat[end][start] = 1;
   }

   public void dfs() {
      vertexList[0].wasVisited = true;
      displayVertex(0);
      s.push(0);

      while (!s.isEmpty()) {
         int v = getAdjUnvisitedVertex(s.peek());
         if (v == -1) {
            s.pop();
         } else {
            vertexList[v].wasVisited = true;
            displayVertex(v);
            s.push(v);
         }
      }
   }

   private int getAdjUnvisitedVertex(int v) {
      for (int j = 0; j < nVerts; j++) {
         if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
            return j;
         }
      }
      return -1;
   }

   private void displayVertex(int v) {
      System.out.print(vertexList[v].label + " ");
   }
}
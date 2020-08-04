package core.datastructures.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

   public static void main(String[] args) {
      Graph g = new Graph();
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
      g.bfs();
      System.out.println();
   }
}

class Vertex {
   char label;

   boolean wasVisited;

   public Vertex(char label) {
      this.label = label;
      wasVisited = false;
   }
}

class Graph {
   private final int MAX_VERTS = 20;

   private Vertex[] vertexList;

   private int adjMat[][];

   private int nVerts;

   private Queue<Integer> q;

   public Graph() {
      this.vertexList = new Vertex[MAX_VERTS];
      this.adjMat = new int[MAX_VERTS][MAX_VERTS];
      this.nVerts = 0;
      this.q = new LinkedList<>();
   }

   public void addVertex(char val) {
      vertexList[nVerts++] = new Vertex(val);
   }

   public void addEdge(int start, int end) {
      adjMat[start][end] = 1;
      adjMat[end][start] = 1;
   }

   public void displayVertex(int v) {
      System.out.print(vertexList[v].label+" ");
   }

   public void bfs() {
      vertexList[0].wasVisited = true;
      displayVertex(0);
      q.add(0);
      int v2;

      while (!q.isEmpty()) {
         int v1 = q.remove();
         while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
            vertexList[v2].wasVisited = true;
            displayVertex(v2);
            q.add(v2);
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
}
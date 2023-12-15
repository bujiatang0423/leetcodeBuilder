package com.leetcode.leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {

    // 定义图的邻接矩阵
    private int[][] graph;
    private int numVertices;

    public BFSExample(int numVertices) {
        this.numVertices = numVertices;
        this.graph = new int[numVertices][numVertices];
    }

    // 添加边
    public void addEdge(int source, int destination) {
        graph[source][destination] = 1;
        graph[destination][source] = 1; // 无向图，所以需要两个方向都设置
    }

    // 广度优先搜索
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor = 0; neighbor < numVertices; neighbor++) {
                if (graph[currentVertex][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 创建一个包含 6 个节点的图
        BFSExample graph = new BFSExample(6);

        // 添加边
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        // 从节点 0 开始进行广度优先搜索
        System.out.println("BFS starting from vertex 0:");
        graph.bfs(0);
    }
}

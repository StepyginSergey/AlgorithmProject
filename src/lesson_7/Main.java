package lesson_7;

public class Main {
    //1. Реализовать программу, в которой задается граф из 10 вершин.
    // Задать ребра и найти кратчайший путь с помощью поиска в ширину.

    public static void main(String[] args) {
        Graph g = new Graph(13);
        //А позаимствовал граф с уирка и дополнил несколькими вршинами, что бы образовался отдельный граф
        // в виде дерева и имел одно ребро связи с графом с урока.
        g.addEdge(0,6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(5,3);
        g.addEdge(5,4);
        g.addEdge(5,0);
        g.addEdge(4,6);
        g.addEdge(4,3);

        g.addEdge(7,10);
        g.addEdge(10,8);
        g.addEdge(10,9);
        g.addEdge(3,7);

        // и исходя из особенностей такого постороения я провел анализ путей
        // и дистанцй к произволь выбранным вершинам
        BreadthFirstPaths bfs = new BreadthFirstPaths(g, 0);
        System.out.println(bfs.hasPathTo(5));
        System.out.println(bfs.hasPathTo(9));
        System.out.println(bfs.hasPathTo(10));
        System.out.println(bfs.pathTo(5));
        System.out.println(bfs.pathTo(9));
        System.out.println(bfs.pathTo(8));
        System.out.println(bfs.distTo(6));
        System.out.println(bfs.distTo(7));
        System.out.println(bfs.distTo(9));

    }
}

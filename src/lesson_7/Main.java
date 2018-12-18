package lesson_7;

public class Main {
    //1. Реализовать программу, в которой задается граф из 10 вершин. Задать ребра и найти кратчайший путь с помощью поиска в ширину.

    public static void main(String[] args) {
        Graph g = new Graph(13);
        //0 6-1-2-5
        //6 0-4
        //1 0
        //2 0
        //5 3-4-0
        //3 5-4
        //4 5-6-3
        g.addEdge(0,6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(5,3);
        g.addEdge(5,4);
        g.addEdge(5,0);
        g.addEdge(4,6);
        g.addEdge(4,3);

        g.addEdge(7,8);

        g.addEdge(9,10);
        g.addEdge(9,12);
        g.addEdge(9,11);
        g.addEdge(11,12);


        BreadthFirstPaths bfs = new BreadthFirstPaths(g, 0);
        System.out.println(bfs.hasPathTo(5));
        System.out.println(bfs.hasPathTo(12));
        System.out.println(bfs.pathTo(5));
        System.out.println(bfs.distTo(5));
    }
}

package basicGraph;

/**
 *
 * @author Brenda Bojorquez
 */
public class Test {

    public static void main(String[] args) {
        Graph graph=new Graph();
        
        Vertex v1=new Vertex("Brenda");
        Vertex v2=new Vertex("Itzel");
        Vertex v3=new Vertex("Melissa");
        Vertex v4=new Vertex("Diana");
        
        graph.add(v1);
        graph.add(v2);
        graph.add(v3);
        graph.add(v4);
        graph.print();
        
        graph.remove(v2);
        System.out.println("");
        graph.print();
        
        graph.add(v2);
        System.out.println("");
        graph.print();
    }
    
}

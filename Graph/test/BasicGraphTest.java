
import basicGraph.Graph;
import basicGraph.Vertex;
import org.junit.Test;

public class BasicGraphTest {
    private Graph graph;
    
    @Test
    public void testExecute(){
        
        Vertex v1=new Vertex("Brenda");
        Vertex v2=new Vertex("Itzel");
        Vertex v3=new Vertex("Melissa");
        Vertex v4=new Vertex("Diana");
        
        graph.add(v1);
        graph.add(v2);
        graph.add(v3);
        graph.add(v4);
        graph.print();
        
        graph.remove(v3);
        System.out.println("");
        graph.print();
        
        graph.add(v3);
        System.out.println("");
        graph.print();
    }
}

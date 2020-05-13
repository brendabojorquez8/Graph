package basicGraph;

import java.util.ArrayList;

/**
 *
 * @author Brenda Bojorquez
 */
public class Graph {

    private ArrayList<Vertex> graph;

    public Graph() {
        graph = new ArrayList();
    }

    public boolean add(Vertex vertex) {
        if (graph.isEmpty()) {
            return graph.add(vertex);
        }
        
        Vertex ant = graph.get(graph.size() - 1);
        ant.setAfter(vertex);
        vertex.setBefore(ant);
        return graph.add(vertex);
    }
    
    public boolean remove(Vertex vertex){
        if (graph.isEmpty()) {
            return false;
        }
        
        int index=graph.indexOf(vertex);
        
        if(index!=0 && index!=graph.size()-1){
        vertex.getBefore()
                .setAfter(vertex.getAfter());
        vertex.getAfter()
                .setBefore(vertex.getBefore());
        }
        else if(index==0){
            vertex.getAfter().setBefore(vertex.getBefore());
        }
        else{
            vertex.getBefore()
                .setAfter(vertex.getAfter());
        }
        
        if(index>=0 && index<graph.size()){
            return graph.remove(vertex);
        }
        
        return false;
    }
    
    public void print(){
        for (Vertex vertex : graph) {
            System.out.println(vertex);
        }
    }
}

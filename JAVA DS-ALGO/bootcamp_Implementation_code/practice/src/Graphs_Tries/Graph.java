package Graphs_Tries;

import java.util.HashMap;
import java.util.Set;

public class Graph {
    class Vertex{
        String Vertex_name;
        HashMap<Vertex,Integer> neighbours;
        Vertex(String Vertex_name){
            this.Vertex_name=Vertex_name;
            this.neighbours=new HashMap<>();
        }
        public void diplay()
        {
            String str=this.Vertex_name+"-->";
            Set<Vertex> nbrs=this.neighbours.keySet();
            for (Vertex nbr:nbrs){
                 str=str+ nbr.Vertex_name+" ( " +this.neighbours.get(nbr)+")";
        }
            str=str+"END";
            System.out.println(str);

        }

    }
    HashMap<String,Vertex> vertices;
    Graph(){
        this.vertices=new HashMap<>();
    }
    public int numvertices(){
        return this.vertices.size();
    }
    public void add_vertex(String name){
        if (this.vertices.containsKey(name)){
            return;
        }
        Vertex vtx=new Vertex(name);
        this.vertices.put(name,vtx);
    }
}

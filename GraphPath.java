import java.util.*;

public class GraphPath {

    Map<Vertice,Vertice> next;
    Map<Vertice,Integer> value;
    static Graph g = new Graph();

    public boolean buscaLargura(Vertice orig) {

        Queue<Vertice> fila = new LinkedList<>();
        fila.add(orig);

        return false;
    }

    public static boolean isAppointed() {

        boolean res = false;
        int count = 0;

        for(int j=0;j<g.lines.length;j++) {

            Line atual = g.lines[j];
            Vertice org = atual.org;
            Vertice dest = atual.dest;

            for(int i=0;i<g.lines.length;i++) {

                Line temp = g.lines[i];
                Vertice orgT = temp.org;
                Vertice destT = temp.dest;

                if(orgT.getName().equals(dest.getName()) && destT.getName().equals(org.getName())) ++count;

            }
        }

        if(count==g.lines.length) res = true;

        return res;
    }

    public static void main(String[] args) {

        Vertice A = new Vertice("a");
        Vertice B = new Vertice("b");
        Vertice C = new Vertice("c");
        Line ab = new Line(A ,B, 0);
        Line ba = new Line(B, A, 0);
        Line bc = new Line(B, C, 0);
        Line cb = new Line(C, B, 0);

        Vertice[] vertices = {A, B, C};
        Line[] lines = {ab, bc, ba, cb};

        g.vertices = vertices;
        g.lines = lines;
        
        System.out.println(GraphPath.isAppointed());
    }
}

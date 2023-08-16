import java.util.*;

public class GraphPath {

    Map<Vertice,Vertice> next;
    Map<Vertice,Integer> value;
    static Graph g = new Graph();

    public static void buscaLargura(Vertice orig) {

        Queue<Vertice> fila = new LinkedList<>();
        fila.add(orig);

        while(fila.size() > 0) {

            Vertice atual = fila.remove();
            System.out.println("Vertice - " + atual.getNome());

            for(int i=0;i<g.getLines().length;i++) {

                Line aux = g.getLines()[i];
                if(aux.org.getNome().equals(atual.getNome())) fila.add(aux.dest);

            }

        }
    }

        public static void buscaProfundidade(Vertice orig) {

        Stack<Vertice> fila = new Stack<>();
        fila.add(orig);

        while(fila.size() > 0) {

            Vertice atual = fila.pop();
            System.out.println("Vertice - " + atual.getNome());

            for(int i=0;i<g.getLines().length;i++) {

                Line aux = g.getLines()[i];
                if(aux.org.getNome().equals(atual.getNome())) fila.add(aux.dest);

            }

        }
    }

    public static boolean isAppointed() {

        boolean res = false;
        int count = 0;

        for(int j=0;j<g.getLines().length;j++) {

            Line atual = g.getLines()[j];
            Vertice org = atual.org;
            Vertice dest = atual.dest;

            for(int i=0;i<g.getLines().length;i++) {

                Line temp = g.getLines()[i];
                Vertice orgT = temp.org;
                Vertice destT = temp.dest;

                if(orgT.getNome().equals(dest.getNome()) && destT.getNome().equals(org.getNome())) ++count;

            }
        }

        if(count==g.getLines().length) res = true;

        return res;
    }

    public static void main(String[] args) {

        Vertice A = new Vertice("A");
        Vertice B = new Vertice("B");
        Vertice C = new Vertice("C");
        Line ab = new Line(A ,B, 0);
        Line ba = new Line(B, A, 0);
        Line bc = new Line(B, C, 0);
        Line cb = new Line(C, B, 0);

        Vertice[] vertices = {A, B, C};
        Line[] lines = {ab, bc, ba, cb};

        g.setVertices(vertices);
        g.setLines(lines);
        
        System.out.println(GraphPath.isAppointed());
    }
}

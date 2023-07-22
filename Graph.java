public class Graph {

    private Line lines[];
    private Vertice vertices[];

    public void graphInit(int len) {

        lines = new Line[len];

    }

    public Line[] getLines() {
        return this.lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    public Vertice[] getVertices() {
        return this.vertices;
    }

        public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }
}

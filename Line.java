public class Line {

    Vertice org, dest;
    int value = 0;

    public Line(Vertice org, Vertice dest, int value) {
        this.org = org;
        this.dest = dest;
        this.value = value;
    }

    public Line(Vertice org, Vertice dest) {
        this.org = org;
        this.dest = dest;
    }
    
}

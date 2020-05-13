package basicGraph;

import java.util.Objects;

/**
 *
 * @author Brenda Bojorquez
 */
public class Vertex {
    private Vertex before;
    private Vertex after;
    private String value;

    public Vertex(String value) {
        this.value = value;
    }

    public Vertex getBefore() {
        return before;
    }

    public void setBefore(Vertex before) {
        this.before = before;
    }

    public Vertex getAfter() {
        return after;
    }

    public void setAfter(Vertex after) {
        this.after = after;
    }
    
    @Override
    public String toString(){
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertex other = (Vertex) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }
   
}

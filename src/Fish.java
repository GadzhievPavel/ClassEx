import java.io.Serializable;
import java.util.Objects;

public class Fish implements Serializable {
    private String name;
    private double v;
    private  int i;

    private static final long serialVersionUID = 100000;
    public Fish(String name, double v, int i) {
        this.name = name;
        this.v = v;
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name    ='" + name + '\'' +
                ", v=" + v +
                ", i=" + i +
                '}';
    }

    public void test(){}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Double.compare(fish.v, v) == 0 && i == fish.i && serialVersionUID == fish.serialVersionUID && Objects.equals(name, fish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, v, i, serialVersionUID);
    }
}

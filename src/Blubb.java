public class Blubb {
    int size;
    String name;

    public Blubb(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nBlubb{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

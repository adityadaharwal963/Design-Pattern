package Composite_Pattern;

public class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot Support add");
    }

    public FileSystemComponent getChild(int idx) {
        throw new UnsupportedOperationException("Cannot supported");
    }

    public void remove(int idx) {
        throw new UnsupportedOperationException("Bhak sale");
    }

    public void display() {
        System.out.println(getName());
    }
}

package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent{
    private List<FileSystemComponent> children;
    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(int idx) {
        children.remove(idx);
    }

    @Override
    public FileSystemComponent getChild(int idx) {
        return children.get(idx);
    }

    @Override
    public void display() {
        for(FileSystemComponent component : children) {
            System.out.println(component.getName());
        }
    }

}

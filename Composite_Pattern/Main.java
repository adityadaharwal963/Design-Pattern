package Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent root = new Directory("root folder");
        FileSystemComponent folder1 = new Directory("folder 1");
        FileSystemComponent folder2 = new Directory("folder 2");
        FileSystemComponent file1 = new File("file1");
        FileSystemComponent file2 = new File("file2");
        FileSystemComponent file3 = new File("file3");

        root.add(file1);
        root.add(folder1);
        root.add(folder2);
        folder1.add(file2);
        folder1.add(file3);
        /* display file sturcture */
        root.display();
        folder1.display();
        folder2.display();

    }
    
}

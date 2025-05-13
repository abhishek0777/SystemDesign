package lld.designpatterns.compositedesignpattern;

public class File implements FileSystemComponent{
    String name;
    int size;
    File(String name, int size){
        this.name=name;
        this.size=size;
    }

    @Override
    public void display(int depth) {
        System.out.println(".".repeat(2*depth)+"-"+name+" ("+getSize()+" KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}

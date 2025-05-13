package lld.designpatterns.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    String name;
    List<FileSystemComponent> children = new ArrayList<>();
    Directory(String name){
        this.name=name;
    }

    public void add(FileSystemComponent fileSystemComponent){
        children.add(fileSystemComponent);
    }

    @Override
    public void display(int depth) {
        System.out.println(".".repeat(2*depth)+"+"+name+" ("+getSize()+" KB)");
        for(FileSystemComponent component:children){
            component.display(depth+2);
        }
    }

    @Override
    public int getSize() {
        int totalSize=0;
        for(FileSystemComponent component:children){
            totalSize+=component.getSize();
        }
        return totalSize;
    }
}

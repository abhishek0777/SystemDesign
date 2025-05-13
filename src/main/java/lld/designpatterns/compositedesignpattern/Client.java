package lld.designpatterns.compositedesignpattern;

public class Client {
    public static void main(String[] args){
//        FileSystemComponent image1=new File("image1.png",50);
//        FileSystemComponent image2=new File("image2.png",70);
//        FileSystemComponent notes1=new File("science_notes.txt",100);
//        FileSystemComponent notes2=new File("mathematics_notes.txt",150);
//        FileSystemComponent directory1=new Directory("Pictures");
        File image1=new File("image1.png",50);
        File image2=new File("image2.png",70);
        File notes1=new File("science_notes.txt",100);
        File notes2=new File("mathematics_notes.txt",150);
        Directory directory1=new Directory("Pictures");
        directory1.add(image1);
        directory1.add(image2);
        Directory directory2=new Directory("Notes");
        directory2.add(notes1);
        directory2.add(notes2);
        Directory root = new Directory("abvaishn");
        root.add(directory1);
        root.add(directory2);
        root.display(0);
    }
}

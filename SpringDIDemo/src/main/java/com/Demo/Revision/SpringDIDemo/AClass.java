package com.Demo.Revision.SpringDIDemo;

public class AClass {
    int id;
    String name;

    public AClass() {
    }

    public AClass(int id) {
        this.id = id;
    }
    public AClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayhi(){
        System.out.println("my bean AClass instantiated");
    }

    public void sayBye(){
        System.out.println("my bean AClass destructing");
    }
}

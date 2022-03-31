package org.example;

import java.util.List;

public class Lib {
    private int id;
    private String name;
    List<Books> li;

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

    public List<Books> getLi() {
        return li;
    }

    public void setLi(List<Books> li) {
        this.li = li;
    }
}

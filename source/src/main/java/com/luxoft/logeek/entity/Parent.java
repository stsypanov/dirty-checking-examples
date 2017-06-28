package com.luxoft.logeek.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NamedEntityGraphs({
        @NamedEntityGraph(name = Parent.CHILDREN, attributeNodes = {
                @NamedAttributeNode(value = "children")
        })
})
public class Parent {

    public static final String CHILDREN = "Parent[children]";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Child> children;

    public Parent(String name) {
        this.name = name;
    }

    protected Parent() {
    }

    public void addChild(Child child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }
}

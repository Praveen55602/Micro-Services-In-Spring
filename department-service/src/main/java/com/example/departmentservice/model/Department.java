package com.example.departmentservice.model;

/**
 * Department
 */
// for this example we'll not use any db
public class Department {

    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
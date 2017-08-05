package com.coderminion.listviewintroduction.datamodel;

/**
 * Created by phoenix on 5/8/17.
 */

public class DataModelObject {

    String name;
    int resource;

    public DataModelObject(String name, int resource) {
        this.name=name;
        this.resource=resource;

    }

    public String getName() {
        return name;
    }

    public int getResource() {
        return resource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
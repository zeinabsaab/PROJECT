package com.company.project;

/**
 * Created by company on 5/31/2018.
 */

public class Category {
    String category;
    String linkphotos;
    public Category(String category, String linkphotos)
    {
        this.category=category;
        this.linkphotos=linkphotos;
    }
    public Category()
    {

    }
    public Category(String category)
    {
        this.category=category;
    }

    public String getCategory()
    {
        return category;
    }
    public String getLinkphotos()
    {
        return linkphotos;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }
    public void setLinkphotos(String linkphotos)
    {
        this.linkphotos=linkphotos;
    }

}

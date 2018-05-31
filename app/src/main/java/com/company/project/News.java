package com.company.project;

/**
 * Created by company on 5/31/2018.
 */

public class News{
    String title;
    String source;
    String description;
    String attachment;
    String date;
    public News(String title, String source, String description, String attachment, String date)
    {

        this.title=title;
        this.source=source;
        this.description=description;
        this.attachment=attachment;
        this.date=date;

    }
    public News(String title, String source, String description, String date)
    {


        this.title=title;
        this.source=source;
        this.description=description;
        this.date=date;

    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getSource()
    {
        return source;
    }
    public void setSource(String source)
    {
        this.source=source;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public String getDescription()
    {
        return description;
    }

    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {this.date=date;
    }
    public String getAttachment()
    {
        return attachment;
    }
    public void setAttachment(String attachment)
    {
        this.attachment=attachment;
    }

}

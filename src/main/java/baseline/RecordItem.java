/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Adam Farrow
 */
package baseline;

public class RecordItem {
    private String title;
    private String description;
    private String dueDate;
    private boolean complete;
    private boolean inView;
    //defines instance variables
    public RecordItem(String title, String description, String dueDate, boolean complete, boolean inView) {
        // sets instance variables to the method arguments
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.complete = complete;
        this.inView = inView;
    }
    public boolean getInView(){
        //returns inView
        return inView;
    }
    public void setInView(boolean inView) {
        //sets the value of inView
        this.inView = inView;
    }

    public boolean getComplete(){
        //returns complete
        return complete;
    }
    public void setComplete(boolean complete) {
        //sets complete
        this.complete = complete;
    }

    public void setTitle(String title){
        //sets the title
        this.title = title;
    }
    public void setDescription(String description){
        //sets the description
        this.description = description;
    }
    public void setDueDate(String dueDate){
        //sets the due date
        this.dueDate = dueDate;
    }
    public String getTitle() {
        //returns the title
        return title;
    }

    public String getDescription() {
        //returns the description
        return description;
    }
    public String getDueDate(){
        //returns the due date
        return dueDate;
    }
}

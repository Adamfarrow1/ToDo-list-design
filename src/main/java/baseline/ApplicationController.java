/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Adam Farrow
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class ApplicationController {

    //defines a variable to see what is in view in the listView box
    //define gui controls
    public List<ArrayList<RecordItem>> showListSelected(int list,List<ArrayList<RecordItem>> lists){
        //removes what's inside the ListView box currently
        //add the selected list to the listView box
        //sets the value of the ListInView variable to the corresponding List in view
        return lists;
    }
    public List<ArrayList<RecordItem>> addItemToList(String title, String description, String dueDate,List<ArrayList<RecordItem>> lists){
        //checks the user input to see if it is valid
        //if the input is valid it will add the information to the current list
        return lists;
    }
    public List<ArrayList<RecordItem>> editSelectedItem(int itemNo, String change, List<ArrayList<RecordItem>> lists){
        //Checks which part of the item is selected
        //Depending on which item is selected it will make sure the information given is correct
        //If it is correct it will change the current information for that item
        return lists;
    }
    public List<ArrayList<RecordItem>> completeItem(List<ArrayList<RecordItem>> lists, int itemNo){
        //the selected item will have its complete variable set to TRUE
        return lists;
    }
    public List<ArrayList<RecordItem>> removeSelectedItem(int itemNo, List<ArrayList<RecordItem>> lists){
        //removes the current item from the arrayList
        return lists;
    }
    public List<ArrayList<RecordItem>> addList(List<ArrayList<RecordItem>> lists){
        //adds a list to the arrayList
        return lists;
    }
    public List<ArrayList<RecordItem>> deleteSelectedList(List<ArrayList<RecordItem>> lists,int listNo){
        //uses the view variable to determine which List to delete
        //removes the List
        return lists;
    }
    public List<ArrayList<RecordItem>> loadList(List<ArrayList<RecordItem>> lists, String path){
        //checks for a valid path
        //if the path is valid parse through the data
        //add the data to the ArrayList
        //deletes what's inside the List View box and adds the new List
        return lists;
    }
    public String saveList(List<ArrayList<RecordItem>> lists, String path, String fileName){
        //checks to see if the name of the file is valid
        //checks to see if the path is valid
        //if they are both valid then create a file in the path
        //print the data of that List to the file
         //added code so it will compile
        return path;
    }
    public void showComplete(List<ArrayList<RecordItem>> lists){
        //deletes current values inside the ListView Box
        //iterates through the list and finds the which items have complete set to TRUE
        //Adds each of those to the ListView box
    }
    public void showAll(List<ArrayList<RecordItem>> lists){
        //deletes current values inside the ListView Box
        //Adds all the items to the ListView box
    }
    public void showIncomplete(List<ArrayList<RecordItem>> lists){
        //deletes current values inside the ListView Box
        //adds each item that has complete equal to False
    }

    public void initialize(){
        //define array list of array lists to store the Lists and the items within the Lists
        //add listeners to each button and text field
        // calls function based on which button is pressed and adds the text field as the argument if required
    }
}

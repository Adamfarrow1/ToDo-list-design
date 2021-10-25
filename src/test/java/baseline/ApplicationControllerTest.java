package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationControllerTest {

    @Test
    void showListSelected() {
        //check to see if the corresponding Lists inView is set to True
    }

    @Test
    void addItemToList() {
        //create a list with the value already inside it
        //call the function with the values given and check to see if they are equal
    }

    @Test
    void editSelectedItem() {
        //create a list with the desired change already happened
        //create another list with the no change
        //pass the no change list through the function and see if it matches the desired change
    }

    @Test
    void completeItem() {
        //create a List with and without the item already complete
        //put the list without the item complete into the function
        //compare the 2 lists
    }

    @Test
    void removeSelectedItem() {
        //create a list with and without the item already removed
        //put the list without the item removed through the function and see if they are equal
    }

    @Test
    void addList() {
        //create a list with and without the list already made
        //put the list without the new list through the function
        //compare the 2 lists afterwards
    }

    @Test
    void deleteSelectedList() {
        //create a list with and without the list deleted
        //put the list without and anything deleted through the function
        //compare the 2 lists
    }

    @Test
    void loadList() {
        //Create a list with and without the list added
        //put the list without the list added through the function
        //compare to make sure the correct list is added
    }

    @Test
    void saveList() {
        //call the function with the path you want to save to
        //check to see that the file is saved in the correct place with the correct name
    }
}
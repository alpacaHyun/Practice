package practice.silverPark.chapter10.bookshelf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Shelf {

    protected ArrayList<String> shelf;
    public Shelf(){
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }


}


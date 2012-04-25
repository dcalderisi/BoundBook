/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundbook;

import boundbook.attributes.Attribute;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Item {
    private ArrayList<Category> categories;
    private String name;
    private ArrayList<Attribute> attributes;

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

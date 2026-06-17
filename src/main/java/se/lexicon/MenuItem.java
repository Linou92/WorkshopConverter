package se.lexicon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MenuItem {

    private final String name;
    private final Runnable action; // store a piece of code that has no input and no output
    private final List<MenuItem>  children;

    public MenuItem(String name, Runnable action) {
        this.name = name;
        this.action = action;
        this.children = List.of();
    }

    // for a submenu
    public MenuItem(String name, List<MenuItem> children) {
        this.name = name;
        this.action = null;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public List<MenuItem> getChildren() {
        return children;
    }

    public void execute() {
        if(action != null) {
            action.run();
        }
    }
}

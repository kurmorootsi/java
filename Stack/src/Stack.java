import exceptions.StackEmptyException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurmo on 12.10.2016.
 */
public class Stack {
    List<Object> Solid = new ArrayList<>();


    public Stack() {

    }

    public boolean empty() {
        if (Solid.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public Object peek() {
        if (Solid.isEmpty()) throw new StackEmptyException("Stack is empty");
        return Solid.get(Solid.size() - 1);
    }

    public Object pop() {
        if (Solid.isEmpty()) throw new StackEmptyException("Stack is empty");
        return Solid.remove(Solid.size() - 1);
    }

    public Object push(Object E) {
        return Solid.add(E);
    }

}

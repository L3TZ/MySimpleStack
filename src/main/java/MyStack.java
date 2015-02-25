import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21406213 on 25/02/2015.
 */
public class MyStack implements SimpleStack {
    private Stack<Item> pile;

    public MyStack(){
        pile=new Stack<Item>();
    }
    @Override
    public boolean isEmpty() {
        return pile.isEmpty();
    }

    @Override
    public int getSize() {
        return pile.size();
    }

    @Override
    public void push(Item item) {
        pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return pile.pop();
    }
}

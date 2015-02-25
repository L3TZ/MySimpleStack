/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyStack maPile=new MyStack();
        maPile.push(new Item(2));
        System.out.println("taille : "+maPile.getSize());
        maPile.push(new Item(3));
        maPile.peek().setVal(5);
        System.out.println("top : "+maPile.peek().getVal());
        System.out.println("pile vide : "+maPile.isEmpty());
        maPile.pop();
        maPile.pop();
    }
}

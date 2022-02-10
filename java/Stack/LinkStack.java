package Work04;

import Work03.Node;

public class LinkStack implements IStack{
    private Node top;

    public void clear(){
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int length() {
        Node p = top;
        int length = 0;
        while (p!=null){
            p = p.next;
            ++length;
        }
        return length;
    }

    @Override
    public Object peek() {
        if (!isEmpty())
            return top.data;
        else
            return null;
    }

    @Override
    public void push(Object x) throws Exception {
        Node p =new Node(x);
        p.next =top;
        top = p;
    }

    @Override
    public Object pop() {
        if (isEmpty()){
            return null;
        }else{
            Node p = top;
            top = top.next;
            return p.next;
        }

    }

    public void display(){
        Node p = top;
        while (p!=null){
            System.out.print((p.data.toString()+""));
            p = p.next;
        }
    }

    public void niZhi(Object a[])throws Exception{
        for (int i=0;i<a.length;i++)
            push(a[i]);
        for (int i=0;i<a.length;i++)
            a[i] = pop();
    }
}

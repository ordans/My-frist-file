package Work04;
//栈的抽象数据Java接口的描述
public interface IStack {
    public void clear();
    public boolean isEmpty();
    public int length();
    public Object peek();
    public void push(Object x)throws Exception;
    public Object pop();

}

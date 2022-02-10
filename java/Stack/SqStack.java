package Work04;
//写出顺序栈类的java语言描述
public class SqStack implements IStack{
    private Object[] stackElem;//对象数组
    private int top;

    public SqStack(int maxSize){
        top = 0;
        stackElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public Object peek() {
        if (!isEmpty())
        return stackElem[top-1];
        else
            return null;
    }

    @Override
    public void push(Object x) throws Exception {
        if (top == stackElem.length)
            throw new Exception("栈已满");
        else
            stackElem[top++] = x;

    }

    @Override
    public Object pop() {
        if (isEmpty())
        return null;
        else
            return stackElem[--top];
    }

     public void display(){
        for (int i = top-1;i>=0;i--)
            System.out.print(stackElem[i].toString()+"");//输出
     }

     public void niZhi(Object a[])throws Exception{//编写一个函数，要求借助一个栈把一个数组元素逆置
        for (int i=0;i<a.length;i++)
            push(a[i]);

        for (int i = 0;i<a.length;i++)
            a[i] = pop();
     }


}

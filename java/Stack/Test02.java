package Work04;
//编写一个函数，要求借助一个栈把一个数组元素逆置，并测试其正确性。
public class Test02 {

    public static void main(String[] args) throws Exception {

        Object a[] = {1,2,3,4,5};
        SqStack S = new SqStack(100);
        S.niZhi(a);

        for (int i = 0;i<a.length;i++)
            System.out.print(a[i]);
    }
}

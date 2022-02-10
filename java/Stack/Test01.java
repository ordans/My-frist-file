package Work04;
import java.util.Scanner;
//设计一个测试类，测试顺序栈的各成员函数的正确性，使用菜单方式
public class Test01 {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        SqStack S = new SqStack(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您入栈的元素：");
        for (int i = 0; i < 5; i++)
            S.push(sc.nextInt());
        String str[] = {
                "操作选项菜单",
                "1.清空栈",
                "2.判断栈是否为空",
                "3.栈的长度",
                "4.取栈顶元素",
                "5.入栈",
                "6.出栈",
                "7.输出所有栈顶元素",
                "-----------------------------------",
                "作者：杨祖锋               班级：20软工  6 班",
        };
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        while (true) {
            System.out.println("请输入您的选项：");
            int k = sc.nextInt();
            switch (k) {
                case 1:
                    S.clear();
                    System.out.println("栈已经清空：");
                    break;
                case 2:
                    System.out.println("栈是否为空：" + S.isEmpty());
                    break;
                case 3:
                    System.out.println("栈的长度：" + S.length());
                    break;
                case 4:
                    System.out.println("栈顶元素：" + S.peek());
                    break;
                case 5:
                    System.out.println("请输入您的新元素：");
                    S.push(sc.nextInt());
                    System.out.println("新元素入栈成功：");
                    break;
                case 6:
                    System.out.println("出栈元素：" + S.pop());
                    break;
                case 7:
                    S.display();
                    System.out.println();
                    break;
                default:
                    System.out.println("您的选项错误，请重新选择：");
                    break;

            }

        }
    }
}


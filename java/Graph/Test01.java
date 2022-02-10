package Work11;

public class Test01 {
    public static void main(String[] args) throws Exception {
        MGraph p = new MGraph();
        p.createGraph();
        p.linjie();
        System.out.println("D的位置在:"+p.locateVex("D"));
        System.out.println("2位置上的值为:"+p.getVex(2));
        System.out.println("3的第一个邻接点:"+p.firstAdjVex(3));
        System.out.println("4相对于1的邻接点:"+p.nextAdjVex(4,1));
    }

}




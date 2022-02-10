package Work11;

import java.util.Arrays;
import java.util.Scanner;

public class MGraph implements IGraph{
    public final static int INFINITY = Integer.MAX_VALUE;
    private GraphKind kind;
    private int vexNum,arcNum;
    private Object[] vexs;
    private int[][] arcs;
    public MGraph(){
        this(null,0,0,null,null);
    }
    public MGraph(GraphKind kind,int vexNum,int arcNum,Object[] vexs,int[][] arcs){
        this.kind = kind;
        this.vexNum =vexNum;
        this.arcNum =arcNum;
        this.vexs = vexs;
        this.arcs = arcs;
    }


    private void createUDG(){

    }//无向图

    private void createDG(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入图的顶点数,图的边数:");
        vexNum = sc.nextInt();
        arcNum = sc.nextInt();
        vexs = new Object[vexNum];
        System.out.println("请分别输入图的各个顶点:");
        for (int v = 0; v < vexNum; v++)
            vexs[v] = sc.next();

        arcs  = new int[vexNum][vexNum];
        for (int v = 0; v < vexNum; v++)
            for (int u = 0; u < vexNum; u++)
                arcs[v][u] = 0;
        System.out.println("请输入各个边的两个顶点");

        for (int K = 0; K < arcNum; K++) {
            int v = locateVex(sc.next());
            int u = locateVex(sc.next());
            arcs[v][u]= 1;
        }
    }


    private void createUDN(){

    }//无向网

    private void createDN(){

    } //有向网
    public void createGraph(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图的类型");
        GraphKind kind = GraphKind.valueOf(sc.next());
        switch (kind){
            case UDG:
                createUDG();
                return;
            case DG:
                createDG();
                return;
            case UDN:
                createUDN();
                return;
            case DN:
                createDN();
                return;
        }
    }

    @Override
    public int getVexNum() {
        return vexNum;
    }

    @Override
    public int getArcNum() {
        return arcNum;
    }

    public enum GraphKind{
        UDG,
        DG,
        UDN,
        DN;

    }

    @Override
    public int locateVex(Object vex) {
        for (int v = 0;v<vexNum;v++)
            if (vexs[v].equals(vex))
                return v;
            return -1;
    }

    @Override
    public int firstAdjVex(int v) throws Exception{
        if (v<0&&v>= vexNum)
            throw new Exception("第"+v+"个元素不存在！");
        for (int j = 0;j<vexNum;j++)
            if (arcs[v][j] != 0&&arcs[v][j]<INFINITY)
        return j;
            return -1;
    }

    @Override
    public int nextAdjVex(int v, int w) throws Exception{
        if (v<0&&v>vexNum)
            throw new Exception("第"+v+"个顶点不存在！");
        for (int j = w+1;j<vexNum;j++)
            if (arcs[v][j] !=0&&arcs[v][j]<INFINITY)
                return j;
        return -1;
    }

    @Override
    public Object getVex(int v) throws Exception{
        if (v<0&&v>= vexNum)
            throw new Exception("第"+v+"个顶点不存在");
        return vexs[v];
    }

    public GraphKind getKind(){
        return kind;
    }

    public int[][] getArcs() {
        return arcs;
    }

    public Object[] getVexs() {
        return vexs;
    }

    public void linjie(){
        System.out.print("邻接矩阵的顶点元素为:");
        System.out.println( Arrays.toString(vexs));
        System.out.println("输出的邻接矩阵为:");
        for (int v = 0; v < vexNum; v++) {
            for (int u = 0; u < vexNum; u++) {
                System.out.print(arcs[v][u]+" ");
            }
            System.out.println();
        }
    }

}

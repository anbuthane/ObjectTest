package in.frontlinetech;

public class Product {
    int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Product() {

    }

    public Product(int pid, String pname, float pcp, float psp, int pqty) {
        this.pid = pid;
        this.pname = pname;
        this.pcp = pcp;
        this.psp = psp;
        this.pqty = pqty;
    }

    @Override
    public String toString() {
        return "Product " +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", pcp=" + pcp +
                ", psp=" + psp +
                ", pqty=" + pqty ;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPcp(float pcp) {
        this.pcp = pcp;
    }

    public void setPsp(float psp) {
        this.psp = psp;
    }

    public void setPqty(int pqty) {
        this.pqty = pqty;
    }

    String pname;
    float pcp;

    public float getPsp() {
        return psp;
    }

    float psp;
    int pqty;
}

package Classes;

import java.util.ArrayList;

public class Shop {
    private ArrayList<String> pc = new ArrayList<>();

    public Shop(){}
    public void addPC(String p){this.pc.add(p);}
    public boolean delPC(String c){return this.pc.remove(c);}
    public int searchPC(String pc){return this.pc.indexOf(pc) + 1;}
    public String toString(){
        return "Shop{" + pc + "}";
    }
}

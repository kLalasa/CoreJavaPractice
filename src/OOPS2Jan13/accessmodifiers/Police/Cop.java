package OOPS2Jan13.accessmodifiers.Police;

import java.awt.image.ShortLookupTable;

public class Cop {
    public int gun;
    public Cop(int gun){
        this.gun=gun;
    }
    protected void canIshoot(){
        System.out.println("Of course , Shoot");
    }
}

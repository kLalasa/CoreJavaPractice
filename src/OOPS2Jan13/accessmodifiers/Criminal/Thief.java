package OOPS2Jan13.accessmodifiers.Criminal;

import OOPS2Jan13.accessmodifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop=new Cop(20);
        System.out.println(cop.gun);
        //cop.canIshoot();
        //He is not in protected Police folder
    }
}

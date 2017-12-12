package jp.ac.uryukyu.ie.e175747;

public class Hero extends LivingThing {

    public Hero (String name, int hitpoint, int attack) {
        super(name, hitpoint, attack);
    }


    public void wounded(int damage){
        setHitPoint(damage);
        if(getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
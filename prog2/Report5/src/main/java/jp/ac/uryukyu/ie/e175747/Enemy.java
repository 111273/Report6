package jp.ac.uryukyu.ie.e175747;

public class Enemy extends LivingThing {

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    public void attack(LivingThing opponent){
        if(isDead() == false){
            int damage = (int) (Math.random() * getAttack());
            int cri = (int)(Math.random() * 10);
            if(damage==0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n",getName(),opponent.getName());
            }else if(cri<=2){
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
                opponent.wounded(damage);
            }
        }
    }


    public void wounded(int damage){
        setHitPoint(damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}
package jp.ac.uryukyu.ie.e175747;



public class Hero extends LivingThing {

    public Hero (String name, int hitpoint, int attack) {
        super(name, hitpoint, attack);
    }

    @Override
    public void wounded(int damage){
        setHitPoint(damage);
        if(getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
   public void attack(LivingThing opponent){
        if( isDead()== false){
            int damage = (int)(Math.random() * getAttack());
            int cri = (int)(Math.random() * 10);
            if(damage==0){
                System.out.printf("%s攻撃！,,,だが、%sは攻撃を回避した！\n",getName(), opponent.getName());
            }else if(cri<=3){
                damage*=2;
                System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n",getName(), opponent.getName(), damage);
            }else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
            }
        }
   }
}
public class Hero extends CharacterGame{
    protected int nbSkill;
    boolean beat = false;

    Hero(){
        this.hp = 5;
        this.name = "hero";
        this.mana = 10;

    }

    void setHp(int dmg){
        this.hp = this.hp - dmg;
        if (this.hp < 0){
            this.hp = 0;
            this.beat = true;
        }
    }

}

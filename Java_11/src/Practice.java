//아래의 GreenOrc 클래스와 NPCSystem, UserSystem인터페이스를 이용하여
//orkNPC1 orkUser1 클래스를 만들어라

abstract class GreenOrc {
    public final String SKIN_COLOR = "GREEN";
    public int health;
    public int attackDamage;
    public int defense;

    public abstract void setHealth();
    public abstract void setDamage();
    public abstract void setDefense();
}

interface NPCSystem {
    public abstract void conversationSystem();
    public abstract void questionSystem();
}

interface UserSystem {
    public abstract void partySystem();
    public abstract void tradeSystem();
}

//OrkNpc1
class OrkNpc1 extends GreenOrc implements NPCSystem {

    @Override
    public void setHealth() {
        this.health = 100;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 10;
    }

    @Override
    public void setDefense() {
        this.defense = 5;
    }

    @Override
    public void conversationSystem() {
        System.out.println("안녕");
        System.out.println("새로운 소식 없나?");
    }

    @Override
    public void questionSystem() {
        System.out.println("퀘스트");
        System.out.println("완료");
    }
}


//OrkUser1
class OrkUser1 extends GreenOrc implements UserSystem {

    @Override
    public void setHealth() {
        this.health = 500;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 20;
    }

    @Override
    public void setDefense() {
        this.defense = 10;
    }

    @Override
    public void partySystem() {
        System.out.println("파티초대");
        System.out.println("파티수락");
    }

    @Override
    public void tradeSystem() {
        System.out.println("거래 신청");
        System.out.println("거래 완료");
    }
}


public class Practice {
    public static void main(String[] args) {

    }
}

package java2work1;

public class Robot implements Actions {
    private String name;
    private int maxRunDist;
    private int maxSwimDist;
    private int maxJumpDist;

    Robot(String name , int maxRunDist , int maxJumpDist , int maxSwimDist){
        this.name=name;
        this.maxRunDist=maxRunDist;
        this.maxSwimDist=maxSwimDist;
        this.maxJumpDist=maxJumpDist;
    }

    @Override
    public void run(int treadmill) {
        System.out.println("Робот "+name + " пробежал "+treadmill);
    }

    @Override
    public void jump(int wall) {
        System.out.println("Робот "+name + " перепрыгнул "+wall);
    }

    @Override
    public int getMaxRun() {
        return maxRunDist;
    }

    @Override
    public int getMaxJump() {
        return maxJumpDist;
    }

    @Override
    public int getMaxSwim() {
        return maxSwimDist;
    }

    @Override
    public void cantRun(int treadmill) {
        System.out.println("Робот "+name + " не смог пробежать "+treadmill);
    }

    @Override
    public void cantJump(int wall) {
        System.out.println("Робот "+name + " не смог перепрыгнуть "+wall);
    }

    @Override
    public void cantSwim(int pool) {
        System.out.println("Робот "+name + " не смог проплыть "+pool);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim(int pool) {
        System.out.println("Робот "+name + " проплыл "+pool);
    }
}

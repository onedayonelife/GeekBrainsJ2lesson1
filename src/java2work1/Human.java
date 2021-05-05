package java2work1;

public class Human implements Actions {
    private String name;
    private int maxRunDist;
    private int maxJumpDist;
    private int maxSwimDist;

    public Human(String name, int maxRunDist, int maxJumpDist,int maxSwimDistance) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
        this.maxSwimDist = maxSwimDistance;
    }

    @Override
    public  void run(int treadmill) {
        System.out.println(" Человек "+name + " пробежал "+treadmill);
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
    public void jump(int wall) {
        System.out.println("Человек "+name + " перепрыгнул "+wall);
    }

    @Override
    public void cantRun(int treadmill) {
        System.out.println("Человек "+name + "не смог пробежать" + treadmill);
    }

    @Override
    public void cantJump(int wall) {
        System.out.println("Человек "+name + "не смог перепрыгнуть" + wall);
    }

    @Override
    public void cantSwim(int pool) {
        System.out.println("Человек "+name + "не смог проплыть" + pool);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim(int pool) {
        System.out.println(" Человек "+name + " переплыл "+pool);
    }




}

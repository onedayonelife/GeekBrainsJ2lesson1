package java2work1;

public interface Actions {
    void run(int treadmill);
    void jump(int wall);
    void swim(int pool);
    String getName();

    void cantRun(int treadmill);
    void cantJump(int wall);
    void cantSwim(int pool);

    int getMaxRun();
    int getMaxJump();
    int getMaxSwim();

}

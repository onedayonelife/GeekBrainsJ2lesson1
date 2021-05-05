package java2work1;

public interface Obstacle {
    int getMaxRun();
    int getMaxJump();
    int getMaxSwim();
    boolean move(Actions actions,int distanceRun,int distanceJump,int distanceSwim);
    void setMaxActions(int maxRunDist , int maxJumpDist , int maxSwimDist);
}

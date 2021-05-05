package java2work1;

public class Treadmill implements Obstacle {
    private int maxRun;
    private int maxJump;
    private int maxSwim;


    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxSwim() {
        return maxSwim;
    }

    @Override
    public void setMaxActions(int maxRunDist, int maxJumpDist, int maxSwimDist) {
        this.maxRun=maxRunDist;
        this.maxJump=maxJumpDist;
        this.maxSwim=maxSwimDist;
    }

    public boolean move(Actions actions,int distanceRun,int distanceJump,int distanceSwim){
        if(actions.getMaxRun()>=maxRun){
            actions.run(distanceRun);
            return true;
        }else {
            actions.cantRun(distanceRun);
            return false;
        }
    }
}

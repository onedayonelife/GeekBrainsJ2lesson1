package java2work1;

public class Pool implements Obstacle {

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
    public boolean move(Actions actions,int distanceRun,int distanceJump,int distanceSwim){
        if(actions.getMaxSwim()>=maxSwim){
            actions.swim(distanceSwim);
            return true;
        }else {
            actions.cantSwim(distanceSwim);
            return false;
        }
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

}

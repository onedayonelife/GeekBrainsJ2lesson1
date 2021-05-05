package java2work1;

public class Wall implements Obstacle{
    private int maxRun;
    private int maxJump;
    private int maxSwim;


    @Override
    public boolean move(Actions actions,int distanceRun,int distanceJump,int distanceSwim){
        if(actions.getMaxJump()>=maxJump){
            actions.jump(distanceJump);
            return true;
        }else {
            actions.cantJump(distanceJump);
            return false;
        }
    }

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
    public void setMaxActions(int maxRun , int maxJump , int maxSwim) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }
}

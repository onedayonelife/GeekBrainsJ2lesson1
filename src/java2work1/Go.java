package java2work1;

import java.util.Random;

public class Go {

    public static void competitions() {


        Random random = new Random();

        Actions[] actions = new Actions[3];
        actions[0] = new Human("Man", 2000, 2, 50);
        actions[1] = new Cat("Cat", 1000, 4, 0);
        actions[2] = new Robot("Bot", 7000, 15, 200);

        Obstacle[] obstacles = new Obstacle[6];
        obstacles[0] = new Treadmill();
        obstacles[1] = new Wall();
        obstacles[2] = new Pool();
        obstacles[3] = new Treadmill();
        obstacles[4] = new Wall();
        obstacles[5] = new Pool();

        int distanceRun = random.nextInt(2000);
        int distanceJump = random.nextInt(4);
        int distanceSwim = random.nextInt(50);

        for (int i = 0; i < actions.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].setMaxActions(distanceRun,distanceJump,distanceSwim);
                if(!obstacles[j].move(actions[i],distanceRun,distanceJump,distanceSwim)){
                    System.out.println(actions[i].getName()+" снят с соревнований ");
                    break;
                };
            }
        }
    }
}

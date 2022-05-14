import java.util.Random;

public class Snake extends Obstacle{

    public Snake(){
        super(4,"Yılan",0,12,0);
        this.setDamage(randomDamage());
    }
    public int randomDamage(){
        Random r=new Random();
        return r.nextInt(4)+2;
    }
}

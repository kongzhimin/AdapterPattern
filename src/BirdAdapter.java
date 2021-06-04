public class BirdAdapter extends Bird implements Robot{
    public void cry(){
        System.out.println("机器人模仿：");
        super.tweedle();
    }
    public void move(){
        System.out.println("机器人模仿：");
        super.fly();
    }
}

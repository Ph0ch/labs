package lab7;

public class main {
    public static void main(String[] args){
        Dish plate = new Plate(1,10);
        Dish pan = new Pan(20,100);
        plate.calcVolume();
        ((Pan)pan).makeBorsh();

        System.out.println("________________________________");

        Dog bulldog = new Bulldog(35,20,"Bulldoger","Bulldog");
        bulldog.calcFatty();
        Dog chihuahua = new Сhihuahua(15,2,"Small creepy thing","Сhihuahua");
        chihuahua.calcFatty();

    }
}
package lab8;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Furniture table = new Table(2,5, 0,"Table");
        System.out.println(table.hollowCalc());
        Furniture wardrobe = new Wardrobe(5,3, 1,"Wardrobe");
        System.out.println(wardrobe.hollowCalc());
    }
}

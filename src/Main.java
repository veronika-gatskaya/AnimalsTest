import com.godeltech.core.model.Bear;
import com.godeltech.core.model.Cat;
import com.godeltech.core.model.Snake;
import com.godeltech.core.service.AnimalService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("AIVI", 5.3, 20, "white", "15sm");
        Bear bear = new Bear("Misha", 200.5, 15, "brown");
        Snake snake = new Snake("Ksusha", 49.5, 70, 170.2);

        System.out.println("Select animal. 1 - cat, 2 - bear, 3 - snake");
        Scanner in = new Scanner(System.in);
        byte point = in.nextByte();
        switch (point) {
            case 1:
                AnimalService.outputData(cat);
                break;

            case 2:
                AnimalService.outputData(bear);
                break;

            case 3:
                AnimalService.outputData(snake);
                break;

            default:
                System.out.println("Error");

        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> underControl = new ArrayList<>();

        System.out.println("введмте ваше имя и фамилию");
        String fi = scanner.nextLine();
        if (BlackList.EXTREMS.getList().contains(fi) || BlackList.TERRORS.getList().contains(fi)){
            System.out.println("вы заблокированы");
        } else if (BlackList.SKAMERS.getList().contains(fi)) {
            System.out.println("вы добавлены в список наблюдаемый пользователей");
            underControl.add(fi);
            System.out.println(underControl);

        } else {
            System.out.println("welcome!");
    }
}
}
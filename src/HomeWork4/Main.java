package HomeWork4;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        Scripts.addStartData();
        while (flag) {
            System.out.println("1. Добавить телефон\n" +
                    "- удалять телефон\n" +
                    "- находить по логину телефон/список телефонов");
            switch (Scripts.inputTask()){
                case 1:
                    Scripts.addPhone();
                    break;
                case 2:
                    Scripts.delPhone();
                    break;
                case 3:
                    Scripts.findByLogin();
                    break;
                case 0:
                    flag = false;
                    System.out.println("До скорых встреч!");
                    break;
                default:
                    System.out.println("Такой задачи нет.");
            }
        }
    }
}

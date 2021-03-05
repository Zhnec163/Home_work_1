import model.Kotik;

public class Application {

    public static void main(String[] args) {

        Kotik cat_1 = new Kotik(5,"Бакс", 7, "Meow");
        Kotik cat_2 = new Kotik();
        cat_2.liveAnotherDay();
        System.out.println(cat_2.getKoticInfo());

        if(cat_1.getMeow().equals(cat_2.getMeow())){
            System.out.println("\nМяукают похоже");
        } else {
            System.out.println("\nМяукают по разному");
        }

        System.out.println("\nКотов: " + Kotik.numberCats);
    }
}

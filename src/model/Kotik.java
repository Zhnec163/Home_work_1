package model;

public class Kotik {

    private int satiety = 10;
    private String lastMeal;
    private String meow;
    private int prettiness;
    private String name;
    private int weight;

    public static int numberCats;

    public boolean sleep(){
        if(satiety > 0){
            System.out.println("Котэ лег спать");
            satiety -= 5;
            return true;
        } else {
            System.out.println("Котэ хочет кушать!");
            return false;
        }
    }
    public boolean play(){
        if(satiety > 0){
            System.out.println("Котэ начал играть");
            satiety -= 3;
            return true;
        } else {
            System.out.println("Котэ хочет кушать!");
            return false;
        }
    }
    public boolean chaseMouse(){
        if(satiety > 0){
            System.out.println("Котэ бегает за мышью");
            satiety -= 3;
            return true;
        } else {
            System.out.println("Котэ хочет кушать!");
            return false;
        }
    }
    public boolean walk(){
        if(satiety > 0){
            System.out.println("Котэ ушел гулять");
            satiety -= 7;
            return true;
        } else {
            System.out.println("Котэ хочет кушать!");
            return false;
        }
    }
    public boolean jumping(){
        if(satiety > 0){
            System.out.println("Котэ начал прыгать");
            satiety -= 3;
            return true;
        } else {
            System.out.println("Котэ хочет кушать!");
            return false;
        }
    }
    public void eat(int satiety){
        this.satiety += satiety;
    }
    public void eat(int satiety, String lastMeal){
        this.satiety += satiety;
        this.lastMeal = lastMeal;
    }
    public void eat(){
        eat(10, "Cats Food");
    }
    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++){
            int rnd = 1 + (int)(Math.random() * 5);
            switch (rnd){
                case 1:
                    if(!sleep()) eat(10, "Cats Food");
                    break;
                case 2:
                    if(!play()) eat(10, "Cats Food");
                    break;
                case 3:
                    if(!chaseMouse()) eat(10, "Cats Food");
                    break;
                case 4:
                    if(!walk()) eat(10, "Cats Food");
                    break;
                case 5:
                    if(!jumping()) eat(10, "Cats Food");
                    break;
            }
        }
    }
    private void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public int getSatiety(){
        return satiety;
    }
    public String getLastMeal(){
        return lastMeal;
    }
    public String getMeow(){
        return meow;
    }
    public int getPrettiness(){
        return prettiness;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public String getKoticInfo(){
        return "\nИмя: " + getName() + "\nВес: " + getWeight();
    }

    public Kotik(int prettiness, String name, int weight, String meow){
        numberCats++;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }
    public Kotik(){
        numberCats++;
        setKotik(7,"Евро", 9, "meow");
    }

}

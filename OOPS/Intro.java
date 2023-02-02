package OOPS;

public class Intro {
    public static void main(String[] args) {



      Country a = new Country(28,"India",156 );
//      a.name="America";
//      a.state=12;
//      a.population=34;
      a.greeting();
        System.out.println(a.name);
        System.out.println(a.state);
        System.out.println(a.population);
    }

}
class Country{
    // The class name should always start with a capital letter
    int state;
    String name;
    int population;


    void greeting (){
        System.out.println("Hello how are you doing all");
    }

    public Country(int state, String name, int population) {
        this.state = state;
        this.name = name;
        this.population = population;
    }
}




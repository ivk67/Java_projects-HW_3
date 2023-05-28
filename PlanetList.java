/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 Вывести название каждой планеты и количество его повторений в списке. Collections.frequency() */
package HW_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlanetList {

    public static void main(String[] args) {
        List<String> planets = new ArrayList<String>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");

        for (String planet : planets) {
            int frequency = Collections.frequency(planets, planet);
            System.out.println(planet + ": " + frequency);
        }
    }
}

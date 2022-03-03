package workspace;

import data.formula.Championship;
import data.formula.Driver;
import data.formula.Engine;
import data.formula.Team;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class ObjectGenerator {

    public static Championship generateChampionship() {
        var ver = createDriver(33, "Max Verstappen", "NED", 23, 396, 25_000_000);
        var per = createDriver(11, "Sergio Perez", "MEX", 31, 190, 8_000_000);
        var redBull = createTeam("RED BULL RACING HONDA", List.of(ver, per), 200_000_000, Engine.HONDA);

        var ham = createDriver(44, "Lewis Hamilton", "GBR", 36, 388, 30_000_000);
        var bot = createDriver(77, "Valtteri Bottas", "FIN", 31, 226, 8_000_000);
        var mercedes = createTeam("MERCEDES", List.of(ham, bot), 200_000_000, Engine.MERCEDES);

        var lec = createDriver(16, "Charles Leclerc", "MON", 23, 159, 12_000_000);
        var snz = createDriver(55, "Carlos Sainz", "ESP", 26, 165, 10_000_000);
        var ferrari = createTeam("FERRARI", List.of(lec, snz), 200_000_000, Engine.FERRARI);

        var nor = createDriver(4, "Lando Norris", "GBR", 21, 160, 5_000_000);
        var ric = createDriver(3, "Daniel Ricciardo", "AUS", 31, 115, 15_000_000);
        var mclaren = createTeam("MCLAREN MERCEDES", List.of(nor, ric), 180_000_000, Engine.MERCEDES);

        var alo = createDriver(14, "Fernando Alonso", "ESP", 39, 81, 20_000_000);
        var okn = createDriver(31, "Esteban Ocon", "FRA", 24, 74, 5_000_000);
        var alpine = createTeam("ALPINE RENAULT", List.of(alo, okn), 160_000_000, Engine.RENAULT);

        var gsl = createDriver(10, "Pierre Gasly", "FRA", 25, 110, 5_000_000);
        var tsu = createDriver(22, "Yuki Tsunoda", "JPN", 21, 32, 500_000);
        var alphaTauri = createTeam("ALPHATAURI HONDA", List.of(gsl, tsu), 140_000_000, Engine.HONDA);

        var vet = createDriver(5, "Sebastian Vettel", "GER", 33, 43, 15_000_000);
        var str = createDriver(18, "Lance Stroll", "CAN", 22, 34, 10_000_000);
        var astonMartin = createTeam("ASTON MARTIN MERCEDES", List.of(vet, str), 150_000_000, Engine.MERCEDES);

        var rus = createDriver(63, "George Russell", "GBR", 23, 16, 1_000_000);
        var lat = createDriver(6, "Nicholas Latifi", "CAN", 25, 7, 1_000_000);
        var williams = createTeam("WILLIAMS MERCEDES", List.of(rus, lat), 120_000_000, Engine.MERCEDES);

        var rai = createDriver(7, "Kimi Räikkönen", "FIN", 41, 10, 10_000_000);
        var gio = createDriver(99, "Antonio Giovinazzi", "ITA", 27, 3, 1_000_000);
        var alfaRomeo = createTeam("ALFA ROMEO RACING FERRARI", List.of(rai, gio), 130_000_000, Engine.FERRARI);

        var maz = createDriver(9, "Nikita Mazepin", "RUS", 22, 0, 1_000_000);
        var sch = createDriver(47, "Mick Schumacher", "CAN", 22, 0, 1_000_000);
        var haas = createTeam("HAAS FERRARI", List.of(maz, sch), 90_000_000, Engine.FERRARI);

        return Championship.builder()
                .teams(List.of(redBull, mercedes, ferrari, mclaren, alpine, alphaTauri,
                        astonMartin, williams, alfaRomeo, haas))
                .build();
    }

    public static Driver createDriver(int number, String name, String nationality,
                                      int age, int points, long salary) {
        return Driver.builder()
                .number(number)
                .name(name)
                .nationality(nationality)
                .age(age)
                .points(points)
                .salary(salary)
                .build();
    }

    public static Team createTeam(String teamName, List<Driver> drivers, long budget, Engine engine) {
        return Team.builder()
                .teamName(teamName)
                .drivers(drivers)
                .budget(budget)
                .engine(engine)
                .build();
    }
}

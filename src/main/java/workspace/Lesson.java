package workspace;

import data.formula.Championship;
import data.formula.Driver;
import data.formula.Team;
import data.formula.Track;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson {

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 11, 28, 35, 90, 111, 54, 3, 17, 42, 53, 100};
        var names = "Ann, John, Billy, Viktor, Shrek, Bob";
        var str1 = new String[]{"lake", "bob", "cat", "madam", "level"};
        var str2 = new String[]{"game", "bob", "cate", "kayak"};
        var championship = ObjectGenerator.generateChampionship();

        System.out.println(getFibonacciSequence());

    }

    public static void printNames(String names) {
        Arrays.stream(names.split(", "))
                .skip(1)
                .forEach(System.out::println);
    }

    public static void generateRandomNumbers() {

        final var randomSeed = new Random();
        IntStream.generate(() -> randomSeed.nextInt(1000))
                .limit(10)
                .forEach(System.out::println);
    }

    //
    public static void printNumbers() {

        IntStream.rangeClosed(0, 20)
                .peek(System.out::println)
                .average()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Something went wrong"));
    }

    //
    public static void printOddNumbers(int[] numbers) {

        Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }

    //
    public static void printUniquePalindroms(String[] arr1, String[] arr2) {

        Stream.of(arr1, arr2)
                .flatMap(Arrays::stream)
                .distinct()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .forEach(System.out::println);
    }

    //
    public static String getDriversChampionshipResults(Championship championship) {

        return championship.getTeams().stream()
                .flatMap(team -> team.getDrivers().stream())
                .sorted(Comparator.comparing(Driver::getPoints).reversed())
                .map(driver -> driver.getName() + " : " + driver.getPoints())
                .collect(Collectors.joining("\n"));


    }
//
    public static List<Team> getConstructorChampionshipResults(Championship championship) {
        return championship.getTeams().stream()
                .sorted(Comparator.comparing(team -> team.getDrivers().stream()
                        .mapToInt(Driver::getPoints)
                        .sum()))
                .toList();
    }
//
    public static long getMaxSalaryDriver(Championship championship) {
        return championship.getTeams().stream()
                .flatMap(team -> team.getDrivers().stream())
                .mapToLong(Driver::getSalary)
                .max()
                .orElse(0L);
    }
//
    public static Driver findAnyDriverFromCountry(String country, Championship championship) {
        return championship.getTeams().stream()
                .flatMap(team -> team.getDrivers().stream())
                .filter(d -> d.getNationality().equals(country))
                .findAny()
                .orElseThrow(() -> new RuntimeException("No driver was found"));
    }
//
    public static Map<String, Long> filterDriversWithSmallSalary(Championship championship) {

        return championship.getTeams().stream()
                .flatMap(team -> team.getDrivers().stream())
                .filter(driver -> driver.getSalary() < 2_000_000)
                .collect(Collectors.toMap(Driver::getName, Driver::getSalary));
//                .collect(Collectors.toMap(Driver::getName, Driver::getSalary, Long::sum, TreeMap::new));
    }
//
    public static Team findAnyTeamWithEqualSalaries(Championship championship) {
        return championship.getTeams().stream()
                .filter(team -> team.getDrivers().stream()
                        .mapToLong(Driver::getSalary)
                        .distinct()
                        .count() == 1)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Nothing found"));

    }
//
    public static String findMostWinsDriver(Championship championship) {
        return championship.getTracks().stream()
                .collect(Collectors.groupingBy(Track::getWinner, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(entry -> entry.getKey().getName() + " won " + entry.getValue() + " times")
                .orElseThrow(() -> new RuntimeException("Sorry you not a winner"));
    }
//
    public static Map<Boolean, List<Driver>> findWinnerAndLosers(Championship championship) {
        var winners = championship.getTracks().stream()
                .map(Track::getWinner)
                .distinct()
                .toList();
        return championship.getTeams().stream()
                .flatMap(team -> team.getDrivers().stream())
                .collect(Collectors.partitioningBy(winners::contains));

    }

    public static String getFibonacciSequence() {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}

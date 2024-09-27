import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    HashMap<String, String> capitalCities = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("countries.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(" ");
                if (parts.length < 2) {
                    System.out.println("Line of text in file incorrect" + line);
                    continue;
                }

                String country = parts[0];
                String capital = line.substring(line.indexOf(' ') + 1);
                capitalCities.put(country, capital);
            }
        } catch (IOException e) {
            System.out.println("Error! Cannot read the file" + e.getMessage());
            return;
        }

        Scanner entrada = new Scanner(System.in);

        System.out.print("Enter your name");

        String username = entrada.nextLine();

        int score = 0;

        List<String> countries = new ArrayList<>(capitalCities.keySet());
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String randomCountry = countries.get(random.nextInt(countries.size()));
            System.out.print("What is the capital of " + randomCountry + "? ");
            String userAnswer = entrada.nextLine();
            if (userAnswer.equalsIgnoreCase(capitalCities.get(randomCountry))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The capital of " + randomCountry + " is " + capitalCities.get(randomCountry));
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            writer.write(username + " - Points: " + score);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file " + e.getMessage());
        }

        System.out.println("Congratulations! You scored " + score + " points!");
    }
}

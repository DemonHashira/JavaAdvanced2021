package task;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/world?" +
                            "user=root&password=OmaeWaMouShindeiruNaniAAAA");


            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT country.Name as Country, city.name as City, city.Population as Population, countrylanguage.Language as Language\n" +
                    "FROM world.city\n" +
                    "JOIN world.country on world.city.CountryCode=world.country.Code\n" +
                    "JOIN world.countrylanguage on world.countrylanguage.CountryCode=world.country.Code\n" +
                    "WHERE city.Population > 1000000");


            HashSet<CityClass> listOfCity = new HashSet<>();
            List<String> listOfLanguages = new ArrayList<>();
            while (rs.next()) {
                CityClass cityToAdd= new CityClass(rs.getString("City"),
                        rs.getString("Country"),
                        rs.getLong("Population"),
                        rs.getString("Language"));
                listOfCity.add(cityToAdd);
                listOfLanguages.add(rs.getString("Language"));

            }

            System.out.println(listOfCity);
            System.out.println(listOfCity.size());
            System.out.println(listOfLanguages);
            System.out.println(listOfLanguages.size());

            String mostRepeatedWord
                    = listOfLanguages.stream()
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .get()
                    .getKey();
            System.out.println(mostRepeatedWord);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignored) {
                }
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignored) {
                }
                stmt = null;
            }
            try {
                assert conn != null;
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

            rs = stmt.executeQuery("SELECT country.name AS Country , " +
                    "city.name as city, " +
                    "city.Population as Population " +
                    "FROM world.city " +
                    "JOIN world.country on world.city.CountryCode=world.country.Code " +
                    "WHERE city.Population > 1000000;");


            List<CityClass> listOfCity = new ArrayList<>();

            while (rs.next()) {
                CityClass cityToAdd= new CityClass(rs.getString("city"),
                        rs.getString("country"),
                        rs.getLong("Population"));
                        listOfCity.add(cityToAdd);
            }

            System.out.println(listOfCity);
            System.out.println(listOfCity.size());

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
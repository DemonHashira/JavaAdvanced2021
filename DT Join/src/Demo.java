import java.sql.*;

public class Demo {

    public static void main(String[] args) {

            Connection conn = null;
            Statement stmt = null;
            Statement statement = null;
            ResultSet rs = null;
            ResultSet resultSet = null;

            try {
                conn =
                        DriverManager.getConnection("jdbc:mysql://localhost/world?" +
                                "user=root&password=OmaeWaMouShindeiruNaniAAAA");

                // Do something with the Connection


                // assume that conn is an already created JDBC connection (see previous examples)


                stmt = conn.createStatement();
                statement = conn.createStatement();

                // or alternatively, if you don't know ahead of time that
                // the query will be a SELECT...

                if (stmt.execute("SELECT * FROM city where Name='Varna'") && statement.execute("SELECT * FROM country where Name='Bulgaria'")) {
                    rs = stmt.getResultSet();
                    resultSet = statement.getResultSet();
                }

                while (true) {
                    assert rs != null;
                    if (!rs.next()) break;
                    System.out.println(rs.getString("name"));
                }

                while (true) {
                    assert resultSet != null;
                    if (!resultSet.next()) break;
                    System.out.println(resultSet.getString("name"));
                }

                // Now do something with the ResultSet ....
            } catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                // it is a good idea to release
                // resources in a finally{} block
                // in reverse-order of their creation
                // if they are no-longer needed

                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException ignored) {
                    } // ignore

                    rs = null;
                }

                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException ignored) {
                    } // ignore

                    resultSet = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException ignored) {
                    } // ignore

                    stmt = null;
                }

                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ignored) {
                    } // ignore

                    statement = null;
                }
            }
    }
}

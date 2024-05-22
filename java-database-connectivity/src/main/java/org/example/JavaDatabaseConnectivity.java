package org.example;

import java.sql.*;

public class JavaDatabaseConnectivity {
    public static void main(String[] args) throws SQLException {
        /* Создание связи с базой данных через DriverManager */
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres_test",
                "postgres", "password");

        /* Создание Statement и выполнение SQL-запроса */
        Statement statement = connection.createStatement();
        statement.execute("insert into users (id, name) values (1, 'name1')");

        /* Создание PreparedStatement и подготовление динамического SQL-запроса */
        PreparedStatement insertStatement = connection.prepareStatement("insert into users (id, name) values (?, ?)");
        insertStatement.setInt(1, 2);
        insertStatement.setString(2, "name2");
        insertStatement.execute();

        PreparedStatement deleteStatement = connection.prepareStatement("delete from users where id=?");
        deleteStatement.setInt(1, 2);
        deleteStatement.execute();

        PreparedStatement selectStatement = connection.prepareStatement(("select * from users"));
        ResultSet resultSet = selectStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
        }

        connection.close();
    }
}

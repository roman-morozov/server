package dbService.dao;

import dbService.dataSets.UserDataSet;
import dbService.executor.Executor;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 21990 on 19.09.2016.
 */
/*public class JDBCUsersDAO {
    private Executor executor;

    public JDBCUsersDAO(Connection connection) {
        this.executor = new Executor(connection);
    }

    public UserDataSet get(long id) throws SQLException {
        return executor.execQuery("SELECT * FROM USERS WHERE id=" + id, resultSet -> {
            resultSet.next();
            return new UserDataSet(resultSet.getLong(1), resultSet.getString(2));
        });
    }

    public long getUserId(String name) throws SQLException {
        return executor.execQuery("SELECT * FROM USERS WHERE user_name='" + name + "'", resultSet -> {
            resultSet.next();
            return resultSet.getLong(1);
        });
    }

    public void insertUser(String name) throws SQLException {
        executor.execUpdate("INSERT INTO users (user_name) VALUES ('" + name + "')");
    }

    public void createTable() throws SQLException {
        executor.execUpdate("CREATE TABLE IF NOT EXISTS users (id BIGINT AUTO_INCREMENT, user_name VARCHAR(256), PRIMARY KEY (id)) ");
    }

    public void dropTable() throws SQLException {
        executor.execUpdate("DROP TABLE users");
    }
}*/

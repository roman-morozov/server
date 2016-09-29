package dbService.executor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 21990 on 19.09.2016.
 */
public interface ResultHandler<T> {
    T handle(ResultSet resultSet) throws SQLException;
}

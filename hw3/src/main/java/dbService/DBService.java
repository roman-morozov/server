package dbService;

import dbService.dataSets.UserDataSet;

/**
 * Created by 21990 on 19.09.2016.
 */
public interface DBService {

    long addUser(String login, String password) throws DBException;

    UserDataSet getUser(String login) throws DBException;

    UserDataSet getUser(long id) throws  DBException;
}

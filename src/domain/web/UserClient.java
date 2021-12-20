package domain.web;

import domain.UserInfo;
import domain.dao.UserInfoDao;
import domain.dao.mysql.UserInfoMysqlDao;
import domain.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/domain/db/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("test");
        userInfo.setPassword("asdasd");


        UserInfoDao userInfoDao = null;

        if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }else if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else {
            System.out.println("DB Not Supported");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}

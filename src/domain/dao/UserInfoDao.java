package domain.dao;

import domain.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

    default void defaultMethod(){
        privateMethod();
        privateStaticMethod();
    }

    static void staticMethod(){
        privateStaticMethod();
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }

    private static void privateStaticMethod(){
        System.out.println("Private Static Method");
    }
}

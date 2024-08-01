package dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import dao.CrudUtil;
import dao.custom.UserDao;
import entity.UserEntity;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM user WHERE UserID = ?", id);
    }

    @Override
    public UserEntity get(String id) throws Exception {
        ResultSet result  = CrudUtil.executeQuery("SELECT * FROM user WHERE UserID = ?", id);
        
        if (result.next()) {
            UserEntity userEntity = new UserEntity(
                result.getString("UserID"), 
                result.getString("UserName"), 
                result.getString("UserTitle"), 
                result.getString("UserDOB"), 
                result.getString("UserAddress"), 
                result.getString("UserContact"));

            return userEntity;
        }
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        ArrayList<UserEntity> userEntities = new ArrayList<>();

        ResultSet result = CrudUtil.executeQuery("SELECT * FROM user");

        while (result.next()) {
            UserEntity userEntity = new UserEntity(
                result.getString("UserID"), 
                result.getString("UserName"), 
                result.getString("UserTitle"), 
                result.getString("UserDOB"), 
                result.getString("UserAddress"), 
                result.getString("UserContact"));

            userEntities.add(userEntity);
        }
        
        return userEntities;
    }

    @Override
    public boolean save(UserEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO user VALUES(?,?,?,?,?,?)", t.getUserID(),t.getUserName(),t.getUserTitle(),t.getUserDOB(),t.getUserAddress(),t.getUserContact());
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE user SET UserID = ?, UserName = ?, UserTitle = ?, UserDOB = ?, UserAddress = ?, UserContact = ?, ", t.getUserID(),t.getUserName(),t.getUserTitle(),t.getUserDOB(),t.getUserAddress(),t.getUserContact());
    }
    
}

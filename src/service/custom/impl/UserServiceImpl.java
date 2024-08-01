package service.custom.impl;

import java.util.ArrayList;

import dao.DaoFactory;
import dao.custom.UserDao;
import dto.UserDto;
import entity.UserEntity;
import service.custom.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.USER);

    @Override
    public String delete(String userID) throws Exception {
        return userDao.delete(userID) ? "Success" : "Fail";
    }

    @Override
    public UserDto get(String userID) throws Exception {
        UserEntity userEntity = userDao.get(userID);
        if (userEntity != null) {
            return getUserDto(userEntity);
        }
        return null;
    }

    @Override
    public ArrayList<UserDto> getAll() throws Exception {
        ArrayList<UserEntity> userEntities = userDao.getAll();
        if (userEntities != null && !userEntities.isEmpty()) {
            ArrayList<UserDto> userDtos = new ArrayList<>();

            for (UserEntity userEntity : userEntities) {
                userDtos.add(getUserDto(userEntity));
            }

            return userDtos;
        }
        return null;
    }

    @Override
    public String save(UserDto userDto) throws Exception {
        UserEntity userEntity = getUserEntity(userDto);
        return userDao.save(userEntity) ? "Successfully created your account" : "Couldn't create the account";
    }

    @Override
    public String update(UserDto userDto) throws Exception {
        UserEntity userEntity = getUserEntity(userDto);
        return userDao.update(userEntity) ? "Successfully updated" : "Couldn't update the details";
    }

    private UserEntity getUserEntity(UserDto userDto){
       return new UserEntity(
            userDto.getUserID(),
            userDto.getUserName(), 
            userDto.getUserTitle(), 
            userDto.getUserDOB(), 
            userDto.getUserAddress(), 
            userDto.getUserContact());
    }

    private UserDto getUserDto(UserEntity userEntity){
        return new UserDto(
             userEntity.getUserID(),
             userEntity.getUserName(), 
             userEntity.getUserTitle(), 
             userEntity.getUserDOB(), 
             userEntity.getUserAddress(), 
             userEntity.getUserContact());
     }
    
    
}

package controller;

import java.util.ArrayList;

import dto.UserDto;
import service.ServiceFactory;
import service.custom.UserService;

public class UserController {

    private UserService userService = (UserService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String save(UserDto userDto) throws Exception{
        return userService.save(userDto);
    }

    public String update(UserDto userDto) throws Exception{
        return userService.update(userDto);
    }

    public String delete(String userID) throws Exception{
        return userService.delete(userID);
    }

    public ArrayList<UserDto> getAll() throws Exception{
        return userService.getAll();
    }

    public UserDto get(String userID) throws Exception{
        return userService.get(userID);
    }
}

package service.custom;

import java.util.ArrayList;

import dto.UserDto;
import service.SuperService;

public interface UserService extends SuperService {
    String save(UserDto userDto) throws Exception;
    String update(UserDto userDto) throws Exception;
    String delete(String userID) throws Exception;
    UserDto get(String userID) throws Exception;
    ArrayList<UserDto> getAll() throws Exception;
}

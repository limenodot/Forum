package milandr.courseproject.services;

import milandr.courseproject.daos.UserDao;
import milandr.courseproject.dtos.UserDto;
import milandr.courseproject.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDto getUser(Long userId) {
        User user = userDao.findOne(userId);
        return buildUserDtoFromUser(user);
    }

    public UserDto buildUserDtoFromUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setAvatar(user.getAvatar());

        return userDto;
    }
}

package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User findById(int id);

    List<User> listUsers();
}

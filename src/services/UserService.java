package services;

import dao.UserDao;
import model.Clients;
import model.Users;

import javax.persistence.Persistence;
import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserService(){
        try{
            userDao = new UserDao(Persistence.createEntityManagerFactory("proiectdb"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addUser(Users users){
        userDao.create(users);
    }

    public Users findUser(String username) throws Exception{
        List<Users> userList = userDao.find(username);
        if (userList.size() == 0)
            throw new Exception("User not found");
        return userList.get(0);
    }

    public List<Users> getAllUsers(){
        return userDao.findAll();
    }
}

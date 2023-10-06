package org.example.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.User;
import org.springframework.stereotype.Component;

@Component

public class UserDaoService {
    private static int userCount = 0;
    private static List<User> users = new ArrayList<>();
    static{
        users.add(new User(++userCount,"ajay", LocalDate.now().minusYears(35)));
        users.add(new User(++userCount,"Rakesh", LocalDate.now().minusYears(30)));
        users.add( new User(++userCount,"Dinesh", LocalDate.now().minusYears(33)));
    }
    public List<User> findAll(){
        return users;
    }
    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public User saveUser(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}

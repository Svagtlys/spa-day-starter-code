package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    public static Map<Integer, User> users = new HashMap<>();

    public static Collection<User> getAll(){
        return users.values();
    }

    public static User getById(Integer id){
        return users.get(id);
    }

    public static void add(User user){
        users.put(user.getId(), user);
    }

}

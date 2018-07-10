package com.agenda.Util;

import com.agenda.Dao.UserDao;
import com.agenda.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    UserDao userDao = new UserDao();
    User user = new User();
    List<User> userList = new ArrayList<User>();


    /**
     * throws an exception if user paseed as parametter has an invalid format
     * @param user
     * @throws UserException
     */

    public void validateUserMail(User user) throws UserException {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = user.getEmail();

        Matcher mather = pattern.matcher(email);

        if (mather.find() != true) {
            throw new UserException("Wrong format E-mail");
        }

    }// end of validateUser







    /**
     *  return true if user passed as parametter exist en database
     * @param user
     * @return boolean
     */

    public boolean userExist(User user) {

        userList = userDao.getEntityList(User.class);

        for (User u : userList) {

            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {

                return true;

            }
        }

        return false;


    }// end of userExist






    /**
     * throws an exception if user passed as parametter doesn't exist
     * @param user
     * @throws UserException
     */


    public void validateUserExist(User user) throws UserException {
        if (!userExist(user)) {

            throw new UserException("User Doesn't exist");

        }

    } //end off validateUserExtist







    /**
     *
     * @param userName
     * @param pass
     * @return User with the spicified username & and pass
     * If doesn't exist throws an UserException
     * @throws UserException
     */

    public User ValidateUsername(String userName, String pass) throws UserException {

        User user= null;

        userList = userDao.getEntityList(User.class);

        for(User u : userList){

            if (u.getUsername().equals(userName)&& u.getPassword().equals(pass)){

                user = u;

            }
            }
        if(user == null){

            throw new UserException("User Doesn't exist");
        }

        return user;

        } // end of validateUsername




}
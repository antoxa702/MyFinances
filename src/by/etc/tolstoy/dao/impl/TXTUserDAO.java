package by.etc.tolstoy.dao.impl;

import by.etc.tolstoy.dao.UserDAO;
import by.etc.tolstoy.exception.dao.DAOCantCreateFileException;
import by.etc.tolstoy.exception.dao.DAOUserRegistrationException;
import by.etc.tolstoy.exception.dao.DAOUserSignInException;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Home on 20.01.2020.
 */
public class TXTUserDAO implements UserDAO {
    public static final String REGISTERED_USERS_FILE_PATH = "C:\\Users\\Home\\IdeaProjects\\MyFinances\\target\\MyFinances\\RegistredUsers.txt";

    @Override
    public void signIn(String login, String password) throws DAOUserSignInException {
        File file = new File(REGISTERED_USERS_FILE_PATH);
        if (file.isFile()) {
            FileReader reader = null;
            try {
                int count = 0;
                reader = new FileReader(file);
                Scanner sc = new Scanner (reader);
                while (sc.hasNextLine()) {
                    String[] registeredUser = sc.nextLine().split("\\s+");
                    if (registeredUser[0].equals(login) && registeredUser[1].equals(password)) {
                        count ++;
                        break;
                    }
                }

                if (count == 0) {
                    throw new DAOUserSignInException("You are not registered");
                }
            } catch (FileNotFoundException e) {
                throw new DAOUserSignInException();
            }
        }
    }

    @Override
    public void registration(String login, String password) throws DAOUserRegistrationException, DAOCantCreateFileException {
        File file = new File(REGISTERED_USERS_FILE_PATH);
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new DAOCantCreateFileException("can't create file", e);
            }
        }
        FileReader reader = null;
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            reader = new FileReader(file);
            Scanner sc = new Scanner (reader);
            int count = 0;
            while (sc.hasNextLine()) {
                String[] registeredUser = sc.nextLine().split("\\s+");
                if (registeredUser[0].equals(login)) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                writer.write("\n" + login + " " + password);
                writer.flush();
            } else {
                throw new DAOUserRegistrationException("we have such user");
            }
        } catch (IOException e) {
            throw new DAOUserRegistrationException("can't write to file", e);
        }
    }
}

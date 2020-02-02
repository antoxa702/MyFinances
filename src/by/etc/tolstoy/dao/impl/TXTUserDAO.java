package by.etc.tolstoy.dao.impl;

import by.etc.tolstoy.bean.User;
import by.etc.tolstoy.dao.UserDAO;
import by.etc.tolstoy.dao.exception.DAOCantCreateFileException;
import by.etc.tolstoy.dao.exception.DAOUserException;
import by.etc.tolstoy.dao.exception.DAOUserRegistrationException;
import by.etc.tolstoy.dao.exception.DAOUserSignInException;
import by.etc.tolstoy.service.exception.ServiceClientException;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Home on 20.01.2020.
 */
public class TXTUserDAO implements UserDAO {
    @Override
    public void signIn(String login, String password) throws DAOUserSignInException {
        File file = new File("C:\\Users\\Home\\IdeaProjects\\MyFinances\\target\\MyFinances\\RegistredUsers.txt");
        if (file.isFile()) {
            FileReader reader = null;
            try {
                int count = 0;
                reader = new FileReader(file);
                Scanner sc = new Scanner (reader);
                while (sc.hasNextLine()) {
                    String[] registeredUser = sc.nextLine().split("\\s+");
                    if (registeredUser[0].equals(login) && registeredUser[1].equals(password)) {
                        System.out.println("YES MOTHER FUCKER");
                        count ++;
                        break;
                    }
                }

                if (count == 0) {
                    throw new DAOUserSignInException("You are not registred");
                }
            } catch (FileNotFoundException e) {
                throw new DAOUserSignInException();
            }
        }
    }

    @Override
    public void registration(String login, String password) throws DAOUserRegistrationException, DAOCantCreateFileException {
        File file = new File("C:\\Users\\Home\\IdeaProjects\\MyFinances\\target\\MyFinances\\RegistredUsers.txt");
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

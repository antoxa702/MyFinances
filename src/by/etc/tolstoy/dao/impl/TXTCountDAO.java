package by.etc.tolstoy.dao.impl;

import by.etc.tolstoy.bean.TransactionSingleton;
import by.etc.tolstoy.dao.CountDAO;
import by.etc.tolstoy.dao.exception.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Home on 20.01.2020.
 */
public class TXTCountDAO implements CountDAO {
    @Override
    public void addCount(String countName, String balance) throws DAOCountException, DAOCantCreateFileException, DAOCountAddCountException {
        File file = new File("C:\\Users\\Home\\IdeaProjects\\MyFinances\\target\\MyFinances\\Counts.txt");
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new DAOCantCreateFileException("can't create Counts file", e);
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
                String[] counts = sc.nextLine().split("\\s+");
                if (counts[0].equals(countName)) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                writer.write(countName + " " + balance + "\n");
                writer.flush();
            } else {
                throw new DAOCountAddCountException("we have such count");
            }
        } catch (IOException e) {
            throw new DAOCountAddCountException("can't create count", e);
        }

    }

    @Override
    public void addTransaction(String countName, String type, String money) throws DAOCountException, DAOCantCreateFileException, DAOCountAddTransactionException, DAOFileNotFoundException {
        File file = new File("C:\\Users\\Home\\IdeaProjects\\MyFinances\\target\\MyFinances\\Transactions.txt");
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new DAOCantCreateFileException("can't create Transaction file", e);
            }
        }

        File fileCounts = new File("C:\\Users\\Home\\IdeaProjects\\MyFinances\\target\\MyFinances\\Counts.txt") ;
        if (!fileCounts.isFile()) {
            throw new DAOFileNotFoundException("can't find Counts file");
        }
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(fileCounts);
            Scanner sc = new Scanner (reader);
            int count = 0;
            while (sc.hasNextLine()) {
                String[] counts = sc.nextLine().split("\\s+");
                if (counts[0].equals(countName)) {
                    count++;
                    break;
                }
            }

            if (count > 0) {
                writer = new FileWriter(file, true);
                writer.write(countName + " " + type + " " + money + "\n");
                writer.flush();
            } else {
                throw new NoSuchCountException("there is no such count");
            }

        } catch (IOException e) {
            throw new DAOCountAddTransactionException("can't create Transaction", e);
        } catch (NoSuchCountException e) {
            throw new DAOCountAddTransactionException("can't create Transaction : there is no such count", e);
        }
    }
}

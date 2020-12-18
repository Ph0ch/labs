package org.example;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {

        CsvToBean csv = new CsvToBean();
//        String csvFilename = "src/main/resources/final_transaction_table.csv";
        String csvFilename = "src/main/resources/CSV.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ';');
        //Set column mapping strategy
        List<Transaction> list = csv.parse(setColumnMapping(), csvReader);

        System.out.println("Все транзакции: ");
        for (Transaction transaction : list) {
            System.out.println(transaction);
        }
        double expenses = 0.0;
        double income = 0.0;

        for (Transaction transaction : list) {
            if (transaction.amount < 0.0)
                expenses += transaction.amount;
            else
                income += transaction.amount;

        }
        System.out.println("Расходы: " + expenses);
        System.out.println("Доходы: " + income);
    }

    private static ColumnPositionMappingStrategy setColumnMapping() {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Transaction.class);
        String[] columns = new String[]{"organization", "amount"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}


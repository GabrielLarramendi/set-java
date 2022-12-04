package model.services;

import model.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class FileService {

    public static Set<LogEntry> readFileReturnSet(String path) {

        Set<LogEntry> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
            while (line != null) {
                String[] splitLine = line.split(" ");
                String username = splitLine[0];
                LocalDateTime moment = LocalDateTime.parse(splitLine[1], dtf);

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.getMessage();
        }

        return set;
    }
}

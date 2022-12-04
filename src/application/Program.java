package application;

import model.services.FileService;

public class Program {
    public static void main(String[] args) {

        System.out.println("Total Users: " + FileService.readFileReturnSet
                ("/home/larramendi/IdeaProjects/set/src/application/LogEntry.txt").size());
    }
}

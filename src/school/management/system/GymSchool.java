package school.management.system;

import java.util.List;


public class GymSchool {

    private List<Trainer> trainers;
    private List<Client> clients;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    public GymSchool(List<Trainer> trainers, List<Client> clients) {
        this.trainers = trainers;
        this.clients = clients;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Trainer> getTeachers() {
        return trainers;
    }

    public void addTeacher(Trainer trainer) {
        trainers.add(trainer);
    }

    public List<Client> getStudents() {
        return clients;
    }

    public void addStudent(Client client) {
        clients.add(client);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}

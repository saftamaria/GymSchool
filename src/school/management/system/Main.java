package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Trainer lizzy = new Trainer(1,"Lizzy",500);
        Trainer mellisa = new Trainer(2,"Mellisa",700);
        Trainer vanderhorn = new Trainer(3,"Vanderhorn",600);
        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(lizzy);
        trainerList.add(mellisa);
        trainerList.add(vanderhorn);


        Client tamasha = new Client(1,"Tamasha",4);
        Client rakshith = new Client(2,"Rakshith Vasudev",12);
        Client rabbi = new Client(3,"Rabbi",5);
        List<Client> clientList = new ArrayList<>();
        clientList.add(tamasha);
        clientList.add(rabbi);
        clientList.add(rakshith);


        GymSchool ghs = new GymSchool(trainerList, clientList);
        Trainer megan = new Trainer(6,"Megan", 900);
        ghs.addTeacher(megan);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}

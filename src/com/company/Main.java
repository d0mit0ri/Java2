package com.company;

import com.company.comands.CSKA;
import com.company.comands.Dinamo;
import com.company.obstacles.*;

public class Main {

    public static void main(String[] args) {

        Course c = new Course(
                new Cross(21),
                new Wall(3),
                new Water(10)); // Создаем полосу препятствий
        Team team1 = new Team("CSKA",
                new CSKA("Саша", 10, 12, 8),
                new CSKA("Вася", 9, 14, 10));
        Team team2 = new Team("Dinamo",
                new Dinamo("Никита", 20, 5, 15),
                new Dinamo("Вася", 20, 5, 15));
        // Создаем команду
        team1.getTeamInfo();
        team2.getTeamInfo();

        c.doIt(team1);               // Просим команду пройти полосу
        team1.showResults();        // Показываем результаты
        c.doIt(team2);               // Просим команду пройти полосу
        team2.showResults();

    }
}

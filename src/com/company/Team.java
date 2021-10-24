package com.company;

import com.company.comands.CSKA;
import com.company.comands.Dinamo;
import com.company.obstacles.Obstacle;

public class Team {
        private final String name;// название команды
        private Participant[] participants;    // участники

        public Team(String name) {
            this.name = name;
        }

        public Team(String name,Participant ... participantsGiven ) {
            this.name = name;
            this.participants = participantsGiven;
        }

        public void getTeamInfo() {
            System.out.println("Команда: " + this.name );
            for (Participant participant : participants) {
                if (participant instanceof Dinamo) {
                    System.out.println("Dinamo " + participant.getName());
                }
                if (participant instanceof CSKA) {
                    System.out.println("CSKA " + participant.getName());
                }
            }
        }

        public void showResults(){
            for (Participant participant : participants) {
                //obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
        public void doIt(Obstacle obstacle){
            for (Participant participant : participants) {
                obstacle.doIt(participant);
            /*if (!participant.isOnDistance()) {
                break;
            }*/
            }
        }



    }



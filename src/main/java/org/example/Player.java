package org.example;

public class Player {

    private String login;
    private int experience;
    private int level;

        // создание конструктора
        public Player(String login) {
            this.login = login;
            this.experience = 0; //инизиализация полей
            this.level = 1;
        }

        //создание метода для принятия количества опыта
            public void addExperience(int amount) {
                if (amount > 0) {
                    experience += amount;
                } else if (amount <= 0) {
                    return;
                }
            }

            //создание метода для возврата текущего количества опыта
            public int getExperience() {
            return experience;
        }

            public String getLogin() { //метод возврата логина
            return login;
            }
}

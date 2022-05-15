package ru.netology.javaqa;

public class BonusService {
    public int calculate(int amount, boolean isRegistered) {
        int percent = isRegistered ? 3 : 1;
        int bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = 500;
        }
        return bonus;
    }

}

package ru.netology.javaqa;

public class MathService {
    public int crazyCount(int limit) {
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            if (i * 13 < limit) {
                count++;
            }
        }
        return count;
    }
}


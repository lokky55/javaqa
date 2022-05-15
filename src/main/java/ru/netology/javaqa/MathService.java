package ru.netology.javaqa;

public class MathService {
    public int crazyCount(int limit) {
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (i * 13 < limit) {
                count++;
            }
        }
        return count; // Это сервис, а сервис всегда отдает значение через return
    }
}


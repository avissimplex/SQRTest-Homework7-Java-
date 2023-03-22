package ru.netology.sqr;

public class SQRService {
    public int calculate(int start, int finish) {
        int square = 0;
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            square = i * i;
            if (square >= start && square <= finish) {
                count++;
            }
        }
        return count;
    }

}

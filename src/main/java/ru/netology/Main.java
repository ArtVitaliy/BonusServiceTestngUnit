package ru.netology;

import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();

        System.out.println(service.remain(100));

    }
}

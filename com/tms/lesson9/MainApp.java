package com.tms.lesson9;

import com.tms.lesson9.domain.User;
import com.tms.lesson9.service.impl.*;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Your name is: ");

        String name = sc.nextLine();

        System.out.println("Your balance is: ");

        int wallet = sc.nextInt();

        User user = new User(name, wallet);

        System.out.println("In the game a player " + user.getUserName() + " with a balance of " + user.getBalance() + " rub");

        BetServiceImpl betService = new BetServiceImpl();

        GamePlayServiceImpl gamePlayService = new GamePlayServiceImpl(betService);

        gamePlayService.gamePlay(user);

    }
}

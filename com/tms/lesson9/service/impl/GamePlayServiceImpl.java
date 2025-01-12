package com.tms.lesson9.service.impl;

import com.tms.lesson9.domain.User;
import com.tms.lesson9.exc.BasicBetExceptions;
import com.tms.lesson9.service.BetService;
import com.tms.lesson9.service.GamePlayService;

import java.util.Scanner;

public class GamePlayServiceImpl implements GamePlayService {

    private BetService betService;

    public GamePlayServiceImpl(BetService betService) {
        this.betService = betService;
    }


    Scanner sc = new Scanner(System.in);

    @Override
    public void gamePlay(User user) {
        while (user.getBalance() > 0) {
            System.out.println("Your bet is: ");
            int bet = (sc.nextInt());
            if (betService.validate(user, bet) == true) {
                System.out.println("Your bet was accepted");
            } else {
                continue;
            }
            System.out.println("Select number from 0 to 5");
            int value = (sc.nextInt());
            if (value == -1) {
                System.out.println("See you later!");
                break;
            }
            try {
                betService.play(value);
            } catch (BasicBetExceptions exc) {
                System.out.println(exc.getMessage());
                continue;
            }
            if (betService.play(value) == true) {
                System.out.println("You've won");
            }
            if (betService.play(value) == false) {
                System.out.println("You've lost");
            }
            boolean result = betService.play(value);
            int bal = betService.change(user, bet, result);
            user = new User(user.getUserName(), bal);

            if (user.getBalance() <= 0) {
                System.out.println("Your balance is 0. Game over.");
                break;
            }
        }
    }
}


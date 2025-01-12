package com.tms.lesson9.service.impl;

import com.tms.lesson9.exc.BasicBetExceptions;
import com.tms.lesson9.service.BetService;
import com.tms.lesson9.domain.User;

import java.util.Random;

public class BetServiceImpl implements BetService {

    @Override
    public boolean validate(User user, int bet) {
        if (bet <= user.getBalance() && bet <= 100) {
            return true;
        } else if (bet > 100) {
            System.out.println("Your bet can't be more 100 rub");
            return false;
        } else if (bet > user.getBalance()) {
            System.out.println("Your bet is more than your balance");
            return false;
        }
        return false;
    }

    @Override
    public boolean play(int value) {
        int val2 = new Random().nextInt(0, 5);
        if (value < -1 || value > 5) {
            throw new BasicBetExceptions("You should choose value from 0 to 5");
        }
        if (value != val2) {
            return false;
        }
        if (value == val2) {
            return true;
        }
        return false;
    }

    @Override
    public int change(User user, int bet, boolean result) {
        int bal = user.getBalance();
        if (result == true) {
            bal += bet;
            System.out.println("Balance of user " + user.getUserName() + " increases by " + bet + " and is " + bal);
        } else if (result == false) {
            bal -= bet;
            System.out.println("Balance of user " + user.getUserName() + " decreases by " + bet + " and is " + bal);
        }
        return bal;
    }

}

package com.tms.lesson9.service;

import com.tms.lesson9.domain.User;

public interface BetService {

    boolean validate(User user, int bet);

    int change(User user, int bet, boolean result);

    boolean play(int val);


}

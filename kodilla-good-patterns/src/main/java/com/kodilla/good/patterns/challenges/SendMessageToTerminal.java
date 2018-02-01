package com.kodilla.good.patterns.challenges;

public class SendMessageToTerminal implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("You borrowed our product. Thank you Mr/Mrs. " + user.getName() + " " + user.getSurname());
    }
}

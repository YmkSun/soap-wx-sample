package com.soap.wx.service;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.wx.model.Score;

@Stateless
@WebService
public class ScoreService {
    
    private static Score score = new Score();
    
    public Score getScore() {
        return score;
    }

    public int increaseWins() {
        return ++score.wins;
    }

    public int increaseLosses() {
        return ++score.losses;
    }

    public int increaseTies() {
        return ++score.ties;
    }

    public int getWins() {
        return score.wins;
    }

    public int getLosses() {
        return score.losses;
    }

    public int getTies() {
        return score.ties;
    }

    public Score updateScore(int wins, int losses, int ties) {
        score.wins = wins;
        score.losses = losses;
        score.ties = ties;
        return score;
    }

    @WebMethod(operationName="resetScore")
    public void reset() {
        score.wins = 0;
        score.losses = 0;
        score.ties = 0;
    }
}

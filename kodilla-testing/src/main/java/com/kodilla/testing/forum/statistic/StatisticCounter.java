package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticCounter {
    Statistic statistic;
    int postsQuantity;
    int usersQuantity;
    int commentsQuantity;
    double avPostsPerUser;
    double avCommentsPerUser;
    double avCommentsPerPost;

    public StatisticCounter(Statistic statistic) {
        this.statistic = statistic;
    }

    public void calculateAdvStatistics(){
        //Users Quantity
        ArrayList<String> usersList = statistic.usersNames();
        usersQuantity = usersList.size();
        //Comments Quantity
        commentsQuantity = statistic.commentsCount();
        //Posts Quantity
        postsQuantity = statistic.postsCount();
        //Rest
        if(usersQuantity!=0) {
            avPostsPerUser = postsQuantity / usersQuantity;
            avCommentsPerUser = commentsQuantity / usersQuantity;
        } else {avPostsPerUser = 0;
                avCommentsPerUser = 0;}
         if(postsQuantity!=0){
             avCommentsPerPost = commentsQuantity / postsQuantity;
         } else avCommentsPerPost = 0;
    }

    public void showStatistics(){
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Average number of posts per user: " + avPostsPerUser);
        System.out.println("Average number of comments per user: " + avCommentsPerUser);
        System.out.println("Average number of comments per post: " + avCommentsPerPost);
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }
}

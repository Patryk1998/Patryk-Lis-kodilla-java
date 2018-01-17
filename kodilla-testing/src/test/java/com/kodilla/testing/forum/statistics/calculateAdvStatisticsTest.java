package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.Statistic;
import com.kodilla.testing.forum.statistic.StatisticCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class calculateAdvStatisticsTest {
    @Test
    public void calculateAdvStatisticsTest1() {
        System.out.println("liczba postów = 0");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + i);
        }
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(0);
        when(statistic.commentsCount()).thenReturn(1000);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(100, test.getUsersQuantity());
        Assert.assertEquals(0, test.getPostsQuantity());
        Assert.assertEquals(1000, test.getCommentsQuantity());

    }

    @Test
    public void calculateAdvStatisticsTest2() {
        System.out.println("liczba postów = 1000");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + i);
        }
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(1000);
        when(statistic.commentsCount()).thenReturn(3000);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(100, test.getUsersQuantity());
        Assert.assertEquals(1000, test.getPostsQuantity());
        Assert.assertEquals(3000, test.getCommentsQuantity());
    }

    @Test
    public void calculateAdvStatisticsTest3() {
        System.out.println("liczba komentarzy = 0");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + i);
        }
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(1000);
        when(statistic.commentsCount()).thenReturn(0);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(100, test.getUsersQuantity());
        Assert.assertEquals(1000, test.getPostsQuantity());
        Assert.assertEquals(0, test.getCommentsQuantity());
    }

    @Test
    public void calculateAdvStatisticsTest4() {
        System.out.println("liczba komentarzy < liczba postów");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + i);
        }
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(4000);
        when(statistic.commentsCount()).thenReturn(1000);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(100, test.getUsersQuantity());
        Assert.assertEquals(4000, test.getPostsQuantity());
        Assert.assertEquals(1000, test.getCommentsQuantity());
    }

    @Test
    public void calculateAdvStatisticsTest5() {
        System.out.println("liczba komentarzy > liczba postów");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + i);
        }
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(500);
        when(statistic.commentsCount()).thenReturn(1000);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(100, test.getUsersQuantity());
        Assert.assertEquals(500, test.getPostsQuantity());
        Assert.assertEquals(1000, test.getCommentsQuantity());
    }

    @Test
    public void calculateAdvStatisticsTest6() {
        System.out.println("liczba użytkowników = 0");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(3400);
        when(statistic.commentsCount()).thenReturn(1000);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(0, test.getUsersQuantity());
        Assert.assertEquals(3400, test.getPostsQuantity());
        Assert.assertEquals(1000, test.getCommentsQuantity());
    }

    @Test
    public void calculateAdvStatisticsTest7() {
        System.out.println("liczba użytkowników = 100");
        //Given
        Statistic statistic = mock(Statistic.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User #" + i);
        }
        when(statistic.usersNames()).thenReturn(users);
        when(statistic.postsCount()).thenReturn(2000);
        when(statistic.commentsCount()).thenReturn(1000);
        //Then
        StatisticCounter test = new StatisticCounter(statistic);
        test.calculateAdvStatistics();
        test.showStatistics();
        //Then
        Assert.assertEquals(100, test.getUsersQuantity());
        Assert.assertEquals(2000, test.getPostsQuantity());
        Assert.assertEquals(1000, test.getCommentsQuantity());
    }

}
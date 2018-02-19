package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");
        //When
        //Then
        Assert.assertEquals("Shared on Facebook!", user1.sharePost());
        Assert.assertEquals("Shared on Twitter!", user2.sharePost());
        Assert.assertEquals("Shared on Snapchat!", user3.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new ZGeneration("User1");
        //When
        user1.setSocialPublisher(new TwitterPublisher());
        //Then
        Assert.assertEquals("Shared on Twitter!", user1.sharePost());
    }
}

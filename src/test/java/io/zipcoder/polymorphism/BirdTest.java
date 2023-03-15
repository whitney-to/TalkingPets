package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {
    @Test
    public void testSpeak() {
        Bird birdy = new Bird (null);

        String testBark = birdy.speak();
        String bark = "Bark!";

        Assert.assertEquals(bark, testBark);
    }

    @Test
    public void testConstructor() {
        String expectedName = "Birdney";
        Bird bird = new Bird(expectedName);

        String actualName = bird.getName();

        Assert.assertEquals(expectedName, actualName);
    }

}
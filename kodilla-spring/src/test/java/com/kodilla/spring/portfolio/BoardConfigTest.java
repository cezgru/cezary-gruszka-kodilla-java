package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class BoardConfigTest {

    @Test
    public void getBoard() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("asdf");
        board.getInProgressList().getTasks().add("asdf");
        board.getInProgressList().getTasks().add("asdf");
        board.getToDoList().getTasks().add("asdf");
        board.getToDoList().getTasks().add("asdf");
        board.getToDoList().getTasks().add("asdf");

        //Then
        Assert.assertEquals(1,board.getDoneList().getTasks().size());
        Assert.assertEquals(2,board.getInProgressList().getTasks().size());
        Assert.assertEquals(3,board.getToDoList().getTasks().size());

        //do nothing
    }
}
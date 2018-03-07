package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.KodillaHibernateApplication;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList testList = new TaskList("Test List", "Description1");
        taskListDao.save(testList);

        //When
        String listName = testList.getListName();
        List<TaskList> test = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, test.size());
        //ClenUp
        int id = testList.getId();
        taskListDao.delete(id);
    }
}

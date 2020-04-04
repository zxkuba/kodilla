package com.kodilla.hibernate.tasklist;

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
    private static final String DESCRIPTION = "testuje";

    @Test

    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Jakub", DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //When
        List<TaskList> result = taskListDao.findByListName(name);
        //Then
        Assert.assertEquals(1, result.size());

        //CleanUp
        int id = result.get(0).getId();
        taskListDao.deleteById(id);
    }

}
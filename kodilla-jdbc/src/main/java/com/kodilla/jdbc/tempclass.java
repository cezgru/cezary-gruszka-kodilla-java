package com.kodilla.jdbc;

public class tempclass {
    /*
    public class TaskList {
    private int id;
    private String listName;
    private String description;


    public TaskList() {
    }

    public TaskList(int id, String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "LIST_NAME")
    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

}


@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);

    @RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: task 13.2";

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        TaskList taskList = new TaskList(1, "LIST1", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        //int id = readTasks.get(0).getId();
        //taskListDao.delete(id);
    }
}


}

     */
}

package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("dunno", "also dunno", 3);
            case PAINTING:
                return new PaintingTask("really though", "green maybe", "don't care");
            case DRIVING:
                return new DrivingTask("initial d", "not here", "gas, gas, gas!");
            default:
                return null;
        }
    }
}

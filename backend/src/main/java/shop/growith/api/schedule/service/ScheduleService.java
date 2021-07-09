package shop.growith.api.schedule.service;

public interface ScheduleService {

    void registerTag();
    void viewTag();
    void viewScheduleByTag();
    void achiveTag();
    void modifyTagName();
    void removeTag();

    void registerTodo();
    void viewTodo();
    void modifyTodo();
    void removeTodo();
}

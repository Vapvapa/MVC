package ru.varvara.model;

/**
 * Model should contain all business logic in the methods
 */
public interface Model {

    ModelData getModelData();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);

    void deleteUserById(long id);

    void changeUserData(String name, long id, int level);
}
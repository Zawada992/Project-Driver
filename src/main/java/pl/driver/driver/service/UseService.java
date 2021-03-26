package pl.driver.driver.service;

import pl.driver.driver.model.User;

import java.util.List;

public interface UseService {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void delete(Long id);

}

package me.crystal.demojpa3.post;

import java.util.List;

public interface PostCustomRepository<T> {
    List<Post> findMypost();

    void delete(T entity);
}

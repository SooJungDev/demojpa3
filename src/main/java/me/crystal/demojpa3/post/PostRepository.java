package me.crystal.demojpa3.post;

import me.crystal.demojpa3.MyRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends MyRepository<Post, Long> , QuerydslPredicateExecutor<Post> {
}

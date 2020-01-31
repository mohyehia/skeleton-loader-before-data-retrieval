package com.moh_yehia.skeletonLoader.dao;

import com.moh_yehia.skeletonLoader.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Post, Long> {
}

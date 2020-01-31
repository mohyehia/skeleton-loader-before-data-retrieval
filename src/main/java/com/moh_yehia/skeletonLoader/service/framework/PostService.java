package com.moh_yehia.skeletonLoader.service.framework;

import com.moh_yehia.skeletonLoader.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    Post save(Post post);
}

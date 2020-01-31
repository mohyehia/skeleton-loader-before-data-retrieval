package com.moh_yehia.skeletonLoader.service.implementation;

import com.moh_yehia.skeletonLoader.dao.PostDAO;
import com.moh_yehia.skeletonLoader.entity.Post;
import com.moh_yehia.skeletonLoader.service.framework.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostDAO postDAO;

    @Autowired
    public PostServiceImpl(PostDAO postDAO) {
        this.postDAO = postDAO;
    }

    @Override
    public List<Post> findAll() {
        return postDAO.findAll();
    }

    @Override
    public Post save(Post post) {
        return postDAO.save(post);
    }
}

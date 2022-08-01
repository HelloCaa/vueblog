package com.sny.vueblog.service.impl;

import com.sny.vueblog.entity.Blog;
import com.sny.vueblog.mapper.BlogMapper;
import com.sny.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sny
 * @since 2022-08-01
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

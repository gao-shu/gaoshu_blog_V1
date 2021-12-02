package com.gaoshu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gaoshu.common.PageEntity;
import com.gaoshu.entity.PO.Article;
import com.gaoshu.mapper.ArticleMapper;
import com.gaoshu.service.IArticleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gaoshu
 * @since 2021-11-30
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Override
    public List<Article> getArticleList(PageEntity page) {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Article::getCategoryId, page.getCategoryId());
        ArrayList<Article> articleList = new ArrayList<>();
        return articleList;
    }

    @Override
    public void addArticle(Article article) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public void deleteByIds(List<Integer> ids) {

    }
}

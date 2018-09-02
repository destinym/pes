package hello.repo;

import hello.model.Match;
import hello.model.Season;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mengliang on 2018/8/31.
 * Copyright (c) 2015年 Vipshop Holdings Limited. All rights reserved.
 */
public interface MatchRepository extends CrudRepository<Match, Integer> {

    Iterable<Match> findAllBySeasonId(Integer seasonId);
}

package hello.repo;

import hello.model.Season;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mengliang on 2018/8/31.
 * Copyright (c) 2015年 Vipshop Holdings Limited. All rights reserved.
 */
public interface SeasonRepository extends CrudRepository<Season, Integer> {

    Season findFirstByOrderByIdDesc();
//    Season findFirstByOrderByAsc();
}

package hello.repo;

import hello.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mengliang on 2018/8/31.
 * Copyright (c) 2015年 Vipshop Holdings Limited. All rights reserved.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}

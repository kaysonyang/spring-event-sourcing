package com.elasticjee.account;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 为{@link Account}领域类提供包括分页和排序等基本的管理能力
 *
 * @author chaokunyang
 * @create 2017/3/9
 */
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
    List<Account> findByUserId(@Param("userId") String userId);
}
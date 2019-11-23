package com.ab.preobserver.repository;

import com.ab.preobserver.domain.Authority;

/**
 * Spring Data Couchbase repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}

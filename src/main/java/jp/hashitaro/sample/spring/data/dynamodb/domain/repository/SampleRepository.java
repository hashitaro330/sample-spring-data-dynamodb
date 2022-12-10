package jp.hashitaro.sample.spring.data.dynamodb.domain.repository;


import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTable;
import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTableKey;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SampleRepository extends
        CrudRepository<SampleTable, SampleTableKey> {

}

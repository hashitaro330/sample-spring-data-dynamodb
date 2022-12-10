package jp.hashitaro.sample.spring.data.dynamodb.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTable;
import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTableKey;
import jp.hashitaro.sample.spring.data.dynamodb.domain.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    SampleRepository sampleRepository;

    @Override
    public SampleTable getSampleTable(SampleTableKey sampleTableKey) {
        return sampleRepository.findById(sampleTableKey).get();
    }

    @Override
    public List<SampleTable> getSampleTables() {
        List<SampleTable> sampleTables = new ArrayList<>();
        sampleRepository.findAll().iterator().forEachRemaining(sampleTables::add);
        return sampleTables;
    }

    @Override
    public SampleTable addSampleTable(SampleTable sampleTable) {
        sampleTable.setSamplePartitionKey(UUID.randomUUID().toString());
        sampleTable.setSampleSortKey("1");
        return sampleRepository.save(sampleTable);
    }

    @Override
    public SampleTable updateSampleTable(SampleTable sampleTable) {
        return sampleRepository.save(sampleTable);
    }

    @Override
    public SampleTable deleteSampleTable(SampleTableKey sampleTableKey) {
        SampleTable sampleTable = sampleRepository.findById(sampleTableKey).get();
        sampleRepository.deleteById(sampleTableKey);
        return sampleTable;
    }
}

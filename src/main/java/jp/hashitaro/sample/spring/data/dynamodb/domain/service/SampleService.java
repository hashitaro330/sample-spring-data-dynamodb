package jp.hashitaro.sample.spring.data.dynamodb.domain.service;


import java.util.List;

import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTable;
import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTableKey;

public interface SampleService {

    public SampleTable getSampleTable(SampleTableKey sampleTableKey);

    public List<SampleTable> getSampleTables();

    public SampleTable addSampleTable(SampleTable sampleTable);

    public SampleTable updateSampleTable(SampleTable sampleTable);

    public SampleTable deleteSampleTable(SampleTableKey sampleTableKey);
}

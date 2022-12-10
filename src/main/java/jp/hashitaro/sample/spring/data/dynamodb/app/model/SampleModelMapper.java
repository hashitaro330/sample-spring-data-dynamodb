package jp.hashitaro.sample.spring.data.dynamodb.app.model;

import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTable;
import jp.hashitaro.sample.spring.data.dynamodb.domain.model.SampleTableKey;

public interface SampleModelMapper {

    public static SampleTable map(SampleModel sampleModel) {
        return SampleTable.builder()
                .samplePartitionKey(sampleModel.getSamplePartitionKey())
                .sampleSortKey(sampleModel.getSampleSortKey())
                .sampleText(sampleModel.getSampleText())
                .build();
    }

    public static SampleTableKey mapToSampleTableKey(SampleModel sampleModel) {
        return SampleTableKey.builder()
                .samplePartitionKey(sampleModel.getSamplePartitionKey())
                .sampleSortKey(sampleModel.getSampleSortKey())
                .build();
    }
}

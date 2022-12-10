package jp.hashitaro.sample.spring.data.dynamodb.domain.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SampleTableKey implements Serializable {

    @DynamoDBHashKey
    private String samplePartitionKey;

    @DynamoDBRangeKey
    private String sampleSortKey;
}

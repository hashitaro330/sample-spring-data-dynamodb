package jp.hashitaro.sample.spring.data.dynamodb.domain.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@DynamoDBTable(tableName = "ma-hashimotoysn-sample-table")
public class SampleTable implements Serializable {

    @Id
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private SampleTableKey sampleTableKey;

    @DynamoDBHashKey
    private String samplePartitionKey;

    @DynamoDBRangeKey
    private String sampleSortKey;

    @DynamoDBAttribute
    private String sampleText;
}

package jp.hashitaro.sample.spring.data.dynamodb.app.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SampleModel implements Serializable {

    private String samplePartitionKey;
    private String sampleSortKey;
    private String sampleText;

}

/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.schema;

import java.util.Properties;

import io.debezium.common.annotation.Incubating;
import io.debezium.config.CommonConnectorConfig;
import io.debezium.relational.TableId;
import io.debezium.spi.schema.DataCollectionId;
import io.debezium.util.Collect;

/**
 * Determine data event topic names using {@link TableId#table()}.
 *
 * @author WANG MINCHAO
 */
@Incubating
public class LingXingTopicNamingStrategy extends AbstractTopicNamingStrategy<DataCollectionId> {

    public LingXingTopicNamingStrategy(Properties props) {
        super(props);
    }

    public static LingXingTopicNamingStrategy create(CommonConnectorConfig config) {
        return new LingXingTopicNamingStrategy(config.getConfig().asProperties());
    }

    @Override
    public String dataChangeTopic(DataCollectionId id) {
        String topicName = mkString(Collect.arrayListOf(prefix, ((TableId) id).table()), delimiter);
        return topicNames.computeIfAbsent(id, t -> sanitizedTopicName(topicName));
    }
}

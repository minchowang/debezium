/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.storage.rocksdb.history;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.debezium.annotation.ThreadSafe;
import io.debezium.relational.history.AbstractSchemaHistory;
import io.debezium.relational.history.HistoryRecord;
import io.debezium.relational.history.SchemaHistory;
import io.debezium.relational.history.SchemaHistoryException;

/**
 * A {@link SchemaHistory} implementation that stores the schema history in a rocksdb system.
 *
 * @author minchao wang
 */
@ThreadSafe
public final class RocksDBSchemaHistory extends AbstractSchemaHistory {
    private static final Logger LOGGER = LoggerFactory.getLogger(RocksDBSchemaHistory.class);

    @Override
    protected void storeRecord(HistoryRecord record) throws SchemaHistoryException {

    }

    @Override
    protected void recoverRecords(Consumer<HistoryRecord> records) {

    }

    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public boolean storageExists() {
        return false;
    }

    @Override
    public void resetStorage() {

    }
}

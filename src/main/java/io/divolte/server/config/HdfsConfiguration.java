package io.divolte.server.config;

import java.util.Optional;

import javax.annotation.ParametersAreNullableByDefault;

import com.fasterxml.jackson.annotation.JsonCreator;

@ParametersAreNullableByDefault
public final class HdfsConfiguration {
    public final Optional<String> uri;
    public final short replication;

    @JsonCreator
    private HdfsConfiguration(Optional<String> uri, short replication) {
        this.uri = uri;
        this.replication = replication;
    }

    @Override
    public String toString() {
        return "HdfsConfiguration [uri=" + uri + ", replication=" + replication + "]";
    }
}

package com.github.fnavalca.context.repository.find;

import java.util.Objects;

public class CodeRepository {
    private String name;

    public CodeRepository(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeRepository that = (CodeRepository) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

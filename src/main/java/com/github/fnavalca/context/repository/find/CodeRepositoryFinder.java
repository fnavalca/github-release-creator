package com.github.fnavalca.context.repository.find;

public class CodeRepositoryFinder {
    public CodeRepository find(String repositoryName) {
        return new CodeRepository(repositoryName);
    }
}

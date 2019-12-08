package com.github.fnavalca.context.repository.find;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CodeRepositoryFinderTest {

    private CodeRepositoryFinder finder = new CodeRepositoryFinder();

    @Test
    public void should_find_a_code_repository() {
        String repositoryName = "repository-name";
        CodeRepository expected = new CodeRepository(repositoryName);

        CodeRepository result = finder.find(repositoryName);

        assertThat(result, is(expected));
    }
}

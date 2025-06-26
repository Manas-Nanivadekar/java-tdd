package com.example.mockito.filetodb;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author selvy
 */
public interface MyFile
{
    public List<String> readAllLines(Path path, Charset cs);
}

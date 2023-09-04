package toygoogledrive.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import toygoogledrive.IndexerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexerApplication.class })
public class CucumberSpingConfiguration {}

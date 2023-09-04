package toygoogledrive.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import toygoogledrive.VideoProcessingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcessingApplication.class })
public class CucumberSpingConfiguration {}

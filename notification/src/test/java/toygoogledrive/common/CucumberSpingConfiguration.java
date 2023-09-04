package toygoogledrive.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import toygoogledrive.NotificationApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {}

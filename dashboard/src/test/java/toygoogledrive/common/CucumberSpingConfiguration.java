package toygoogledrive.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import toygoogledrive.DashboardApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboardApplication.class })
public class CucumberSpingConfiguration {}

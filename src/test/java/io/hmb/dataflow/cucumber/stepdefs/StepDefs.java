package io.hmb.dataflow.cucumber.stepdefs;

import io.hmb.dataflow.DataFlowServerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DataFlowServerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

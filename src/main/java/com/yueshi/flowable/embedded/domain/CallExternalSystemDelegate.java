package com.yueshi.flowable.embedded.domain;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author: yuesh1
 * create: 2023-02-21 14:46
 */
public class CallExternalSystemDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Calling the external system for employee " + delegateExecution.getVariable("employee"));
    }
}

package com.junmoyu.template.method.uml;

/**
 * @author James
 * @date 2021/4/25
 */
public class ConcreteClassTwo extends AbstractTemplateMethod {
    @Override
    public void abstractStepOne() {
        System.out.println("不一样的操作步骤 1");
    }

    @Override
    public void abstractStepTwo() {
        System.out.println("不一样的操作步骤 2");
    }

    @Override
    public void abstractStepThree() {
        System.out.println("不一样的操作步骤 2");
    }
}

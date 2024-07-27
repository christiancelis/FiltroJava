package stack.application;

import java.util.ArrayList;

import stack.domain.ServiceStack;
import stack.domain.Stack;

public class UseCaseGetAllStacks {
    ServiceStack serviceStack;

    public UseCaseGetAllStacks(ServiceStack serviceStack) {
        this.serviceStack = serviceStack;
    }

    public ServiceStack getServiceStack() {
        return serviceStack;
    }

    public ArrayList<Stack> execute(){
        return serviceStack.getAllStacks();
    }
}

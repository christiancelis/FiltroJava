package stack.application;



import stack.domain.ServiceStack;
import stack.domain.Stack;

public class UseCaseCreateStack {
    ServiceStack serviceStack;

    public UseCaseCreateStack(ServiceStack serviceStack) {
        this.serviceStack = serviceStack;
    }

    public void execute(Stack stack){
        serviceStack.createStack(stack);
    }
        
}

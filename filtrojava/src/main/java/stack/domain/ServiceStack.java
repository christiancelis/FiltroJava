package stack.domain;

import java.util.ArrayList;

public interface ServiceStack {
    void createStack(Stack stack);
    void deleteStack(int id);
    ArrayList<Stack> getAllStacks();
}



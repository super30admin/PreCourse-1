public class StackUsingArray
{
    private int[] stackArray;
    private int top;

    private int maxSize;

    public StackUsingArray(int size)
    {
        maxSize = size;
        stackArray = new int[size];
        top = -1;
    }

    public void Push(int value)
    {
        if (top == maxSize - 1)
        {
            throw new StackOverflowException("Stack is full.");
        }
        stackArray[++top] = value;
    }

    public int Pop()
    {
        if (top == -1)
        {
            throw new InvalidOperationException("Stack is empty.");
        }
        return stackArray[top--];
    }

    public int Peek()
    {
        if (top == -1)
        {
            throw new InvalidOperationException("Stack is empty.");
        }
        return stackArray[top];
    }

    public bool IsEmpty()
    {
        return top == -1;
    }
}
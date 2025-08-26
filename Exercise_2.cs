public class StackUsingLinkedList
{
    private LinkedList<int> stack;

    public StackUsingLinkedList()
    {
        stack = new LinkedList<int>();
    }

    public void Push(int value)
    {
        stack.AddFirst(value);
    }

    public int Pop()
    {
        if (this.IsEmpty())
        {
            return -1;
        }
        var value = stack.First?.Value ?? -1;
        stack.RemoveFirst();
        return value;
    }

    public int Peek()
    {
        return stack.First?.Value ?? -1;
    }

    public bool IsEmpty()
    {
        return stack.Count == 0;
    }
}
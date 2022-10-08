//stack using linked list
#include <iostream>
using namespace std;
struct node
{
    string data;
    node *next;
    node(string x, node* t)
    {
        data = x;
        next = t;
    }
};

typedef node * link;

class Stack
{
public:
    Stack();
    bool push (string str);
    bool pop ();
    bool isEmpty ();
    void ListAll();
    string top();
    unsigned short getSize();
private:
    link head;
    unsigned short size;
};

Stack::Stack()
{
    size = 0;
    head = NULL;
    cout << "A stack was created...!" << endl ;
}

string Stack::top ()
{
    if (head == NULL) return "N/A";
    return head->data;
}

bool Stack::push(string str)
{
    link NewItemPtr = new node(str,head);
    if ( NewItemPtr == NULL) return false;
    head = NewItemPtr;
    size++;
    return true;
}

bool Stack::pop()
{
    if (head == NULL) {        return false;    }

    cout << head->data << endl;

    link RemovePtr = head;
    head = head->next;
    delete RemovePtr;
    size--;
    return true;
}

void Stack::ListAll()
{
    link it = head;

    int i=0;
    while (it != NULL) {
        cout << it->data << " ";
        it = it->next;
        i++;
    }
    cout << endl;
}

int main(int argc, const char * argv[]) {

    Stack S;

    string tempStr;
    char sel = ' ';
    while (sel != 'e')
    {
        cout << "(p)ush, p(o)p, (t)op, (e)xit:   ";
        cin >> sel;
        switch (sel)
        {
        case 'p' :
            cout << "\nString to be pushed:";
            cin >> tempStr;
            S.push(tempStr);
            S.ListAll();
            break;
        case 'o' :
            S.pop();
            S.ListAll();
            break;

        case 't' :
            cout << S.top() << endl;
            break;
        default:
            break;
        }
    }
}

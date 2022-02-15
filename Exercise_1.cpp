#include<iostream>
using namespace std;

#define n 1000

class stack{

    int top;

    public:

    int arr[n];

    stack(){
        top=-1;
        for (int i=0; i<n; i++){
            arr[i]=0;
        }
    }



    bool push(int x){
        if (top==n-1){
            cout<<x<<" could not be pushed due to Stack overflow"<<endl;
            return top==n;
        }
        top++;
        arr[top]=x;
        return arr[top]==x;
    }

    int pop(){
        if (top==-1){
            cout<<"No element is present"<<endl;
            return -1;
        }
        top--;
        return arr[top+1];
    }

    int peek(){
        if (top==-1){
            cout<<"No elements are present"<<endl;
            return -1;
        }
        return arr[top];
    }

    bool isEmpty(){
        return top==-1;
    }
};

int main(){

    stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    cout<<st.peek()<<endl;
    st.pop();
    cout<<st.peek()<<endl;
    st.pop();
    st.pop();
    cout<<st.isEmpty()<<endl;

    return 0;
}
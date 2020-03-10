/ Time Complexity :
//Worst case: O(n)
// Space Complexity :
//O(1)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : N/A


// Your code here along with comments explaining your approach

//Stack is implemented using arrays where the size of the stack grows
//when we reach the end of allocated space

#include <iostream>
#include <string>
#include <vector>
#include <stdlib.h>
#include <math.h>
#include <stack>
using namespace std;


//Top points to the next available space on the stack
template <typename T>
struct stack_str{
    T * stack_ptr =NULL;
    unsigned int top;
    unsigned int max_capacity;
    unsigned int current_size;
};


template <typename T>
bool stack_push(stack_str<T> *monitored_stack_ptr, T value){
    //If stack is full , double the capacity of the stack.
    if (monitored_stack_ptr->current_size+1 >= monitored_stack_ptr->max_capacity){
        //reallocate the memory
        T * stack_ptr_new=NULL;
        stack_ptr_new = (T *)realloc((T *) monitored_stack_ptr->stack_ptr ,2 * monitored_stack_ptr->max_capacity*sizeof(T));
        //If the memory cannot be allocated
        if(stack_ptr_new  ==NULL){
          return false;
          }
        monitored_stack_ptr->stack_ptr = stack_ptr_new;
        monitored_stack_ptr->max_capacity*=2;
    }
    //Element is added and top is pointing to next empty location
     monitored_stack_ptr->stack_ptr[monitored_stack_ptr->top] = value;
     monitored_stack_ptr->top++;
     monitored_stack_ptr->current_size++;
     return true;
}



template <typename T>
bool stack_pop(stack_str<T> *monitored_stack_ptr){
    //edge case
    if (monitored_stack_ptr->current_size == 0){
        return false;
    }
    monitored_stack_ptr->top--;
    monitored_stack_ptr->current_size--;
    return true;
}

template <typename T>
T stack_peek(stack_str<T> *monitored_stack_ptr){
    //edge case
    if (monitored_stack_ptr->current_size == 0){
        return -1;
    }
    return monitored_stack_ptr->stack_ptr[monitored_stack_ptr->top];
}


template <typename T>
bool is_stack_empty (stack_str<T> *monitored_stack_ptr){
    if (monitored_stack_ptr->current_size == 0){
        return true;
    }
    return false;
}

template <typename T>
void display_stack(stack_str<T> *monitored_stack_ptr){
    unsigned int i=0;
    while(i < monitored_stack_ptr->current_size){
        cout<<monitored_stack_ptr->stack_ptr[i]<<"\t";
        i++;
    }
}


int main(){
     unsigned int num_of_variables = 2;
    //Memory allocated on the malloc for the stack
    int * int_ptr = (int *) malloc(num_of_variables * sizeof(int));
    
    stack_str<int> monitored_stack={int_ptr, 0, num_of_variables, 0};
    
    stack_str<int> * monitored_stack_ptr = &monitored_stack;
    
    bool is_func_implemented =0;
    
    is_func_implemented = stack_push(monitored_stack_ptr, 88);
    is_func_implemented = stack_push(monitored_stack_ptr, 71);
    is_func_implemented = stack_pop(monitored_stack_ptr);
    is_func_implemented = stack_pop(monitored_stack_ptr);
    is_func_implemented = stack_pop(monitored_stack_ptr);
    
    is_func_implemented = is_stack_empty(monitored_stack_ptr);
    
    cout <<is_func_implemented<<endl;
    
    display_stack(monitored_stack_ptr);
    cout<<"\n";
    return 0;
}
#include <bits/stdc++.h>
using namespace std;
#define null nullptr

struct node {
    int data;
    node *next;
};

node *head = new node;

// last element of the linked list
void print() {
    node *temp = head;
    if (temp == null) {
        cout << "List is empty" << endl;
        return;
    }
    while (temp->next != null) {
        temp = temp->next;
    }
    cout << temp->data << endl;
}

// print all the nodes
void print_all() {
    node *temp = head;
    cout << "Printing all the nodes ";
    while (temp != null) {
        cout << temp->data << " " ;
        temp = temp->next;
    }
    cout << endl;
}

// print the k-th element from the last in the linked list
void print_k(const int k) {
    node *temp = head;
    node *p = head;
    int count = k;
    if (temp == null) {
        cout << "List is empty" << endl;
        return;
    }

    while (p != null && count > 1) {
        p = p->next;
        count--;
    }

    if (p == null) {
        cout << "the list has fewer than " << k << " elements" << endl;
    } else {
        while (p->next != null) {
            p = p->next;
            temp = temp->next;
        }
    }
    cout << temp->data  << " " << endl;

}

// moving last node to the first position

void move() {
    node *temp = head;
    if (temp == null || temp->next == null) {
        cout << "no move needed" << endl;
        return;
    }

    node *p = null;
    while (temp->next != null) {
        p = temp;
        temp = temp->next;
    }

    p->next = null;
    temp->next = head;
    head = temp;

    // new head
    cout << "new head "<<  head->data << endl;
}

// insert at last

void insert(int data) {
    node *temp = head;
    if (temp == null) {
        head = new node;
        head->data = data;
        head->next = null;
    }

    while (temp->next != null) {
        temp = temp->next;
    }
    node *x = new node;
    temp->next = x;
    x->data = data;
    x->next = null;


}

// delete last

void del() {
    if (head == null) {
        cout << "list in empty";
        return;
    }

    if (head->next  == null) {
        delete head;
        head = null;
        return;
    }

    node *temp = head;
    node *p = null;

    while (temp->next != null) {
        p = temp;
        temp = temp->next;
    }
    delete p->next;
    p->next = null;
}

// delete last

void del_with_data(int data) {
    if (head == null) {
        cout << "list in empty";
        return;
    }

    if (head->data == data) {
        head = head->next;
        delete head;
        head = null;
        return;
    }

    node *temp = head;
    node *p = null;

    while (temp != null && temp->data != data) {
        p = temp;
        temp = temp->next;
    }

    if (temp == null) {
        cout << "Node with data " << data << " not found." << endl;
        return;
    }

    p->next = temp->next;
    delete temp;
}

int main () {

    head->data = 1;
    node* current = head;

    for (int i = 2; i <= 5; ++i) {
        current->next = new node{i, null};
        current = current->next;
    }

    // print();
    // print_k(2);
    // move();
    // insert(10);
    print_all();
    del();
    del_with_data(5);
    print_all();
    return 0;
}
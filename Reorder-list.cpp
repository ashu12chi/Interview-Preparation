/*author - Ashutosh Chitranshi*/
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;
/* Linked list Node */
struct Node {
    int data;
    struct Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};

void reorderList(struct Node* head);

/* Function to create a new Node with given data */
struct Node* newNode(int data) {
    struct Node* new_Node = new Node(data);
    new_Node->data = data;
    new_Node->next = NULL;
    return new_Node;
}

void printList(struct Node* Node) {
    while (Node != NULL) {
        printf("%d ", Node->data);
        Node = Node->next;
    }
    printf("\n");
}

void freeList(struct Node* head) {
    struct Node* temp;
    while (head != NULL) {

        temp = head;
        head = head->next;
        free(temp);
    }
}

int main(void) {
    int t, n, m, i, x;

    cin >> t;
    while (t--) {
        struct Node* temp, *head;
        cin >> n;
        cin >> x;
        head = new Node(x);
        temp = head;
        for (i = 0; i < n - 1; i++) {
            cin >> x;
            temp->next = new Node(x);
            temp = temp->next;
        }

        reorderList(head);
        printList(head);
        freeList(head);
    }
    return 0;
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }
};
*/
Node* reverse(Node* head) {
    if(head == NULL || head->next == NULL)
        return head;
    Node* prev = NULL;
    Node* curr = head;
    Node* next = head->next;
    while(true)
    {
        curr->next = prev;
        prev = curr;
        if(next == NULL)
            return curr;
        curr = next;
        next = next->next;
    }
}
void reorderList(Node* head) {
    // Your code here
    Node* slow = head;
    Node* fast = head;
    while(fast!=NULL && fast->next!=NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    Node* mid = slow;
    if(fast)
        mid = mid->next;
    Node* temp = head;
    while(temp->next!=mid)
    	temp = temp->next;
    temp->next = NULL;
    mid = reverse(mid);
    while(mid!=NULL)
    {
        Node* temp = head->next;
        head->next = mid;
        Node* temp2 = mid->next;
        mid->next = temp;
        head = temp;
        mid = temp2;
    }
}


#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* left;
    struct node* right;
};

    struct node* createNode(int data) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct node* insert(struct node* root, int data) {
    if (root == NULL) {
        return createNode(data);
    }

    if (data < root->data) {
        root->left = insert(root->left, data);
    } else if (data > root->data) {
        root->right = insert(root->right, data);
    }

    return root;
}

void inorderTraversal(struct node* root) {
    if (root == NULL) {
        return;
    }

    inorderTraversal(root->left);
    printf("%d ", root->data);
    inorderTraversal(root->right);
}

int main() {
    struct node* root = NULL;
    int x;

    printf("Enter node data (or -1 to stop): ");
    scanf("%d", &x);

    while (x != -1) {
        root = insert(root, x);
        printf("Enter node data (or -1 to stop): ");
        scanf("%d", &x);
    }

    printf("Inorder traversal of the binary search tree: ");
    inorderTraversal(root);

    return 0;
}


#include<stdio.h>
#include<conio.h>
struct stack
{
   int data;
   struct stack *next;
};

void push(struct stack **top,int value)
{
    struct stack *temp;
    temp=(struct stack*)malloc(sizeof(struct stack));
    temp->data=value;
    if(top==NULL)
    {
        *top=(temp);
        (*top)->next=NULL;
    }
    else
    {
        temp->next=top;
        *top=temp;
    }
}
int pop(struct stack **top)
{
    struct stack *temp;
    int value;
    temp=(*top);
    value=temp->data;
    printf("Value deleted is:%d",value);
    *top=temp->next;
    free(temp);
    return value;
}

void display(struct node **top)
{
    struct stack *temp;

    while(temp->next!=NULL)
    {
        printf(temp->data,"\n");
    }
}

int main()
{

    struct stack *top;
    top=NULL;
    int value,choice=0;
    printf("Enter the value : ");
    scanf("%d",&value);
    printf("%d \n","1. Initialisation");
    printf("%d \n","1. Deletion");
    scanf("%d",&choice);
    if(choice==1)
    {
         push(&top);
         display(NULL);
    }
    else if(choice==2)
    {
        pop(top);
        display(NULL);
    }

    else
    printf("Invalid choice");
    return 0;
}

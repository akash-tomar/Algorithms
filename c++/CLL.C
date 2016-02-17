#include<stdlib.h>
#include<stdio.h>
struct node
{
    int cid;
    struct node *link;
};


void atbeg(struct node **last,int id)
{
    //int ch;//,cid;
    struct node *n;
    n=(struct node*)malloc(sizeof(struct node));
    if(n==NULL)
        printf("Memrory Allocation Failed! ");

        if((*last)==NULL)
        {
            n->cid=id;
            n->link=NULL;
            n->link=n;
            *last=n;
        }

        else
        {
            n->cid=id;
            n->link=NULL;

            n->link=(*last)->link;
            (*last)->link=n;
        }



}

void atend(struct node **last,int id)
{
    struct node *n;
    n=(struct node*)malloc(sizeof(struct node));
    if(n==NULL)
        printf("Memrory Allocation Failed! ");
    if((*last)==NULL)
        {
            n->cid=id;
            n->link=NULL;
            n->link=n;
            *last=n;
        }
    else
        {
            n->cid=id;
            n->link=NULL;
            n->link=(*last)->link;
            (*last)->link=n;
            *last=n;
        }
}

void deletes(struct node **last)
{
    int id;
    printf("Enter the college id to be deleted : ");
    scanf("%d",&id);
    struct node *temp,*prev;
    temp=(*last)->link;
      while(temp!=NULL)
      {
          if((temp->cid==id)&&(temp==(*last)->link))
          {
              free(temp);

          }
       else
        if(temp->cid==id)
        {
            prev->link=temp->link;
         free(temp);

        }
        else
         {
             prev=temp;
          temp=temp->link;
         }
      }
}


void display(struct node **last)
{
    struct node *temp;
    temp=(*last)->link;
    while(temp!=(*last))
    {
        printf("%d \n",temp->cid);
        temp=temp->link;
    }

    printf("%d \n",(*last)->cid);
}

int main()
{
    int id; int ch=1;
    int choice=0;
    struct node *last;
    last=NULL;
    do
    {
        printf("Enter the id : ");
        scanf("%d",&id);
        printf("1. Add at beg?");
        printf("2. Add at end?");
        printf("Enter here : ");
        scanf("%d",&choice);
        if(choice==1)
        atbeg(&last,id);
        else if(choice==2)
        atend(&last,id);
        else
        printf("Invalid choice");

        printf("Do you wish to enter more? 1 or 0 : ");
        scanf("%d",&ch);
    }while(ch==1);

    display(&last);
    printf("Do you wish to delete some?");
    deletes(&last);
    display(&last);
    return 0;
}


#include<stdio.h>
//#include<sys/types.h>
#include<unistd.h>

int main()
{   int pid;
    pid = fork();
    if(pid == 0)
    {
        printf("hello from child.\n");
    }
    else
    {
        printf("%d\n",pid);
        printf("hello from parent.\n");
    }
    
    return 0;
}



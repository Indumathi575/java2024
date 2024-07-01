import java.util.*;
class Merge
{
Static void mergeSort(int a[],int n)
{
if(n<2)
return;
else
int mid=n/2;
int l[]=new int[mid];
int r[]=new int[n-mid];
for(int i=0;i<mid;i++)
{
l[i]=a[i];
}
for(int i=mid;i<n;i++)
{
r[i]=a[n-mid];
}
mergeSort(l,mid);
mergeSort(r,n-mid);
mergeSort(a,l,r,mid,n-mid);
}
static void merge(int a[],int l[],int r[],int left,int right)
{
int i=0,j=0,k=0;
while(i<left && j<right)
if(l[i]<r[j])
{
a[k]=l[i];
i++;
k++;
}
else
{
a[k]=r[j];
k++;
i++;
}
while(i<left)
{
a[k]=l[i];
k++;
i++;
}
while(j<right)
{
a[k]=r[j];
k++;
j++;
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int a[]=new int[m];
int i,j,k;
for(i=0;i<m;i++)
{
a[i]=s.nextInt();
}
}
}

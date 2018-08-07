public class cli1
{
public static void main(String[] args)
{
int n=0;
int sum=0;
if(args.length>0)
{
for(String val:args)
{
n=Integer.parseInt(val);
sum=sum+n;
System.out.println(n);
}
System.out.println(sum);
}
else
{
System.out.println("no");
}
}}
tutorial-04

Q1a
 ```
int n = 0;
while ((n + 1) * (n + 1) * (n + 1) < 2000) {
    n++;
}
System.out.println("n = " + n);
```

Q1b
```
for(int i=1;i<=20:i++){
    sout(i+"squared is"+i*i);
}
```

Q1c
```
Random cincai = new Random();
int[][]arr=new int[4][5];
for(int i=0;i<4;i++){
    for(int j=0;j<5;j++){
        arr[i][j]=cincai.nextInt(101);
        sout(arr[i][j]+"");
    }
    sout();
}
```

Q1d
```
int sum = 0;
for (int i = 1; i <= number; i++) {
    sum += i;
}
System.out.println("Sum of 1 to " + number + " = " + sum);
```

Q1e
```
double sum=0;
for(int i=1;i<=25;i++){
    sum+=(double)i/(26-i);
}
sout(sum)
```

=================================================

Q2a
x--, otherwise is infinite loop

Q2b
bracket, declare var+initialization

Q2c
```
int x,y;
for(x=1,y=20;x<y;x++,y-=2){
    System.out.println(x + " " + y);
}
```

Q2d
updation i++


===================================================

Q3
```
int[] arr= new int[10];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+"");
```

Q4
```
String terbalik="";
for(int i=sent.length()-1;i>=0;i--){
    terbalik+=sent.charAt(i);
}
System.out.println("Reverse : "+terbalik);
```
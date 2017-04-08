/**
 * Created by dell on 2017/3/26.
 */
/**
 * Created by dell on 2017/3/24.
 */
/**
 * Created by dell on 2017/3/23.
 */
import java.util.*;
public class suanfa {
    public static String myr(String r){        //对字符串（分数，a+"/"+b形式）进行判断
        Scanner a = new Scanner(System.in);
        String z=a.next();
        if(r.equals(z)){
            return ""+1;
        }else{
            return ""+0;
        }
    }
    public static int  myresult(int result) {       //对 加法，减法，乘法进行判断（整数判断）
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        if (result == n) {
            System.out.println("正确！");
            return 1;
        } else {
            System.out.println("错误！");
            return 0;
        }
    }
    public static String  yuefen(int A,int B){
        int m=0;
        int n=0;
        int a=0;
        if(A==0)
            return ""+0;
        if(A>=B){
            m=B;
        }else{
            m=A;
        }
        if(m<0){
            m=-m;
        }
        for(int i=1;i<=m;i++){
            if(A%i==0&&B%i==0){
                n=i;
            }else{
                a++;
            }
        }
        int X=A/n;
        int Y=B/n;
        if(Y==1)
            return ""+X;
        else
            return (X+"/"+Y);
    }
    public static void main(String args[]) {
        System.out.println("-----小学生四则运算-----");
        System.out.println("1.整数四则运算");
        System.out.println("2.分数四则运算");
        System.out.println("3.整数、分数混合运算");
        Scanner select = new Scanner(System.in);
        int m = select.nextInt();
        int result=0;
        String r="";
        double right = 0;
        double error = 0;
        if (m == 1) {
            Random a = new Random();
            for (int i = 1; i <=4; i++) {
                int  x = a.nextInt(10) % 10 + 1;
                int  y = a.nextInt(10) % 10 + 1;
                switch (i) {
                    case 1:
                        System.out.printf("加法："+x + "+" + y + "=");
                        result = (x + y);
                        if (myresult(result) == 1) {
                            right++;
                        }
                        else{
                            error++;
                        }
                        System.out.println("正确答案："+x + "+" + y + "="+result);
                        break;
                    case 2:
                        System.out.printf("减法："+x + "-" + y + "=");
                        result = x - y;
                        if (myresult(result) == 1) {
                            right++;
                        }
                        else{
                            error++;
                        }
                        System.out.println("正确答案："+x + "-" + y + "="+result);
                        break;
                    case 3:
                        System.out.printf("乘法："+x + "*" + y + "=");
                        result = x * y;
                        if (myresult(result) == 1) {
                            right++;
                        }
                        else{
                            error++;
                        }
                        System.out.println("正确答案："+x + "*" + y + "="+result);
                        break;
                    case 4:
                        System.out.printf("除法："+x + "/" + y + "=");
                        r =""+ yuefen(x,y);
                        String o=select.next();
                        if (r.equals(o)) {
                            System.out.println("正确！");
                            right++;
                        }
                        else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+x + "/" + y + "="+r);
                        break;
                }
            }
        }
        if(m==2){
            Random b = new Random();
            int   A,B;
            for(int i=1;i<=4;i++){
                int s=b.nextInt(10)%10+1;
                int t=b.nextInt(10)%10+1;
                int o=b.nextInt(10)%10+1;
                int p=b.nextInt(10)%10+1;
                switch(i){
                    case 1:
                        System.out.printf("加法："+"("+s+"/"+t+")"+"+"+"("+o+"/"+p+")"+"=");
                        A=s*p+o*t;
                        B=t*p;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+"("+s+"/"+t+")"+"+"+"("+o+"/"+p+")"+"="+yuefen(A,B));
                        break;
                    case 2:
                        System.out.printf("减法："+"("+s+"/"+t+")"+"-"+"("+o+"/"+p+")"+"=");
                        A=s*p-o*t;
                        B=t*p;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+"("+s+"/"+t+")"+"-"+"("+o+"/"+p+")"+"="+yuefen(A,B));
                        break;
                    case 3:
                        System.out.printf("乘法："+"("+s+"/"+t+")"+"*"+"("+o+"/"+p+")"+"=");
                        A=s*o;
                        B=t*p;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+"("+s+"/"+t+")"+"*"+"("+o+"/"+p+")"+"="+yuefen(A,B));
                        break;
                    case 4:
                        System.out.printf("除法："+"("+s+"/"+t+")"+"/"+"("+o+"/"+p+")"+"=");
                        A=s*p;
                        B=t*o;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+"("+s+"/"+t+")"+"/"+"("+o+"/"+p+")"+"="+yuefen(A,B));
                        break;
                }
            }
        }
        if(m==3){
            Random c = new Random();
            int   A,B;
            for(int i=1;i<=4;i++){
                int x=c.nextInt(10)%10+1;
                int y=c.nextInt(10)%10+1;
                int z=c.nextInt(10)%10+1;
                switch(i){
                    case 1:
                        System.out.printf("加法："+x+"+"+"("+y+"/"+z+")"+"=");
                        A=x*z+y;
                        B=z;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+x+"+"+"("+y+"/"+z+")"+"="+yuefen(A,B));
                        break;
                    case 2:
                        System.out.printf("减法："+x+"-"+"("+y+"/"+z+")"+"=");
                        A=x*z-y;
                        B=z;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+x+"-"+"("+y+"/"+z+")"+"="+yuefen(A,B));
                        break;
                    case 3:
                        System.out.printf("乘法："+x+"*"+"("+y+"/"+z+")"+"=");
                        A=x*y;
                        B=z;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+x+"*"+"("+y+"/"+z+")"+"="+yuefen(A,B));
                        break;
                    case 4:
                        System.out.printf("除法："+x+"/"+"("+y+"/"+z+")"+"=");
                        A=x*z;
                        B=y;
                        r=""+yuefen(A,B);
                        if(myr(r)==""+1){
                            System.out.println("正确！");
                            right++;
                        }else{
                            System.out.println("错误！");
                            error++;
                        }
                        System.out.println("正确答案："+x+"/"+"("+y+"/"+z+")"+"="+yuefen(A,B));
                        break;
                }
            }
        }
        System.out.println("正确率："+(right/4)*100+"%");
        System.out.println("错误率："+(error/4)*100+"%");
    }
}






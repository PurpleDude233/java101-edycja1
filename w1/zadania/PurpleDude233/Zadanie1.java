public class Zadanie1 {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4, ab, cd;
        ab=a+=b;
        cd=c+=d;
        double e=1.1, f=1.2, g=1.3, h=1.4, ef, gh;
        ef=e*=f;
        gh=g/=h;
        char i='a',j='A';
        String k="Ala", l="ma";
        boolean m=true, n=false;
        System.out.println(m && n);
        System.out.println(a+b+c+d+e+f+g+h+i+j+k+l+m+n+ab+cd+ef+gh);
    }
}